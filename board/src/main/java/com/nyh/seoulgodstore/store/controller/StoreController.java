package com.nyh.seoulgodstore.store.controller;

import com.nyh.seoulgodstore.store.model.Store;
import com.nyh.seoulgodstore.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class StoreController {

    @Autowired
    StoreService storeService;

    @GetMapping("/api/stores")
    public List<Store> getStoreList(){
        return storeService.getStores();
    }

}
