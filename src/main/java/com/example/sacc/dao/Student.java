package com.example.sacc.dao;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Student {
    private String name;
    private Integer id;
    private Integer teacherId;
}
