package com.cc.hivebiuseractive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/24
 * Time: 16:50
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IPUser {

    private String dt;
    private String hour;
    private Integer hourCount;
    private Long hourUpSum;
    private Long hourDownSum;

}
