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
public class ResponseMsg {

    /**
     * 状态,success成功 failure失败
     */
    @JSONField(name = "Result")
    private EnumResult result;

    /**
     * 响应码
     */
    @JSONField(name = "ResultCode")
    private Integer resultCode;

    /**
     * 错误信息
     */
    @JSONField(name = "ResultMsg")
    private String resultMsg;

    public ResponseMsg(EnumResult result, Integer resultCode, String resultMsg) {
        this.result = result;
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }
}
