package com.example.springdemo.service;

import java.util.List;

import com.example.springdemo.dto.UpdateArticleRequest;
import org.springframework.stereotype.Service;

import com.example.springdemo.domain.Article;
import com.example.springdemo.dto.AddArticleRequest;
import com.example.springdemo.repository.BlogRepository;

import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

/**
 * BlogService
 */
@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id) {
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void delete(long id){
        blogRepository.deleteById(id);
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest request) {
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found:" + id));
        article.update(request.getTitle(), request.getContent());
        return article;
    }
}