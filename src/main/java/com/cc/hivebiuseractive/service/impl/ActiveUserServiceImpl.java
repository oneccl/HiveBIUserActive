package com.cc.hivebiuseractive.service.impl;

import com.cc.hivebiuseractive.dao.ActiveUserDao;
import com.cc.hivebiuseractive.pojo.ActiveUser;
import com.cc.hivebiuseractive.service.ActiveUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/23
 * Time: 19:04
 * Description:
 */

@Service("activeUserService")
public class ActiveUserServiceImpl implements ActiveUserService {

    @Autowired
    private ActiveUserDao activeUserDao;

    @Override
    public ActiveUser getData(String dt) {
        return activeUserDao.getData(dt);
    }

}
