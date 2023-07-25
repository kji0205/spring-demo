package com.example.springdemo.dto;

import com.example.springdemo.domain.Article;

import lombok.Getter;

/**
 * ArticleResponse
 */
@Getter
public class ArticleResponse {

    private final String title;
    private final String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}