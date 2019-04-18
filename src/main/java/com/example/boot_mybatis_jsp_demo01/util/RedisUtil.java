package com.example.boot_mybatis_jsp_demo01.util;

import  redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis工具类
 *
 * @author guwenke
 * @date 2019-04-03 11:27
 **/
public class RedisUtil {

    /**
     * 缓存生存时间
     */
    private final int expire = 60000;
    /**
     * 操作key的方法
     */
    public Keys keys;
    /**
     * 对存储结构为String类型的操作
     */
    public Strings strings;
    /**
     * 对存储结构为List类型的操作
     */
    public Lists lists;
    /**
     * 对存储结构为Set类型的操作
     */
    public Sets sets;
    /**
     * 对存储结构为HashMap类型的操作
     */
    public Hash hash;
    /**
     * 对存储结构为Set(排序的)类型的操作
     */
    public SortSet sortSet;
    private static JedisPool jedisPool = null;

    public RedisUtil() {
    }

    static {
        JedisPoolConfig config = new JedisPoolConfig();
        // 控制一个pool可分配多少个jedis实例，通过pool.getResource()来获取；
        // 如果赋值为-1，则表示不限，如果pool已经分配maxActive个jedis实例，则此时pool的状态为exhausted。
        config.setMaxTotal(500);
        // 控制一个pool最多有多少个状态为idle（空闲）的jedis实例。
        config.setMaxIdle(5);
        // 表示当引入一个jedis实例时，最大的等待时间，如果超时，则直接抛出异常
        config.setMaxWaitMillis(1000 * 100);
        // 在引入一个jedis实例时，是否提前进行validate操作。
        config.setTestOnBorrow(true);
    }

    private class Keys {
    }

    private class Strings {
    }

    private class Lists {
    }

    private class Sets {
    }

    private class Hash {
    }

    private class SortSet {
    }
}