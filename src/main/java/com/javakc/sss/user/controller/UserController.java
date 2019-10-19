package com.javakc.sss.user.controller;

import com.javakc.sss.user.entity.UserEntity;
import com.javakc.sss.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public String query(UserEntity entity, ModelMap map,
                        @RequestParam(required = false,defaultValue = "0") int offset,
                        @RequestParam(required = false,defaultValue = "10") int limit){
        Page<UserEntity> page=userService.queryByPage(entity,offset,limit);
        map.put("page",page);
        return "user/list";
    }

}
