package com.xing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: xingmaojun
 * @company: Persagy Technology Co.,Ltd
 * @since: 2021/3/20 10:45
 * @version: V1.0
 **/
@Data
@NoArgsConstructor
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@TableName(value = "user_info",autoResultMap = true)
public class UserInfo extends Model<UserInfo> implements Serializable {

    //主键
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    //集团编码
    private String groupCode;

    // 项目id
    private String projectId;

    //名字
    private String name;

    //年龄
    private Integer age;

    //性别
    private String sex;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;
}
