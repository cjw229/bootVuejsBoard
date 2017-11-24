package com.nyh.seoulgodstore.article.repository;

import com.nyh.seoulgodstore.article.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{
}
