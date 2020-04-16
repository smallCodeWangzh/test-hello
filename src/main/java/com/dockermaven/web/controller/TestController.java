package com.dockermaven.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(tags = "测试的Controller")
public class TestController {

    @ApiOperation("/测试方法")
    @GetMapping("/test1")
    public ResponseEntity<String> test1() {
        return  ResponseEntity.ok("测试成功");
    }
}
