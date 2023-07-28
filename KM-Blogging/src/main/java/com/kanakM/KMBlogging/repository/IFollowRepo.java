package com.kanakM.KMBlogging.repository;

import com.kanakM.KMBlogging.model.Follow;
import com.kanakM.KMBlogging.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {
    List<Follow> findByCurrentUserAndCurrentUserFollower(User targetUser, User follower);
}
