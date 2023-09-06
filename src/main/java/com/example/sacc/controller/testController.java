package com.example.sacc.controller;

import com.example.sacc.dao.Student;
import com.example.sacc.dao.Teacher;
import com.example.sacc.mapper.StudentMapper;
import com.example.sacc.mapper.TeacherMapper;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

@RestController
public class testController {

    @Resource
    private StudentMapper studentMapper;
    @Resource
    private TeacherMapper teacherMapper;

    @GetMapping ("/test/{id}")
    public String test(@PathVariable(value = "id")Integer id){
        Student student = studentMapper.selectById(id);
        Teacher teacher = teacherMapper.selectById(student.getTeacherId());
        return student.getName()+"的老师是"+teacher.getName();
    }

    @PostMapping("/addTeacher")
    public void add(@Param("name")String name,@Param("id")Integer id){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        teacherMapper.insert(teacher);
    }

    @PostMapping("/addStudent")
    public void addStudent(@Param("name")String name,@Param("id")Integer id,@Param("teacherId")Integer teacherId){
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setTeacherId(teacherId);
       studentMapper.insert(s);
    }
}
