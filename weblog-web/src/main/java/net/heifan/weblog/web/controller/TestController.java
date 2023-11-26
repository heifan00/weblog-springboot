package net.heifan.weblog.web.controller;

import lombok.extern.slf4j.Slf4j;
import net.heifan.weblog.web.model.User;
import net.heifan.weblog.common.aspect.ApiOperationLog;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public User test(@RequestBody User user) {
        // 返参
        return user;
    }
}
