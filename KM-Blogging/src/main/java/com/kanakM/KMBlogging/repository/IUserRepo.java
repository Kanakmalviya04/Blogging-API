package com.kanakM.KMBlogging.repository;

import com.kanakM.KMBlogging.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
    User findFirstByUserEmail(String newEmail);
}
