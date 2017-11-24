package com.nyh.seoulgodstore.publicApi.wrapper;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.nyh.seoulgodstore.store.model.Store;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
public class ApiResult {

    @JsonProperty(value = "list_total_count")
    private int totCount;

    @JsonProperty(value = "RESULT")
    private Map result;

    @JsonProperty(value = "row")
    private List<Store> storeList;
}
