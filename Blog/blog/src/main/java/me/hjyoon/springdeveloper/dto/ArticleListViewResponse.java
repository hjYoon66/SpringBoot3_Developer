package me.hjyoon.springdeveloper.dto;

import lombok.Getter;
import me.hjyoon.springdeveloper.domain.Article;

@Getter
public class ArticleListViewResponse {
    private final Long id;
    private final String title;
    private String content;

    public ArticleListViewResponse(Article article){
        this.id= article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
