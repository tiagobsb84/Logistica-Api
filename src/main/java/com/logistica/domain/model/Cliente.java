package com.logistica.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
	public long id;
	public String nome;
	public String email;
	public String telefone;
}
