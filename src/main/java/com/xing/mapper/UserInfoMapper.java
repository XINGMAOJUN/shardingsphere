package com.xing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xing.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author: xingmaojun
 * @company: Persagy Technology Co.,Ltd
 * @since: 2021/3/20 10:50
 * @version: V1.0
 **/
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
