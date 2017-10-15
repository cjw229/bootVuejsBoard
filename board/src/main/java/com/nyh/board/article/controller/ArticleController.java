package com.nyh.board.article.controller;

import com.nyh.board.article.dto.ArticleDto;
import com.sun.deploy.net.HttpResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @PostMapping("/api/Article")
    public void writeArticl(@RequestBody ArticleDto dto, HttpResponse response){


    }
}
