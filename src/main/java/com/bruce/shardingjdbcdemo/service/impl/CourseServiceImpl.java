package com.bruce.shardingjdbcdemo.service.impl;

import com.bruce.shardingjdbcdemo.dto.CourseDTO;
import com.bruce.shardingjdbcdemo.entity.Course;
import com.bruce.shardingjdbcdemo.mapper.CourseMapper;
import com.bruce.shardingjdbcdemo.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper ;

    @Override
    public Boolean saveCourse(CourseDTO courseDTO) {
        Course course = Course.builder().build();
        BeanUtils.copyProperties(courseDTO,course);
        CourseDTO historyCourse = findCourseById(course.getCid()) ;
        if(historyCourse != null){
            courseMapper.updateCourse(course); ;
        }else{
            courseMapper.addCourse(course);
        }
        return Boolean.TRUE;
    }

    @Override
    public CourseDTO findCourseById(Long cid) {
        if(cid == null){
            return null ;
        }
        Course course = courseMapper.selectById(cid);
        if(course != null){
            CourseDTO courseDTO = CourseDTO.builder().build();
            BeanUtils.copyProperties(course,courseDTO);
            return courseDTO ;
        }
        return null;
    }
}
