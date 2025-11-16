package br.ce.jeanc.rest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;
import static org.junit.Assert.*;

public class OlaMundoTest {

	@Test
	public void testOlaMundoEndpoint() {
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
		assertEquals("Ola Mundo!", response.getBody().asString());
		assertEquals(200, response.statusCode());

		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);
	}
}
}
