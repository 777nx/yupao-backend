package com.yupi.yupao.once;
import java.util.Date;

import com.yupi.yupao.mapper.UserMapper;
import com.yupi.yupao.model.domain.User;
import jakarta.annotation.Resource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
public class InsertUsers {

    @Resource
    private UserMapper userMapper;

    /**
     * 批量插入用户
     */
//    @Scheduled(initialDelay = 5000, fixedRate = Long.MAX_VALUE)
    public void doInsertUsers(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        final int INSERT_NUM = 10000000;
        for (int i = 0; i < INSERT_NUM; i++) {
            User user = new User();
            user.setUsername("假阿符");
            user.setUserAccount("fakefantasy");
            user.setAvatarUrl("https://lsky.777nx.cn/i/2025/03/29/avatar.webp");
            user.setGender(0);
            user.setUserPassword("12345678");
            user.setPhone("17812345678");
            user.setEmail("admin@qq.com");
            user.setTags("[]");
            user.setUserStatus(0);
            user.setUserRole(0);
            user.setPlanetCode("11111111");
            userMapper.insert(user);
        }
        stopWatch.stop();
        System.out.println(stopWatch.getTotalTimeMillis());
    }
}
