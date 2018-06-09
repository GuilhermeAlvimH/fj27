package br.com.cadocodigo.loja.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Price {
	
	@Column(scale = 2)	
	private BigDecimal value;
	
	@Enumerated(EnumType.STRING)
	private bookType bookType;
	
	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public bookType getBookType() {
		return bookType;
	}

	public void setBookType(bookType bookType) {
		this.bookType = bookType;
	}

}
