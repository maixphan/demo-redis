package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRedisApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoRedisApplication.class,args);
		RedisImpl redis = new RedisImpl();
		redis.setData();
		redis.getData("fruit3");
	}

}
