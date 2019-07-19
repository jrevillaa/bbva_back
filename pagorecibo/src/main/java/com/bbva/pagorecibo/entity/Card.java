package com.bbva.pagorecibo.entity;

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
@Table(name = "CARD")
public class Card {

	@Id
	@Column(name = "card_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "number")
	private String numero;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type_card")
	private TypeCard tipoTarjeta;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public TypeCard getTipoTarjeta() {
		return tipoTarjeta;
	}

	public void setTipoTarjeta(TypeCard tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}

	public User getUsuario() {
		return usuario;
	}

	public void setUsuario(User usuario) {
		this.usuario = usuario;
	}

}