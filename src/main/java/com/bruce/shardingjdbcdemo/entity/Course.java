package com.bruce.shardingjdbcdemo.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 课程实体类
 */
@Data
public class Course {

    /**
     * 课程Id
     */
    private Long cid ;

    /**
     * 课程名称
     */
    private String cname ;
    /**
     * 用户ID
     */
    private Long userId ;
    /**
     * 创建时间
     */
    private LocalDateTime createTime ;
    /**
     * 课程状态
     */
    private String cstatus ;
}
