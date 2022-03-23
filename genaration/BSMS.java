package com.helloworld.hello.genaration;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping("/Generation")
	public class BSMS {

		@GetMapping
		public String BSM () {
			return "Persistencia, mentalidade de crecimento, responsabilidade pessoal, orientação ao futuro, comunicação, orientaçã oao detalhe, proatividade, trabalho em equipe.";
		}
		

	}
