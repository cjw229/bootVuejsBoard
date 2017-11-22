package com.nyh.board.util.publicApi.util;

import com.nyh.board.util.publicApi.controller.PublicApiController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Component
public class ApiInit {

    @Autowired
    PublicApiController apiController;

    @PostConstruct
    public void init(){
        try {
            apiController.getGoodStoreList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
