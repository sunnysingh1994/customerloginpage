package com.example.customerpage.customerloginpage.repository;

import com.example.customerpage.customerloginpage.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Integer> {

    @Query("SELECT u FROM Users u join u.roles r WHERE u.username = :username and r.roleName='USER'")
    public List<Users> findUser(@Param("username") String username);

    @Query("SELECT u FROM Users u join u.roles r WHERE u.username = :username and r.roleName='ADMIN'")
    public List<Users> findAdmin(@Param("username") String username);
}
