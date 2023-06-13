package com.bruce.shardingjdbcdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 课程实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
