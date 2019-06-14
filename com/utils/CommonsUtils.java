package com.utils;

import java.util.UUID;

/**
 * @Author: 夜雨听风
 * @Date: 2019-06-04 11:29
 * @Version 1.0
 */
public class CommonsUtils {

    //生成UUID
    public static int getUUID(){
        return Integer.parseInt(UUID.randomUUID().toString());
    }

}
