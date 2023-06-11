package com.bruce.shardingjdbcdemo.service;

import com.bruce.shardingjdbcdemo.dto.CourseDTO;

public interface CourseService {

    Boolean saveCourse(CourseDTO courseDTO) ;

    CourseDTO findCourseById(Long cid) ;
}
