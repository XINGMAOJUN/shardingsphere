package com.xing.controller;


import com.xing.entity.UserInfo;
import com.xing.service.UserInfoServer;
import com.xing.common.ResponseContent;
import com.xing.common.ResponseMsg;
import com.xing.common.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: xingmaojun
 * @company: Persagy Technology Co.,Ltd
 * @since: 2021/3/20 11:18
 * @version: V1.0
 **/
@RestController
@RequestMapping
public class UserInfoController {

    @Autowired
    private UserInfoServer userInfoServer;

    @PostMapping("user/list1")
    public ResponseContent<List<UserInfo>> queryUserInfoList1(@RequestBody UserInfo userInfo) {
        String groupCode = userInfo.getGroupCode();
        String projectId = userInfo.getProjectId();
        List<UserInfo> userInfoList = userInfoServer.queryUserInfoList1(groupCode, projectId);
        return ResponseUtil.successContent(userInfoList);
    }

    @PostMapping("user/list2")
    public ResponseContent<List<UserInfo>> queryUserInfoList2(@RequestBody UserInfo userInfo) {
        String groupCode = userInfo.getGroupCode();
        String projectId = userInfo.getProjectId();
        List<UserInfo> userInfoList = userInfoServer.queryUserInfoList2(groupCode, projectId);
        return ResponseUtil.successContent(userInfoList);
    }

    @PostMapping("user/list3")
    public ResponseContent<List<UserInfo>> queryUserInfoList3(@RequestBody UserInfo userInfo) {
        String groupCode = userInfo.getGroupCode();
        String projectId = userInfo.getProjectId();
        List<UserInfo> userInfoList = userInfoServer.queryUserInfoList3(groupCode, projectId);
        return ResponseUtil.successContent(userInfoList);
    }

    @PostMapping("user/list4")
    public ResponseContent<List<UserInfo>> queryUserInfoList4(@RequestBody UserInfo userInfo) {
        String groupCode = userInfo.getGroupCode();
        String projectId = userInfo.getProjectId();
        List<UserInfo> userInfoList = userInfoServer.queryUserInfoList4(groupCode, projectId);
        return ResponseUtil.successContent(userInfoList);
    }


    @PostMapping("user/create")
    public ResponseMsg createUserInfo(@RequestBody UserInfo userInfo) {
        userInfoServer.createUserInfo(userInfo);
        return ResponseUtil.successMsg("success");
    }


    @PostMapping("user/update")
    public ResponseMsg updateUserInfo(@RequestBody UserInfo userInfo) {
        userInfoServer.updateUserInfo(userInfo);
        return ResponseUtil.successMsg("success");
    }


    @PostMapping("user/delete")
    public ResponseMsg deleteUserInfo(@RequestBody UserInfo userInfo) {
        String groupCode = userInfo.getGroupCode();
        String projectId = userInfo.getProjectId();
        String id = userInfo.getId();
        userInfoServer.deleteUserInfo(groupCode, projectId, id);
        return ResponseUtil.successMsg("success");
    }
}
