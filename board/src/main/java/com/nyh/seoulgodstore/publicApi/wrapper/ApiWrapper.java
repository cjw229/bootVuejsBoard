package com.nyh.seoulgodstore.publicApi.wrapper;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonAutoDetect(getterVisibility= JsonAutoDetect.Visibility.NONE)
public class ApiWrapper {
    @JsonProperty(value = "ListPriceModelStoreService")
    ApiResult apiResult;

}
