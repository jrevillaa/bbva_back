package com.bbva.pagorecibo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bbva.pagorecibo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(name = "SELECT COUNT(u) FROM User u WHERE u.email = ?1 and u.password = ?2 ")
	public int findByUsernameByPassword(String email, String password);

}