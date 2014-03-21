package com.example.pad1;

import java.util.ArrayList;

import junit.framework.TestCase;

public class RestaurantFinderTest extends TestCase {
	protected Restaurant test1;
	protected Restaurant test2;
	
	public RestaurantFinderTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		test1 = new Restaurant("Restaurante Quico",
				"España", "Madrid", "Calle", "Falsa", true,
				123, "Tradicional", "Española", (float) 10.0);
		test2 = new Restaurant("Restaurante Quico",
				"", "", "", "", false,
				-1, "Tradicional", "", (float) -1);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testComparaTodosAtribs() {
		RestaurantFinder rf = new RestaurantFinder();
		ArrayList<Restaurant> lista;
		rf.iniciaRestaurantes();
		lista = rf.buscaRestaurante(test2);
		
		assertTrue(lista.get(0).getName().equalsIgnoreCase(test1.getName()));
	}

}
