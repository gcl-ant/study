package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.ol.annotion.UserIdCheckMethod;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dto.GoodDto;
import com.pcl.onlineshop.dto.GoodImage;
import com.pcl.onlineshop.dto.InfoDto;
import com.pcl.onlineshop.dto.vo.ResponseBase;
import com.pcl.onlineshop.dto.vo.good.*;
import com.pcl.onlineshop.dto.vo.info.InfoOut;
import com.pcl.onlineshop.dto.vo.info.InfoVo;
import com.pcl.onlineshop.dto.vo.user.UserRequestIn;
import com.pcl.onlineshop.service.OlGoodService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.pcl.onlineshop.config.consts.WebConst.SUCCESS;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/good")
public class OlGoodController {

    @Autowired
    OlGoodService olGoodService;


    @PostMapping("/list")
    @UserIdCheckMethod
    public GoodOut getAllGoods() {
        GoodOut out = new GoodOut();

        try {
            List<GoodDto> goodDtos = olGoodService.getAllGoods();

            if (!CollectionUtils.isEmpty(goodDtos)) {

                out.setRequestResult("0");

                out.setGoodVos(OlBeanUtils.createCopy(goodDtos, GoodVo.class));

                out.getGoodVos().forEach(goodVo -> {
                    goodDtos.forEach(goodDto -> {
                        if (goodVo.getId() == goodDto.getId()) {

                            if (!ObjectUtils.isEmpty(goodDto.getNumber())) {
                                goodVo.setAmount(goodDto.getNumber());
                            }

                            if (!CollectionUtils.isEmpty(goodDto.getGoodImageList())) {
                                goodVo.setGoodImageList(OlBeanUtils.createCopy(goodDto.getGoodImageList()
                                        , GoodImages.class));
                            }
                        }
                    });
                });
                return out;
            }
        } catch (Exception ex) {
            throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_0702);
        }

        return out;
    }

    @RequestMapping(value = "/{id}", method = GET)
    @UserIdCheckMethod
    public GoodDetail getGoodByGoodId(@PathVariable(name = "id") String goodId) {

        if (StringUtils.hasLength(goodId)) {

            GoodDto goodDto = olGoodService.queryGoodDetailById(Integer.valueOf(goodId));
            GoodDetail out = OlBeanUtils.createCopy(goodDto, GoodDetail.class);

            out.setGoodImages(OlBeanUtils.createCopy(goodDto.getGoodImageList(), GoodImages.class));

            out.setRequestResult("0");
            return out;
        }
        throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_1601);
    }

    @PostMapping(value = "/update")
    @UserIdCheckMethod
    public ResponseBase logOut(@RequestBody GoodRequestIn goodRequestIn) {

        ResponseBase out = new ResponseBase();
        Boolean updateResult = olGoodService.changeGoodCondition(goodRequestIn.getId(), goodRequestIn.getStatus());

        if (updateResult) {
            out.setRequestResult("0");
            return out;

        }
        out.setRequestResult("99");
        return out;
    }

    @UserIdCheckMethod
    @PostMapping(value = "/express")
    public ResponseBase addCommentByTranId(@RequestBody GoodComment goodComment){

        ResponseBase requestOut = new ResponseBase();
        Integer integer = olGoodService.AddComment(goodComment.getContent(), goodComment.getTranId(),
                goodComment.getCommentRate());
        requestOut.setRequestResult(Integer.toString(integer));
        return requestOut;
    }

}
