package it.polito.tdp.anagrammi.model;

import it.polito.tdp.anagrammi.DAO.DizionarioDAO;

public class Model {
	
		Model model;
		
		public boolean iscorretto(String nome){
			DizionarioDAO dao=new DizionarioDAO();
			return dao.isCorretto(nome);
		}

}
