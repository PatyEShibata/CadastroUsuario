package edu.br.unifcv.projetocobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TituloController {
	
	@RequestMapping("/cadastro/novo")
	public String novo() {
		return "CadastroTitulo";
	}

}
