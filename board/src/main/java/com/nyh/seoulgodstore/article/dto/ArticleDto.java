package com.nyh.seoulgodstore.article.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleDto {

    private String title;
    private String content;

    public ArticleDto() {
    }

    public ArticleDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
