package com.mycompany.codemorse;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntegrationTest {


	@Test
	public void testCoder() {
		assertEquals("... .- .-.. ..- - ",Morse.coder("salut"));
	}

	
	@Test
	public void testDecoder() {
		assertEquals("coucou ",Morse.decoder("-.-. --- ..- -.-. --- ..- "));
	}
}
