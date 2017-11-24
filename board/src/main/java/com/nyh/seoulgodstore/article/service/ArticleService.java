package com.nyh.seoulgodstore.article.service;

import com.nyh.seoulgodstore.article.dto.ArticleDto;
import com.nyh.seoulgodstore.article.model.Article;

import java.util.List;

public interface ArticleService {
    public Article wrtieArticle(ArticleDto dto);

    public Article selectArticle(Long articleId);

    public List<Article> selectArticles();

    public void deleteArticle(Long articleId);
}
