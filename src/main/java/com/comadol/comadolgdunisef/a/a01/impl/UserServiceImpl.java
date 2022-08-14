package com.comadol.comadolgdunisef.a.a01.impl;

import com.comadol.comadolgdunisef.a.a01.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    public String test() {
        return "nulltest";
    }
}
