package com.itheima.json;

import com.alibaba.fastjson.JSON;

public class FastJsonDemo {
    public static void main(String[] args) {
        //1.将java对象转为json字符串
        User user=new User();
        user.setId(1);
        user.setUsername("zhangsan");
        user.setPassword("123");

        String jsonString= JSON.toJSONString(user);
        System.out.println(jsonString);

        User u=JSON.parseObject("{\"id\":1,\"password\":\"123\",\"username\":\"zhangsan\"}",User.class);
        System.out.println(u);
    }
}
