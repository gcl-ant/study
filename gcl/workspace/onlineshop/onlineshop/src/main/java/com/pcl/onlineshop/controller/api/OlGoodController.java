package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.ol.annotion.UserIdCheckMethod;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dto.GoodDto;
import com.pcl.onlineshop.dto.InfoDto;
import com.pcl.onlineshop.dto.vo.good.GoodDetail;
import com.pcl.onlineshop.dto.vo.good.GoodImages;
import com.pcl.onlineshop.dto.vo.info.InfoOut;
import com.pcl.onlineshop.dto.vo.info.InfoVo;
import com.pcl.onlineshop.service.OlGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class OlGoodController {

    @Autowired
    OlGoodService olGoodService;

    @RequestMapping(value = "/good/{id}", method = GET)
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


}
