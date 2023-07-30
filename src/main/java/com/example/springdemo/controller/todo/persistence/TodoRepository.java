package com.example.springdemo.controller.todo.persistence;

import com.example.springdemo.controller.todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {

    @Query("select t from TodoEntity t where t.userId = ?1")
    List<TodoEntity> findByUserIdQuery(String userId);

    List<TodoEntity> findByUserId(String userId);
}
