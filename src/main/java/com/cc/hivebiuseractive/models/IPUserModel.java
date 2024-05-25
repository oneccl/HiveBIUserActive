package com.cc.hivebiuseractive.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: CC
 * E-mail: 203717588@qq.com
 * Date: 2023/2/24
 * Time: 17:36
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IPUserModel {

    private List<String> hours;
    private List<Integer> hourCounts;

}
