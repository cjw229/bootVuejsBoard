package com.nyh.seoulgodstore.store.model;

import java.util.*;
import java.util.stream.Collectors;

public enum StoreType {

    ALL("000", "전체"),
    KFOOD("001", "한식"),
    CFOOD("002", "중식"),
    JFOOD("003", "경양식, 일식"),
    OTHER_FOOD("004", "기타외식업(다방,패스트푸드등)"),
    BEAUTY("005", "이 미용업"),
    BATH("006", "목욕업"),
    LAUNDRY("007", "세탁업"),
    LODGMENT("008", "숙박업(호텔,여관)"),
    MOVIE("009", "영화관람"),
    VTR("010", "VTR대여"),
    KARAOKE("011", "노래방"),
    LEISURE("012", "수영장/볼링장/당구장/골프연습장"),
    OTHER_SERVICE("013", "기타서비스업종");

    private String code;
    private String name;

    StoreType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    /** 화면 단 select box 리스트
     * @return
     */
    public static List<Map> toArrayList(){

        return EnumSet.allOf(StoreType.class)
                .stream()
                .map(v -> {
                            Map item = new HashMap();
                            item.put("text", v.getName());
                            item.put("value", v.getCode());
                            return item;
                        }
                )
                .collect(Collectors.toList());
    }
}
