package com.practice_springboot_webservice_redis.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.testcontainers.containers.GenericContainer;

@SpringBootTest
class RedisRepositoryTest {
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	private static final String DOCKER_REDIS_IMAGE = "redis:6.2";
	
	public static GenericContainer REDIS_CONTAINER;
	
	static {
		REDIS_CONTAINER = new GenericContainer<>(DOCKER_REDIS_IMAGE)
				.withExposedPorts(6379)
				.withReuse(true);

		REDIS_CONTAINER.start();
	}
	
	@DisplayName("redis save 테스트")
	@Test
	void save() {
		redisTemplate.opsForValue().set("testkey", "value");
		Assertions.assertEquals(redisTemplate.opsForValue().get("testkey"),
				"value");
	}
	
}