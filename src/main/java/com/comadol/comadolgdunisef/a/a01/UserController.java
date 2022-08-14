package com.comadol.comadolgdunisef.a.a01;

import com.comadol.comadolgdunisef.a.a01.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/test")
public class UserController {

    @Resource(name = "userService")
    private UserServiceImpl userService;

    @RequestMapping( value = "/test")
    public String test(){

        System.out.println(userService.test());
        return "comadol/a/a01/test";
    }
}
