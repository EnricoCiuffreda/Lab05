package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

public class Lettera {
	private Character lettera;
	
	public Lettera(char a) {
		lettera=a;
	}

	public String unisciStringa(List<Lettera> lettere) {
		String risultato=null;
		for(Lettera c:lettere) {
			risultato=risultato+c.getLettera();
		}
		return risultato;
	}
	
	public List<Lettera> dividiStringa(String parola) {
		List<Lettera> risultato=new ArrayList<>();
		for(int i=0;i<parola.length();i++) {
			System.out.println(parola.charAt(i));
			Lettera prova=new Lettera(parola.charAt(i));
			risultato.add(prova);
		}
		return risultato;
	}

	public Character getLettera() {
		return lettera;
	}

	public void setLettera(Character lettera) {
		this.lettera = lettera;
	}

	@Override
	public String toString() {
		return "Lettera [lettera=" + lettera + "]";
	}
	
	
	
}
