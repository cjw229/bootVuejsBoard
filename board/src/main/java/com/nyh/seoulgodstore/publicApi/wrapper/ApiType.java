package com.nyh.seoulgodstore.publicApi.wrapper;

public enum ApiType {
    KFOOD("001"),
    CFOOD("002"),
    JFOOD("003"),
    OTHER_FOOD("004"),
    BEAUTY("005"),
    BATH("006"),
    LAUNDRY("007"),
    LODGMENT("008"),
    MOVIE("009"),
    VTR("010"),
    KARAOKE("011"),
    LEISURE("012"),
    OTHER_SERVICE("013");

    private String code;

    ApiType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
