package com.pcl.onlineshop.controller.api;

import com.pcl.onlineshop.config.exception.OlRuntimeException;
import com.pcl.onlineshop.config.ol.annotion.UserIdCheckMethod;
import com.pcl.onlineshop.config.olenum.ErrorEnum;
import com.pcl.onlineshop.config.tool.OlBeanUtils;
import com.pcl.onlineshop.dto.InfoDto;
import com.pcl.onlineshop.dto.vo.info.InfoOut;
import com.pcl.onlineshop.dto.vo.info.InfoSeeOut;
import com.pcl.onlineshop.dto.vo.info.InfoVo;
import com.pcl.onlineshop.service.OlInfoService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.pcl.onlineshop.controller.api.OlUserController.LOGIN_USER_ID;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/mail")
public class OlInfoController {

    @Autowired
    OlInfoService olInfoService;

    @RequestMapping(value = "/list", method = GET)
    @UserIdCheckMethod
    public InfoOut getInfoList(HttpSession httpSession) {

        String userId = httpSession.getAttribute(LOGIN_USER_ID).toString();
        InfoOut out = new InfoOut();

        if (StringUtils.hasLength(userId)) {
            List<InfoDto> infoDtos = olInfoService.queryInfoByUserID(Integer.valueOf(userId));

            out.setRequestResult("0");
            if (!CollectionUtils.isEmpty(infoDtos)) {
                out.setInfoVos(OlBeanUtils.createCopy(infoDtos, InfoVo.class));
                return out;
            }

            return out;
        }
        throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_1601);
    }


    @RequestMapping(value = "/see/{id}", method = GET)
    @UserIdCheckMethod
    public InfoSeeOut getInfoByUserId(@PathVariable(name = "id") String infoId) {

        InfoSeeOut out = new InfoSeeOut();

        if (StringUtils.hasLength(infoId)) {
            InfoDto info = olInfoService.queryInfoById(Integer.valueOf(infoId));

            out.setRequestResult("0");

            if (!ObjectUtils.isEmpty(info)) {
                out.setInfoVo(OlBeanUtils.createCopy(info, InfoVo.class));
                return out;
            }

            return out;
        }
        throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_1601);
    }


    @RequestMapping(value = "/del/{id}", method = POST)
    public InfoOut delInfoById(@PathVariable(name = "id") String infoId) {
        InfoOut out = new InfoOut();
        if (StringUtils.hasLength(infoId)) {
            olInfoService.delInfoById(Integer.valueOf(infoId));
            out.setRequestResult("0");
            return out;
        }
        throw new OlRuntimeException(ErrorEnum.Ol_USER_ERROR_1701);
    }

}
