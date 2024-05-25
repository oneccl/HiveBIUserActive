package com.cc.hivebiuseractive.controller;

import com.cc.hivebiuseractive.models.IPUserModel;
import com.cc.hivebiuseractive.pojo.IPUser;
import com.cc.hivebiuseractive.service.IPUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/24
 * Time: 16:57
 * Description:
 */
@CrossOrigin
@RestController
public class IPUserController {

    @Autowired
    private IPUserService ipUserService;

    @RequestMapping("getDtData")
    public Object getDtData(String dt){
        List<IPUser> dayUsers = ipUserService.getData(dt);
        List<String> hours = new ArrayList<>();
        List<Integer> hourCounts = new ArrayList<>();
        for (IPUser data : dayUsers) {
            hours.add(data.getHour());
            hourCounts.add(data.getHourCount());
        }
        return new IPUserModel(hours,hourCounts);
    }

}
