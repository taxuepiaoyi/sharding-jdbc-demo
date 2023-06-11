package com.bruce.shardingjdbcdemo.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
public class CourseDTO implements Serializable {

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
