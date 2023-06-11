package com.bruce.shardingjdbcdemo;

import com.bruce.shardingjdbcdemo.dto.CourseDTO;
import com.bruce.shardingjdbcdemo.entity.Course;
import com.bruce.shardingjdbcdemo.mapper.CourseMapper;
import com.bruce.shardingjdbcdemo.service.CourseService;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@SpringBootTest
class ShardingJdbcDemoApplicationTests {

    @Autowired
    private CourseService courseService ;

    @Autowired
    private CourseMapper courseMapper ;

    @Test
    void saveCourseDTO(){
        CourseDTO courseDTO = CourseDTO.builder().build();;
        courseDTO.setCname("java");
        courseDTO.setUserId(100L);
        courseDTO.setCstatus("Normal");
        courseDTO.setCreateTime(LocalDateTime.now());
        courseService.saveCourse(courseDTO) ;
    }

    @Test
    void saveCourse(){
        Course course = Course.builder().build();;
        course.setCname("java");
        course.setUserId(100L);
        course.setCstatus("Normal");
        course.setCreateTime(LocalDateTime.now());
        courseMapper.insert(course) ;
    }
}
