package com.example.demo;

import java.util.HashSet;
import java.util.Set;
import redis.clients.jedis.HostAndPort;

public class RedisClusterConfig {
	public void redis_cluster_connection() {
		Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
		jedisClusterNodes.add(new HostAndPort("host.docker.internal", 6379));
		System.out.println("Connection Successful");
	}
}
