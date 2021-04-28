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
public class ResponseContent<T> {

    /**
     * 状态,success成功 failure失败
     */
    @JSONField(name = "Result")
    private EnumResult result;

    /**
     * 成功时返回的列表数据
     */
    @JSONField(name = "Content")
    private T content;

    /**
     * 成功时返回的列表数量
     */
    @JSONField(name = "Count")
    private Integer count;

    public ResponseContent(EnumResult result, T content, Integer count) {
        this.result = result;
        this.content = content;
        this.count = count;
    }
}
