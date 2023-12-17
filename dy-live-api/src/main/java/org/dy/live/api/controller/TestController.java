package org.dy.live.api.controller;


import org.apache.dubbo.config.annotation.DubboReference;
import org.dy.live.user.interfaces.IUserRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

//    @DubboReference
//    private IUserRpc iUserRpc;
//
//
//    @GetMapping("/test")
//    public String test() {
//        return iUserRpc.test();
//    }



}
