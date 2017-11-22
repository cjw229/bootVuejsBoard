package com.nyh.board.util.publicApi.service;

import com.nyh.board.util.publicApi.model.GoodStore;
import com.nyh.board.util.publicApi.repository.GoodStoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodStoreService {

    @Autowired
    GoodStoreRepository goodStoreRepository;

    public List<GoodStore> getGoodstores(){
        return goodStoreRepository.findAll();
    }

}
