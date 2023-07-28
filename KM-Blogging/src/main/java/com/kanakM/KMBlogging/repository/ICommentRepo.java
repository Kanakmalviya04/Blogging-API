package com.kanakM.KMBlogging.repository;

import com.kanakM.KMBlogging.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<Comment,Integer> {
}