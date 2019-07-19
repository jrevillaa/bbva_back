package com.bbva.pagorecibo.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "card_id")
	private Card tarjeta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	@Column(name = "date")
	private LocalDate fecha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "receipt_id")
	private Receipt recibo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Card getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Card tarjeta) {
		this.tarjeta = tarjeta;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Receipt getRecibo() {
		return recibo;
	}

	public void setRecibo(Receipt recibo) {
		this.recibo = recibo;
	}

}