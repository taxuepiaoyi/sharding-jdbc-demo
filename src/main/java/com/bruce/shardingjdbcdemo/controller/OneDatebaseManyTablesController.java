package com.bruce.shardingjdbcdemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.bruce.shardingjdbcdemo.dto.CourseDTO;
import com.bruce.shardingjdbcdemo.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RefreshScope
@RequestMapping("oneDatebaseManyTables")
public class OneDatebaseManyTablesController {

    @Autowired
    private CourseService courseService ;

    @Value("${flag:false}")
    private Boolean flag ;

    @PostMapping("saveCourse")
    @ResponseBody
    public Boolean saveCourse(@RequestBody CourseDTO courseDTO){
        log.info("saveCourse. flag:{}...courseDTO = {}", flag,JSONObject.toJSONString(courseDTO));
        return courseService.saveCourse(courseDTO) ;
    }

}
