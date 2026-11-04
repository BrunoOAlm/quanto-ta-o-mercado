package com.brunoalm.quanto_ta_o_mercado;

import org.springframework.boot.SpringApplication;

public class TestQuantoTaOMercadoApplication {

	public static void main(String[] args) {
		SpringApplication.from(QuantoTaOMercadoApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
