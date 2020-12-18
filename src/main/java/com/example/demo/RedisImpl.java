package com.example.demo;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisImpl {
	private RedisConfig redisConfig = new RedisConfig();
	private JedisPool jedisPool;

	public RedisImpl() {
		jedisPool = redisConfig.jedisPool();
	}

	public void setData() {
		try (Jedis jedis = jedisPool.getResource()) {
			//If field already exists, then this operation has no effect. If key does not exist,
			// then a new key holding a hash value is created before performing the set operation.
			jedis.hsetnx("fruit1", "name", "orange");
			jedis.hsetnx("fruit2", "name", "apple");
			jedis.hsetnx("fruit3", "name", "banana");
		}
	}

	public void getData(String key) {
		 try (Jedis jedis = jedisPool.getResource()) {
		        //Returns the value associated with one or more fields contained inside the hash value
	            System.out.println("Result stored in redis by key: "+ jedis.hmget(key, "name"));
		 }
	}
}
