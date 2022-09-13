package com.example.demo.controller;

import com.example.demo.dto.userDto;
import com.example.demo.mapper.userMapper;
import com.example.demo.service.userService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class userController {

    private userMapper mapper;
    private Map<String, userDto> userMap;

    public userController(userMapper mapper){
        this.mapper = mapper;
    }

    @GetMapping("/user/{id}")
    public userDto getUserDto(@PathVariable("id") String id) {

        return mapper.getUserDto(id);
    }

    @GetMapping("/user/all")
    public List<userDto> getUserDtoAll(){

        return new ArrayList<userDto>(mapper.getUserDtoAll());
    }

    @PostMapping("/user/login")
    public void putUserDto(@RequestParam("id") String id ,@RequestParam("name") String name, @RequestParam("phone") String phone, @RequestParam("address") String address) {
        userDto ud = new userDto(id,name,phone,address);

        mapper.putUserDto(id,name,phone,address);

    }
    @DeleteMapping("/user/{id}")
    public void delUserDto(@PathVariable("id") String id){

        mapper.delUserDto(id);
    }
}
