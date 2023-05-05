package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dto.InfoDto;
import com.pcl.onlineshop.dto.vo.info.InfoOut;
import com.pcl.onlineshop.dto.vo.info.InfoVo;
import com.pcl.onlineshop.service.OlInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/mail")
public class OlInfoController {

    @Autowired
    OlInfoService olInfoService;

    @RequestMapping(value = "/see/{id}", method = GET)
    public InfoOut getInfoByUserId(@PathVariable(name = "id") String userId) {

        InfoOut out = new InfoOut();


        if (StringUtils.hasLength(userId)) {
            List<InfoDto> infoDtos = olInfoService.queryInfoByUserID(Integer.valueOf(userId));

            out.setRequestResult("0");
            if (!CollectionUtils.isEmpty(infoDtos)){
                out.setInfoVos(OlBeanUtils.createCopy(infoDtos, InfoVo.class));
                return out;
            }

            return out;

        }
        throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_1601);
    }

}
