package com.bbva.pagorecibo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bbva.pagorecibo.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	@Query(" SELECT t FROM Transaction t WHERE t.user.id = ?1 ")
	public List<Transaction> findByIdUsuario(Long idUsuario);

}