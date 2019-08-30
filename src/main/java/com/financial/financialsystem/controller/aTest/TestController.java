package com.financial.financialsystem.controller.aTest;

import com.financial.financialsystem.entity.Pictures;
import com.financial.financialsystem.services.PictureService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class TestController {
    @Resource
    PictureService pService;

    @RequestMapping(value = "insurance1",method = RequestMethod.GET)
    public String insurance(Model model){
        String address1 = pService.getPicAddressByGidAndType12(9,2,0);
        String address2 = pService.getPicAddressByGidAndType12(10,3,1);
        model.addAttribute("p1",address1);
        model.addAttribute("jkp1",address2);

        return "insurance";
    }
    @RequestMapping(value = "insurance2",method = RequestMethod.GET)
    @ResponseBody
    public String insurance1(Model model){
        Pictures address1 = pService.test();
        model.addAttribute("p1",address1);
        String a = address1.getPic_address();
        return a;
    }
}
