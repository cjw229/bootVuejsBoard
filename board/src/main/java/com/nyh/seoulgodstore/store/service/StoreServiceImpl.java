package com.nyh.seoulgodstore.store.service;

import com.nyh.seoulgodstore.store.model.Store;
import com.nyh.seoulgodstore.store.model.StoreRequest;
import com.nyh.seoulgodstore.store.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreRepository storeRepository;

    public Page<Store> getStores(StoreRequest request){

        if(request.isFindAll()){
            return storeRepository.findAll( request.getPageRequest() );
        }else{
            return storeRepository.findByIndutyCodeSe(request.getStoreType(), request.getPageRequest());
        }

    }

}
