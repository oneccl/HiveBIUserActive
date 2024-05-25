package com.cc.hivebiuseractive.controller;

import com.cc.hivebiuseractive.service.ActiveUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/23
 * Time: 19:06
 * Description:
 */

@CrossOrigin
@RestController
public class ActiveUserController {

    @Autowired
    private ActiveUserService activeUserService;

    @RequestMapping("getData")
    public Object getData(String dt){
        return activeUserService.getData(dt);
    }

}
