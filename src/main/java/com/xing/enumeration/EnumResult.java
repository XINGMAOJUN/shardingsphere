package com.xing.enumeration;

/**
 * @description:
 * @author: xingmaojun
 * @company: Persagy Technology Co.,Ltd
 * @since: 2020/8/26 20:43
 * @version: V1.0
 **/
public enum EnumResult {

    success("success", "成功"),
    failure("failure", "失败");

    private String value;
    private String desc;

    EnumResult(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
