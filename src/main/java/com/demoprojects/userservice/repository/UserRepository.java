package com.demoprojects.userservice.repository;

import com.demoprojects.userservice.VO.ResponseTemplateVO;
import com.demoprojects.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserId(Long userId);
}
