package cn.h1mars.start.controller;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @RequestMapping("/test")
    @ResponseBody
    public String test(String param){
        Splitter.on(";").split(param).forEach(System.out::println);
        return "test";
    }
}
