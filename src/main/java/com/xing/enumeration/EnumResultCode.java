package com.xing.enumeration;


import com.xing.constant.ResultCodeConstant;

/**
 * @author xingmaojun
 * @version V1.0
 * @EnumName EnumResultCode
 * @Description:
 * @date 2020/6/1 20:17
 **/
public enum EnumResultCode {

    RCC_PARAMETER_INVALID(ResultCodeConstant.RCC_PARAMETER_INVALID, "请求参数无效！"),
    RCC_PARAMETER_IS_NULL(ResultCodeConstant.RCC_PARAMETER_IS_NULL, "参数为空！"),
    RCC_REQUEST_EXCEPTION(ResultCodeConstant.RCC_REQUEST_EXCEPTION, "请求异常!"),
    RCC_API_ALREADY_DEPRECATED(ResultCodeConstant.RCC_API_ALREADY_DEPRECATED, "接口已经废弃!");

    private int code;
    private String msg;

    EnumResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
