package com.xing.common;

import com.alibaba.fastjson.annotation.JSONField;

import com.xing.enumeration.EnumResult;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 服务接口调用返回值
 * @author: xingmaojun
 * @company: Persagy Technology Co.,Ltd
 * @since: 2020/9/21 11:01
 * @version: V1.0
 */
@Data
@NoArgsConstructor
public class ResponseItem<T> {

    /**
     * 状态,success成功 failure失败
     */
    @JSONField(name = "Result")
    private EnumResult result;

    /**
     * 成功时返回的对象数据
     */
    @JSONField(name = "Item")
    private T item;


    public ResponseItem(EnumResult result, T item) {
        this.result = result;
        this.item = item;
    }
}
