package com.benchmark.vertxsample.config

import io.vertx.core.Vertx
import io.vertx.redis.RedisClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RedisConfig {

    @Autowired
    private Vertx vertx

    @Bean("redis")
    RedisClient redisClient() {
        RedisClient.create(vertx)
    }

}
