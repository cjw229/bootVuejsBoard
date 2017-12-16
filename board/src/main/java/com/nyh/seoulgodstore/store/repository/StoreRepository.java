package com.nyh.seoulgodstore.store.repository;

import com.nyh.seoulgodstore.store.model.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StoreRepository extends PagingAndSortingRepository<Store, Long> {
    public Page<Store> findByIndutyCodeSe(String storeType, Pageable pageable);
}
