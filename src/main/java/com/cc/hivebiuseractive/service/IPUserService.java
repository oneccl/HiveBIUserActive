package com.cc.hivebiuseractive.service;

import com.cc.hivebiuseractive.pojo.IPUser;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/24
 * Time: 16:55
 * Description:
 */
public interface IPUserService {

    List<IPUser> getData(String dt);

}
