package com.myspringmysql.springsql.repository;

import com.myspringmysql.springsql.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer> {
    Optional<UserModel> findUserByUserName(String username);
}
