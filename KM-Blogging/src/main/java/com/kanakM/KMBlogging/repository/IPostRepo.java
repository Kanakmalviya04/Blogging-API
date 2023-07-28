package com.kanakM.KMBlogging.repository;

import com.kanakM.KMBlogging.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}
