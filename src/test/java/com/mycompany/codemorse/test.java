package com.mycompany.codemorse;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void testcoder() {
		assertEquals("... .- .-.. ..- - ",Morse.coder("salut"));
	}

	
	@Test
	public void testdecoder() {
		assertEquals("coucou ",Morse.decoder("-.-. --- ..- -.-. --- ..- "));
	}

}
