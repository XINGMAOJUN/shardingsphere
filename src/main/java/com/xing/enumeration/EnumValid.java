package com.xing.enumeration;

/**
 * @author feng
 * @version 1.0
 * @description 故障状态
 * @since 2020/6/1 10:44
 */
public enum EnumValid {
    FALSE(0, false),
    TRUE(1, true);

    private Integer type;
    private Boolean desc;

    EnumValid(Integer type, Boolean desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getDesc() {
        return desc;
    }

    public void setDesc(Boolean desc) {
        this.desc = desc;
    }
}
