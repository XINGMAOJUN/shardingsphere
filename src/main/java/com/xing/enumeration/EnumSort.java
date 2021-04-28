package com.xing.enumeration;

/**
 * @author xingmaojun
 * @version V1.0
 * @EnumName EnumSort
 * @Description: 排序枚举
 * @date 2020/6/4 17:34
 **/
public enum EnumSort {

    DESC("DESC", "降序"),
    ASC("ASC", "升序");

    private String type;
    private String name;

    EnumSort(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public static EnumSort getEnumByType(String type) {
        for (EnumSort status : EnumSort.values()) {
            if (status.getType().equals(type)) {
                return status;
            }
        }
        return null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
