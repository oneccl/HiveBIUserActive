package com.cc.hivebiuseractive.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/23
 * Time: 19:00
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveUser {

    private String dt;
    private Long day;
    private Long week;
    private Long month;
    private String isWeekend;
    private String isMonthEnd;

}
