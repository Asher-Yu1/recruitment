package com.example.sacc.controller;

import com.example.sacc.dao.Student;
import com.example.sacc.dao.Teacher;
import com.example.sacc.mapper.StudentMapper;
import com.example.sacc.mapper.TeacherMapper;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class testController {

    @Resource
    private StudentMapper studentMapper;
    @Resource
    private TeacherMapper teacherMapper;

    @RequestMapping ("/test/{id}")
    public String test(@PathVariable(value = "id")Integer id){
        Student student = studentMapper.selectById(id);
        Teacher teacher = teacherMapper.selectById(student.getTeacherId());
        return student.getId()+"  "+student.getName()+"的老师是"+teacher.getName();
    }
}
