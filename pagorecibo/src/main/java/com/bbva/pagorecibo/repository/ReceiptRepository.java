/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.pagorecibo.repository;

import com.bbva.pagorecibo.entity.Receipt;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
    
    @Query("SELECT r FROM Receipt r WHERE r.user_id = ?1")
	public List<Receipt> findByUserId(Long id);
}
