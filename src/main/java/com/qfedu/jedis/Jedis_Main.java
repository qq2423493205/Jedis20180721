package com.qfedu.jedis;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class Jedis_Main {
    public static void main(String[] args) {
        //1、创建jedis对象
        Jedis jedis= new Jedis("47.98.164.171",6379);
        //2、认证密码
        jedis.auth("123");
        //3、连接
        jedis.connect();
        //4、使用
        Set<String> keys=jedis.keys("*");
        System.out.println("keys"+keys);
        System.out.println("set"+jedis.set("str1","困啊"));
        System.out.println("get"+jedis.get("str1"));
        jedis.expire("str1",30);
        System.out.println("ttl"+jedis.ttl("str1"));
        //断开连接
        jedis.disconnect();
    }
}
