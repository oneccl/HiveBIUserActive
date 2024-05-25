package com.cc.hivebiuseractive.dao;

import com.cc.hivebiuseractive.pojo.IPUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/24
 * Time: 16:53
 * Description:
 */
@Repository
public interface IPUserDao {

    List<IPUser> getData(String dt);

}
