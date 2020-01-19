package com.algaworks.brewer.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.algaworks.brewer.model.Cliente;

@Component
public class ClienteConverter implements Converter<String, Cliente> {

	@Override
	public Cliente convert(String codigo) {
		if (!StringUtils.isEmpty(codigo)) {
			Cliente cliente = new Cliente();
			cliente.setCodigo(Long.valueOf(codigo));
			return cliente;
		}
		
		return null;
	}

}
