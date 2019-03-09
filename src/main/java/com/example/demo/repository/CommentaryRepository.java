package com.example.demo.repository;

import com.example.demo.model.CommentaryEntity;
import org.springframework.data.repository.CrudRepository;

public interface CommentaryRepository extends CrudRepository<CommentaryEntity,String> {
}
