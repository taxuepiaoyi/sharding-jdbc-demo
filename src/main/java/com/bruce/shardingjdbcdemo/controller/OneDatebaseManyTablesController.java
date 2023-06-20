package com.bruce.shardingjdbcdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.bruce.shardingjdbcdemo.dto.CourseDTO;
import com.bruce.shardingjdbcdemo.dto.UserDTO;
import com.bruce.shardingjdbcdemo.entity.Course;
import com.bruce.shardingjdbcdemo.mapper.CourseMapper;
import com.bruce.shardingjdbcdemo.service.CourseService;
import com.bruce.shardingjdbcdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RefreshScope
@RequestMapping("oneDatebaseManyTables")
public class OneDatebaseManyTablesController {

    @Autowired
    private CourseService courseService ;

    @Value("${flag:false}")
    private Boolean flag ;

    @Autowired
    private UserService userService ;

    @Value("${spring.shardingsphere.datasource.mydb.type}")
    private String dataSourseStr ;

    @PostMapping("saveCourse")
    @ResponseBody
    public Boolean saveCourse(@RequestBody CourseDTO courseDTO){
        log.info("saveCourse. flag:{}...courseDTO = {}", flag,JSONObject.toJSONString(courseDTO));
        log.info("dataSourseStr = [{}]",dataSourseStr);
        Course course = Course.builder().build();
        BeanUtils.copyProperties(courseDTO,course);
        return courseService.saveCourse(courseDTO) ;
    }

    @GetMapping("queryAllUser")
    @ResponseBody
    public List<UserDTO> queryAllUser(){
        log.info("dataSourseStr = [{}]",dataSourseStr);
        return userService.queryAllUser() ;
    }


}
