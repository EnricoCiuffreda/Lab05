package it.polito.tdp.anagrammi.model;
import java.util.ArrayList;
import java.util.List;

public class Ricerca {
	private List<Lettera> lettere=new ArrayList<>();
	private int N;
	private List<String> soluzione;

	public List<String> cerca(String parola) {
		//rendo in lettere una stringa
        for(int i=0;i<parola.length();i++) {
			Lettera prova=new Lettera(parola.charAt(i));
			lettere.add(prova);
		}
		this.N=parola.length();
		this.soluzione=new ArrayList<>();
		List<Lettera> parziale=new ArrayList<>();
		int livello=0;
		ricorsiva(parziale,livello);
		return this.soluzione;
	}
	

	private void ricorsiva(List<Lettera>parziale,int livello) {
		//caso terminale?
		if(livello==N) {
			String aggiungi="";
			//aggiungo lettera per lettera e formo una stringa 
			for(Lettera c: parziale) {
				aggiungi=aggiungi+c.getLettera();
			}
			//se la parola è gia nel db
			if(!soluzione.contains(aggiungi)) {
			soluzione.add(aggiungi);
			}
		}else {
			for(Lettera let: lettere) {
				//evitare parole che contengono più volte la stessa lettera
				if(!parziale.contains(let)) {
				parziale.add(let);
				ricorsiva(parziale,livello+1);
				parziale.remove(parziale.size()-1);
			}
		}
		
	}

}
}
