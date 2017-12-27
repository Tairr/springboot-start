package com.videonet.controller;

import com.videonet.util.TestStatic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author tangjinhui
 * @Description：
 * @date 2017/12/15
 */

@RestController
@RequestMapping("/test")
public class TestContrller {

    @RequestMapping("/testAdd")
    public List<String> testAdd(@RequestParam("val")String str){
        List<String> list = TestStatic.str;
        list.add(str);
        return list;
    }

    @RequestMapping("/testget")
    public List<String> tesGet(){
        List<String> list = TestStatic.str;
        return list;
    }

}
