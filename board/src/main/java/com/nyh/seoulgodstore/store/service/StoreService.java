package com.nyh.seoulgodstore.store.service;

import com.nyh.seoulgodstore.store.model.Store;
import com.nyh.seoulgodstore.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    @Autowired
    StoreRepository storeRepository;

    public List<Store> getStores(){
        return storeRepository.findAll();
    }

}
