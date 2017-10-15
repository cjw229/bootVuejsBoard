package com.nyh.board.util.publicApi.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    private List<GoodStore> storeList;
}
