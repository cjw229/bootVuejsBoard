package com.nyh.seoulgodstore.store.model;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

/**
 * 리스트 페이지 request
 */
public class StoreRequest {

    private String storeType;

    private PageRequest pageRequest;

    public StoreRequest(String storeType, int currentPage, int size) {
        this.storeType = storeType;
        pageRequest = PageRequest.of(currentPage, size);
    }

    public boolean isFindAll(){
        return this.storeType.equalsIgnoreCase(StoreType.ALL.getCode());
    }

    public String getStoreType() {
        return storeType;
    }

    public PageRequest getPageRequest() {
        return pageRequest;
    }
}
