package com.nyh.board.article.service;

import com.nyh.board.article.dto.ArticleDto;
import com.nyh.board.article.model.Article;
import com.nyh.board.article.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public Article wrtieArticle(ArticleDto dto) {
        Article article = new Article(dto);

        return articleRepository.save(article);
    }

    @Override
    public Article selectArticle(Long articleId) {
        return articleRepository.findById(articleId).get();
    }

    @Override
    public List<Article> selectArticles() {
        return articleRepository.findAll();
    }

    @Override
    public void deleteArticle(Long articleId) {
        articleRepository.deleteById(articleId);
    }
}
