package it.polito.tdp.anagrammi;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import it.polito.tdp.anagrammi.model.Ricerca;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

	public class FXMLController {
		Model model;
		
		public void setmodel(Model model) {
			this.model=model;
		}


	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField txtinput;

	    @FXML
	    private Button btncalcola;

	    @FXML
	    private TextArea txtok;

	    @FXML
	    private TextArea txtno;

	    @FXML
	    private Button btnReset;

	    @FXML
	    void doCalcola(ActionEvent event) {
			Ricerca ricerca=new Ricerca();
	    	String nome=txtinput.getText();
	    	List <String> parole= ricerca.cerca(nome);
	    	System.out.println(parole);
	    	for(String s: parole) {
	    		if(model.iscorretto(s)) {
	    			txtok.appendText(s+"\n");
	    		}
	    		else {
	    			txtno.appendText(s+"\n");
	    		}
	    	}
	    }

	    @FXML
	    void doReset(ActionEvent event) {
	    	txtinput.clear();
	    	txtok.clear();
	    	txtno.clear();

	    }

	    @FXML
	    void initialize() {
	        assert txtinput != null : "fx:id=\"txtinput\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert btncalcola != null : "fx:id=\"btncalcola\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert txtok != null : "fx:id=\"txtok\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert txtno != null : "fx:id=\"txtno\" was not injected: check your FXML file 'Scene.fxml'.";
	        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
	    }
	}
