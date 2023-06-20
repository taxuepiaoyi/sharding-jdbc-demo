package com.bruce.shardingjdbcdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户实体类
 */
@Data
@Builder
@TableName("user")
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    /**
     * 主键ID.
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private String userId;

    /**
     * 姓名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 性别 1-男性 2-女性
     */
    @TableField("sex")
    private int sex ;

    /**
     * 年龄
     */
    @TableField("sex")
    private int age ;

    /**
     * 记录状态 0-有效 1-无效
     */
    @TableField("status")
    private int status ;
}
