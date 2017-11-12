package com.nyh.board.article.controller;

import com.nyh.board.article.dto.ArticleDto;
import com.nyh.board.article.model.Article;
import com.nyh.board.article.service.ArticleService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/api/article")
    public Long writeArticl(@RequestBody ArticleDto dto, HttpResponse response){
        Long articleId =  articleService.wrtieArticle(dto).getId();

        return articleId;
    }

    @GetMapping("/api/article/{articleId}")
    public Article readArticle(@PathVariable Long articleId){
        return articleService.selectArticle(articleId);
    }

}
