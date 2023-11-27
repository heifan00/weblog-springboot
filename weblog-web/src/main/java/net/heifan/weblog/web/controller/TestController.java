package net.heifan.weblog.web.controller;

import lombok.extern.slf4j.Slf4j;
import net.heifan.weblog.common.enums.ResponseCodeEnum;
import net.heifan.weblog.common.exception.BizException;
import net.heifan.weblog.common.utils.Response;
import net.heifan.weblog.web.model.User;
import net.heifan.weblog.common.aspect.ApiOperationLog;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response test(@RequestBody @Validated User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // 获取校验不通过字段的提示信息
            String errorMsg = bindingResult.getFieldErrors()
                    .stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .collect(Collectors.joining(", "));
            return Response.fail(errorMsg);
        }
        // 返参
        return Response.success();
    }
}
