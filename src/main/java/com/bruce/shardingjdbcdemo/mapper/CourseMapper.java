package com.bruce.shardingjdbcdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bruce.shardingjdbcdemo.entity.Course;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMapper extends BaseMapper<Course> {

    void addCourse(@Param("course") Course course) ;

    void updateCourse(@Param("course") Course course) ;
}
