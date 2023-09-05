package com.example.sacc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sacc.dao.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TeacherMapper extends BaseMapper<Teacher> {
}
