package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

// 사용자가 요청 -> 응답(HTML 파일)
//@Controller

// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpController {

    public String getTest(){
        return "";
    }
    public String postTest(){
        return null;
    }
    public String putTest(){
        return null;
    }
    public String delTest(){
        return null;
    }

}
