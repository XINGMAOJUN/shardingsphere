package com.xing.dao;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xing.entity.UserInfo;
import com.xing.mapper.UserInfoMapper;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: xingmaojun
 * @company: Persagy Technology Co.,Ltd
 * @since: 2021/3/20 10:51
 * @version: V1.0
 **/
@Repository
public class UserInfoDao extends ServiceImpl<UserInfoMapper, UserInfo> {
}
