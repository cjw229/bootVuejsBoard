package com.nyh.board.article.service;

import com.nyh.board.article.dto.ArticleDto;
import com.nyh.board.article.model.Article;

import java.util.List;

public interface ArticleService {
    public Article wrtieArticle(ArticleDto dto);

    public Article selectArticle(Long articleId);

    public List<Article> selectArticles();

    public void deleteArticle(Long articleId);
}
