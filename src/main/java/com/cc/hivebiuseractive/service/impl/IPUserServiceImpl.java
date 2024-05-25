package com.cc.hivebiuseractive.service.impl;

import com.cc.hivebiuseractive.dao.IPUserDao;
import com.cc.hivebiuseractive.pojo.IPUser;
import com.cc.hivebiuseractive.service.IPUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/24
 * Time: 16:56
 * Description:
 */
@Service("ipUserService")
public class IPUserServiceImpl implements IPUserService{

    @Autowired
    private IPUserDao ipUserDao;

    @Override
    public List<IPUser> getData(String dt) {
        return ipUserDao.getData(dt);
    }

}
