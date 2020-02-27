package com.wang.annotation;

import com.wang.annotation.SetPropertity;
import com.wang.annotation.SetTable;

/**
 *
 * @methodDesc: 功能描述:(用户实体类)
 * @author: 王帅发
 * @param: @return
 * @createTime:2020年2月27日
 * @returnType:@return String
 *
 */
@SetTable(value = "user_table")
public class UserEntity {
    @SetPropertity(name="user_name",len=12)
    private String name;
    @SetPropertity(name="user_age",len=12)
    private int  age;
}
