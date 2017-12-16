package com.nyh.seoulgodstore.store.controller;

import com.nyh.seoulgodstore.store.model.Store;
import com.nyh.seoulgodstore.store.model.StoreRequest;
import com.nyh.seoulgodstore.store.model.StoreType;
import com.nyh.seoulgodstore.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class StoreController {

    @Autowired
    StoreService storeService;

    @GetMapping("/api/stores/{storeType}/{page}/{size}")
    public Page<Store> getStoreList(@PathVariable String storeType, @PathVariable int page,@PathVariable int size ){
        return storeService.getStores(new StoreRequest(storeType, page, size));
    }

    @GetMapping("/api/storeType")
    public List<Map> getStoreType(){
        return StoreType.toArrayList();
    }

}
