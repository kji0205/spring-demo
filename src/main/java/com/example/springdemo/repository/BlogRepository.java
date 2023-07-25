package com.example.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdemo.domain.Article;

public interface BlogRepository extends JpaRepository<Article, Long> {
}