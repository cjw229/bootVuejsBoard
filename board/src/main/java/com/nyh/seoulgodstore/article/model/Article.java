package com.nyh.seoulgodstore.article.model;

import com.nyh.seoulgodstore.article.dto.ArticleDto;
import com.nyh.seoulgodstore.common.utill.LocalDateTimeConverter;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime createdDate;

    public Article() {
    }

    public Article(ArticleDto dto) {
        this.title = dto.getTitle();
        this.content = dto.getContent();
        this.createdDate = LocalDateTime.now();
    }


}
