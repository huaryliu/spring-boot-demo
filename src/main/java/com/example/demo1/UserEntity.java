package com.example.demo1;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ：LiuJianhua
 * @date ：Created in 2020/9/17 15:01
 * @description :
 */
@Data
@Entity
public class UserEntity
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private String description;
}
