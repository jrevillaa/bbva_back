package com.bbva.pagorecibo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbva.pagorecibo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}