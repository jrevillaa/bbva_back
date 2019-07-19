package com.bbva.pagorecibo.repository;

import com.bbva.pagorecibo.entity.Receipt;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {

	@Query("SELECT r FROM Receipt r WHERE r.estado.id = 1 and r.usuario.id = ?1 ")
	public List<Receipt> findPendientesByIdUsuario(Long idUsuario);

	@Query("SELECT r FROM Receipt r WHERE r.estado.id = 2 and r.usuario.id = ?1 ")
	public List<Receipt> findPagadosByIdUsuario(Long idUsuario);

	@Query("SELECT r FROM Receipt r WHERE r.id = ?1 ")
	public Receipt findByIdRecibo(Long idRecibo);

	@Modifying
	@Query("UPDATE Receipt r SET r.estado.id = ?2 WHERE r.id = ?1 ")
	public int updateEstadoRecibo(Long idRecibo, Long idEstado);
	
}