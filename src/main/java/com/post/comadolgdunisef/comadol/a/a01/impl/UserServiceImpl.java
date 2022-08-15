package com.post.comadolgdunisef.comadol.a.a01.impl;

import com.post.comadolgdunisef.comadol.a.a01.UserService;
import com.post.comadolgdunisef.comadol.a.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    //@Resource(name = "")
   // @Resource(name = "userDao") //(required=false)

   // @Resource(name = "userMapper")
   @Autowired
    private UserMapper userMapper;

    @Override
    public String test() {
        return userMapper.test();
    }
}
