package com.nyh.board.article.model;

import com.nyh.board.article.dto.ArticleDto;
import com.nyh.board.common.utill.LocalDateTimeConverter;
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
