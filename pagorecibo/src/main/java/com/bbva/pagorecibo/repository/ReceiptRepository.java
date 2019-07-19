/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bbva.pagorecibo.repository;

import com.bbva.pagorecibo.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
    
}
