package com.example.sacc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sacc.dao.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface StudentMapper extends BaseMapper<Student> {

}