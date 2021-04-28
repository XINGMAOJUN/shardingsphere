package com.xing.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.xing.config.DataSourceConfig;
import com.xing.dao.UserInfoDao;
import com.xing.entity.UserInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @description:
 * @author: xingmaojun
 * @company: Persagy Technology Co.,Ltd
 * @since: 2021/3/20 11:18
 * @version: V1.0
 **/

@Service
public class UserInfoServer {

    @Autowired
    private UserInfoDao userInfoDao;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @DS(DataSourceConfig.MASTER)
    public List<UserInfo> queryUserInfoList1(String groupCode, String projectId) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper();
        if (StringUtils.isNotBlank(groupCode)) {
            queryWrapper.lambda().eq(UserInfo::getGroupCode, groupCode);
        }
        if (StringUtils.isNotBlank(projectId)) {
            queryWrapper.lambda().eq(UserInfo::getProjectId, projectId);
        }
        return userInfoDao.list(queryWrapper);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @DS(DataSourceConfig.SLAVE)
    public List<UserInfo> queryUserInfoList2(String groupCode, String projectId) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper();
        if (StringUtils.isNotBlank(groupCode)) {
            queryWrapper.lambda().eq(UserInfo::getGroupCode, groupCode);
        }
        if (StringUtils.isNotBlank(projectId)) {
            queryWrapper.lambda().eq(UserInfo::getProjectId, projectId);
        }
        return userInfoDao.list(queryWrapper);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @DS(DataSourceConfig.SHARDING)
    public List<UserInfo> queryUserInfoList3(String groupCode, String projectId) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper();
        if (StringUtils.isNotBlank(groupCode)) {
            queryWrapper.lambda().eq(UserInfo::getGroupCode, groupCode);
        }
        if (StringUtils.isNotBlank(projectId)) {
            queryWrapper.lambda().eq(UserInfo::getProjectId, projectId);
        }
        return userInfoDao.list(queryWrapper);
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @DS(DataSourceConfig.H2)
    public List<UserInfo> queryUserInfoList4(String groupCode, String projectId) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper();
        if (StringUtils.isNotBlank(groupCode)) {
            queryWrapper.lambda().eq(UserInfo::getGroupCode, groupCode);
        }
        if (StringUtils.isNotBlank(projectId)) {
            queryWrapper.lambda().eq(UserInfo::getProjectId, projectId);
        }
        return userInfoDao.list(queryWrapper);
    }

    public void createUserInfo(UserInfo userInfo) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper();
        UserInfo userInfo1 = new UserInfo();
        BeanUtils.copyProperties(userInfo, userInfo1);
        userInfoDao.save(userInfo1);
    }

    public void updateUserInfo(UserInfo userInfo) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().eq(UserInfo::getGroupCode, userInfo.getGroupCode());
        queryWrapper.lambda().eq(UserInfo::getProjectId, userInfo.getProjectId());
        UserInfo userInfo1 = new UserInfo();
        BeanUtils.copyProperties(userInfo, userInfo1);
        userInfoDao.update(userInfo1, queryWrapper);
    }

    public void deleteUserInfo(String groupCode, String projectId, String id) {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper();
       // queryWrapper.lambda().eq(UserInfo::getGroupCode, groupCode);
       // queryWrapper.lambda().eq(UserInfo::getProjectId, projectId);
        queryWrapper.lambda().eq(UserInfo::getId, id);
        userInfoDao.remove(queryWrapper);
    }
}
