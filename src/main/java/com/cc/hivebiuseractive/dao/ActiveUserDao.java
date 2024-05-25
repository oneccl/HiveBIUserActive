package com.cc.hivebiuseractive.dao;

import com.cc.hivebiuseractive.pojo.ActiveUser;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/23
 * Time: 19:02
 * Description:
 */
@Repository
public interface ActiveUserDao {

    ActiveUser getData(String dt);

}
