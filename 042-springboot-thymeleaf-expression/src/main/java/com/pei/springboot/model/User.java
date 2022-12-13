package com.pei.springboot.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;

    private String username;

    private Integer age;

}
