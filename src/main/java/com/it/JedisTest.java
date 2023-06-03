package com.it;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.11.130", 6379);
        jedis.lpush("list1","a","b");

        Set<String> keys = jedis.keys("*");
        System.out.println(keys);
        jedis.close();
    }
}
