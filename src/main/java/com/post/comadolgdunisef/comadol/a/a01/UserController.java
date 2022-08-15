package com.post.comadolgdunisef.comadol.a.a01;

import com.post.comadolgdunisef.comadol.a.a01.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/test")
public class UserController {

    @Resource(name = "userService")
    private UserServiceImpl userService;

    @RequestMapping( value = "/test")
    public String test(){
        ModelMap map = new ModelMap();
        map.addAttribute("test",userService.test());
        //map.put(userService.test());
        return "comadol/a/a01/test";
    }
}
