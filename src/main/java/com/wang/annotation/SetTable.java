package com.wang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @methodDesc: 功能描述:(自定义表映射注解)
 * @author: 王帅发
 * @param: @return
 * @createTime:2020年2月27日
 * @returnType:@return String
 *
 */
@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SetTable {
    /**
     *
     * @methodDesc: 功能描述:(对应数据库表名称)
     * @author: 王帅发
     * @param: @return
     * @createTime:2020年2月27日
     * @returnType:@return String
     *
     */

    String value();

}
