package com.nyh.board.util.publicApi.controller;

import com.nyh.board.util.publicApi.model.GoodStore;
import com.nyh.board.util.publicApi.service.GoodStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodStoreController {

    @Autowired
    GoodStoreService goodStoreService;

    @CrossOrigin
    @GetMapping("/goodStores")
    public List<GoodStore> getGoodStoreList(){
        return goodStoreService.getGoodstores();
    }

}
