package it.polito.tdp.anagrammi.model;

import java.util.List;

public class TestRicerca {
	public static void main(String[] args) {
		// dato un pronostico pari a [x2 1 1x2 12]
		//trovare tutti i risultati corrispondenti
		Ricerca r=new Ricerca();
		String parola="antonio";
		List<String> risultati=r.cerca(parola);
		System.out.println(risultati);
	}

}
