package com.wang.annotation;

import java.lang.reflect.Field;

/**
 *
 * @methodDesc: 功能描述:(使用java自定义注解，模拟ORM框架注解)
 * @author: 王帅发
 * @param: @return
 * @createTime:2020年2月27日
 * @returnType:@return String
 *
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //反射Class
        Class<?> forName = Class.forName("com.wang.annotation.UserEntity");
        //getAnnotations当前类使用哪些注解
       /* Annotation[] annotations = forName.getAnnotations();
        for ( Annotation annotation:annotations) {
            System.out.println(annotation);
        }*/
       //getAnnotation 当前类使用的某个注解对象
        /*com.wang.annotation.SetPropertity forNameAnnotation = forName.getAnnotation(com.wang.annotation.SetPropertity.class);
        System.out.println(forNameAnnotation);*/

        //获取表名称注解
        Field[] declaredFields = forName.getDeclaredFields();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("select ");
        for (int i = 0; i < declaredFields.length; i++) {
           // declaredFields[i].setAccessible(true);
            SetPropertity setPropertity = declaredFields[i].getAnnotation(SetPropertity.class);
           // String id = setPropertity.id();
            String name = setPropertity.name();
            stringBuffer.append(name);
            if (i == declaredFields.length-1) {
                stringBuffer.append(" from");
            }
            else{
                stringBuffer.append(",");
            }
        }
        //获取表名
        SetTable setTable = forName.getAnnotation(SetTable.class);
        String tablName = setTable.value();
        stringBuffer.append(" "+tablName);
        System.out.println(stringBuffer.toString());

    }
}
