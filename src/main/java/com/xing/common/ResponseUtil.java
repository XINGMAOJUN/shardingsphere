package com.xing.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xing.enumeration.EnumResult;
import com.xing.enumeration.EnumResultCode;


import java.util.List;

/**
 * @description: 服务接口调用返回值工具类
 * @author: xingmaojun
 * @company: Persagy Technology Co.,Ltd
 * @since: 2020/9/21 11:01
 * @version: V1.0
 */
public class ResponseUtil {

    public static <T extends List> ResponseContent<T> successContent(T content) {
        return successContent(content, content.size());
    }

    public static <T> ResponseContent successContent(IPage page) {
        return successContent(page.getRecords(), Long.valueOf(page.getTotal()).intValue());
    }

    public static <T extends List> ResponseContent<T> successContent(T content, Integer count) {
        return new ResponseContent(EnumResult.success, content, count);
    }

    public static <T> ResponseItem<T> successItem(T object) {
        return new ResponseItem(EnumResult.success, object);
    }

    public static ResponseMsg successMsg(String resultMsg) {
        return new ResponseMsg(EnumResult.success, null, resultMsg);
    }

    public static ResponseMsg errorMsg(EnumResultCode resultCode) {
        return new ResponseMsg(EnumResult.failure, resultCode.getCode(), resultCode.getMsg());
    }

    public static ResponseMsg errorMsg(Integer resultCode, String resultMsg) {
        return new ResponseMsg(EnumResult.failure, resultCode, resultMsg);
    }
}
