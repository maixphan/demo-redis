package com.example.demo;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisConfig {
	private JedisPool jedisPool;
	public JedisPool jedisPool() {
		try{
			JedisPoolConfig poolCfg = new JedisPoolConfig();
			jedisPool= new JedisPool(poolCfg, "host.docker.internal", 6379, 5000);
			System.out.println("Connection Successful");

		}catch(Exception e) {
			System.out.println(e);
		}
		return jedisPool;
	}
}
