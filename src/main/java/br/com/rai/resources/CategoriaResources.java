package br.com.rai.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {

	
	@RequestMapping(method=RequestMethod.GET)
	private String listar() {
		return "Rest Configurado";
	}
}
