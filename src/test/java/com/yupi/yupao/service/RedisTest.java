package com.yupi.yupao.service;

import com.yupi.yupao.model.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void test() {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        // 增
        valueOperations.set("FantasyString", "dog");
        valueOperations.set("FantasyInt", 1);
        valueOperations.set("FantasyDouble", 2.0);
        User user = new User();
        user.setId(1L);
        user.setUsername("Fantasy");
        valueOperations.set("FantasyUser", user);
        // 查
        Object fantasy = valueOperations.get("FantasyString");
        Assertions.assertTrue("dog".equals((String) fantasy));
        fantasy = valueOperations.get("FantasyInt");
        Assertions.assertTrue(1 == (int) fantasy);
        fantasy = valueOperations.get("FantasyDouble");
        Assertions.assertTrue(2.0 == (double) fantasy);
        fantasy = valueOperations.get("FantasyUser");
        Assertions.assertTrue(user.equals(fantasy));
    }


}
