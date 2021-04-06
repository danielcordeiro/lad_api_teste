package com.dgc.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgc.domain.Cliente;
import com.dgc.enums.Perfil;
import com.dgc.enums.TipoCliente;
import com.dgc.repositories.ClienteRepository;

@Service
public class DBService {

	@Autowired
	private ClienteRepository clienteRepository;

	public void instantiateTestDatabase() throws ParseException {

		/*
		 * CLIENTE
		 */

		Cliente cli1 = new Cliente(null, "Maria Silva", "dgodinhoc@gmail.com", "36379912377", TipoCliente.PESSOAFISICA,
				("123"));
		cli1.getTelefones().addAll(Arrays.asList("27343323", "93838393"));

		Cliente cli2 = new Cliente(null, "Ana Costa", "teste@gmail.com", "31628382740", TipoCliente.PESSOAFISICA,
				("123"));
		cli2.getTelefones().addAll(Arrays.asList("93883321", "34252625"));
		cli2.addPerfil(Perfil.ADMIN);

		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
	}
}
