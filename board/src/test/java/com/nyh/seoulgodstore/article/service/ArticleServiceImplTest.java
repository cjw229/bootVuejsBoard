package com.nyh.seoulgodstore.article.service;

import com.nyh.seoulgodstore.article.dto.ArticleDto;
import com.nyh.seoulgodstore.article.model.Article;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceImplTest {

    @Autowired
     ArticleService articleService;

    @Test
    public void 글작성() {
        //given
        ArticleDto dto = new ArticleDto("1", "1");

        //when
        Article article = articleService.wrtieArticle(dto);

        //then
        Assert.assertEquals(dto.getTitle(), article.getTitle());
    }


}