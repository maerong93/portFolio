package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.ConstructorArgs;

@Getter
@Setter
public class clientDto {
    private int id;
    private String username;
    private String password;
    private String email;

    public clientDto(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
