package com.epam.task.fourth.entities;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


@XmlEnum
public enum CandieTypeList {
    @XmlEnumValue("caramel")
    caramel,
    @XmlEnumValue("chocolate")
    chocolate,
    @XmlEnumValue("fruity")
    fruity,
    @XmlEnumValue("other")
    other;

    public static CandieTypeList fromString(String name) {
        CandieTypeList[] values = CandieTypeList.values();
        for(CandieTypeList value : values) {
            String valueName = value.name();
            if (valueName.equals(name)){
                return value;
                }
            }
        return other;
        }
    }

