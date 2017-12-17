package com.nyh.seoulgodstore.store.service;

import com.nyh.seoulgodstore.store.model.Store;
import com.nyh.seoulgodstore.store.model.StoreRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface StoreService {
    public Page<Store> getStores(StoreRequest storeRequest);

    public Store getStore(int storeId);
}
