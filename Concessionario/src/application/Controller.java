package application;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Sample Skeleton for 'grafica.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;

public class Controller {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="targaIns"
	private TextField targaIns; // Value injected by FXMLLoader

	@FXML // fx:id="modelloIns"
	private TextField modelloIns; // Value injected by FXMLLoader

	@FXML // fx:id="kmIns"
	private TextField kmIns; // Value injected by FXMLLoader

	@FXML // fx:id="annoIns"
	private TextField annoIns; // Value injected by FXMLLoader

	@FXML // fx:id="prezzoIns"
	private TextField prezzoIns; // Value injected by FXMLLoader

	@FXML // fx:id="aggiungiBtn"
	private Button aggiungiBtn; // Value injected by FXMLLoader

	@FXML // fx:id="targaCerca"
	private TextField targaCerca; // Value injected by FXMLLoader

	@FXML // fx:id="cercaBtn"
	private Button cercaBtn; // Value injected by FXMLLoader

	@FXML // fx:id="targaEdit"
	private TextField targaEdit; // Value injected by FXMLLoader

	@FXML // fx:id="modelloEdit"
	private TextField modelloEdit; // Value injected by FXMLLoader

	@FXML // fx:id="kmEdit"
	private TextField kmEdit; // Value injected by FXMLLoader

	@FXML // fx:id="annoEdit"
	private TextField annoEdit; // Value injected by FXMLLoader

	@FXML // fx:id="prezzoEdit"
	private TextField prezzoEdit; // Value injected by FXMLLoader

	@FXML // fx:id="editBtn"
	private Button editBtn; // Value injected by FXMLLoader

	@FXML // fx:id="targaCanc"
	private TextField targaCanc; // Value injected by FXMLLoader

	@FXML // fx:id="cancellaBtn"
	private Button cancellaBtn; // Value injected by FXMLLoader

	@FXML // fx:id="tragaRip"
	private TextField tragaRip; // Value injected by FXMLLoader

	@FXML // fx:id="ripristinaBtn"
	private Button ripristinaBtn; // Value injected by FXMLLoader

	@FXML // fx:id="deleteBtn"
	private Button deleteBtn; // Value injected by FXMLLoader

	@FXML // fx:id="elencoAutoBtn"
	private Button elencoAutoBtn; // Value injected by FXMLLoader

	@FXML // fx:id="elencoCancBtn"
	private Button elencoCancBtn; // Value injected by FXMLLoader

	@FXML // fx:id="elenco"
	private TextArea elenco; // Value injected by FXMLLoader

	List <Auto> autoEliminate = new ArrayList <>();
	List <Auto> elencoAuto = new ArrayList <>();
	List <Indice> indice = new ArrayList <>();
	Model m = new Model();
	Auto auto;
	
	@FXML
	void aggiungi(ActionEvent event) {

		if ((targaIns.getText() != null) && (modelloIns.getText() != null) && (kmIns.getText() != null)
				&& (annoIns.getText() != null) && (prezzoIns.getText() != null)) {
			auto = new Auto(targaIns.getText(), modelloIns.getText(), Float.parseFloat(kmIns.getText()),
					Integer.parseInt(annoIns.getText()), Integer.parseInt(prezzoIns.getText()));
			targaIns.setText(null);
			modelloIns.setText(null);
			kmIns.setText(null);
			annoIns.setText(null);
			prezzoIns.setText(null);
			m.add(auto);
			auto = null;
			
		}
	}

	@FXML
	void cerca(ActionEvent event) {

	}

	@FXML
	void elimina(ActionEvent event) {

	}

	@FXML
	void eliminaDefinitivamente(ActionEvent event) {

	}

	@FXML
	void modifica(ActionEvent event) {

	}

	@FXML
	void ripristina(ActionEvent event) {

	}

	@FXML
	void stampaAutoEliminate(ActionEvent event) {
		for(int i=0; i<autoEliminate.size(); i++) {
			autoEliminate.forEach(s -> elenco.appendText(String.format("%s\n", s)));
		}
	}

	@FXML
	void stampaElenco(ActionEvent event) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("Elenco.txt"));
			String s = new String();
			String[] riga;
			do {
				s = in.readLine();
				if (s != null) {
					riga = s.split("\\|");
						elencoAuto.clear();
						auto = new Auto(riga[0], riga[1], Float.parseFloat(riga[2]), Integer.parseInt(riga[3]), Integer.parseInt(riga[4]));
						elencoAuto.add(auto);
						auto=null;
					}
			} while (s != null);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			BufferedReader in = new BufferedReader(new FileReader("Indice.txt"));
			String s = new String();
			String[] riga;
			Indice i;
			do {
				s = in.readLine();
				if (s != null) {
					riga = s.split("\\|");
						indice.clear();
						i = new Indice(Integer.parseInt(riga[0]), riga[1]);
						indice.add(i);
					}
			} while (s != null);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0; i<autoEliminate.size(); i++) {
			while(auto==null) {
//				if();
			}
//			auto.forEach(s -> elenco.appendText(String.format("%s\n", s)));
		}
	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert targaIns != null : "fx:id=\"targaIns\" was not injected: check your FXML file 'grafica.fxml'.";
		assert modelloIns != null : "fx:id=\"modelloIns\" was not injected: check your FXML file 'grafica.fxml'.";
		assert kmIns != null : "fx:id=\"kmIns\" was not injected: check your FXML file 'grafica.fxml'.";
		assert annoIns != null : "fx:id=\"annoIns\" was not injected: check your FXML file 'grafica.fxml'.";
		assert prezzoIns != null : "fx:id=\"prezzoIns\" was not injected: check your FXML file 'grafica.fxml'.";
		assert aggiungiBtn != null : "fx:id=\"aggiungiBtn\" was not injected: check your FXML file 'grafica.fxml'.";
		assert targaCerca != null : "fx:id=\"targaCerca\" was not injected: check your FXML file 'grafica.fxml'.";
		assert cercaBtn != null : "fx:id=\"cercaBtn\" was not injected: check your FXML file 'grafica.fxml'.";
		assert targaEdit != null : "fx:id=\"targaEdit\" was not injected: check your FXML file 'grafica.fxml'.";
		assert modelloEdit != null : "fx:id=\"modelloEdit\" was not injected: check your FXML file 'grafica.fxml'.";
		assert kmEdit != null : "fx:id=\"kmEdit\" was not injected: check your FXML file 'grafica.fxml'.";
		assert annoEdit != null : "fx:id=\"annoEdit\" was not injected: check your FXML file 'grafica.fxml'.";
		assert prezzoEdit != null : "fx:id=\"prezzoEdit\" was not injected: check your FXML file 'grafica.fxml'.";
		assert editBtn != null : "fx:id=\"editBtn\" was not injected: check your FXML file 'grafica.fxml'.";
		assert targaCanc != null : "fx:id=\"targaCanc\" was not injected: check your FXML file 'grafica.fxml'.";
		assert cancellaBtn != null : "fx:id=\"cancellaBtn\" was not injected: check your FXML file 'grafica.fxml'.";
		assert tragaRip != null : "fx:id=\"tragaRip\" was not injected: check your FXML file 'grafica.fxml'.";
		assert ripristinaBtn != null : "fx:id=\"ripristinaBtn\" was not injected: check your FXML file 'grafica.fxml'.";
		assert deleteBtn != null : "fx:id=\"deleteBtn\" was not injected: check your FXML file 'grafica.fxml'.";
		assert elencoAutoBtn != null : "fx:id=\"elencoAutoBtn\" was not injected: check your FXML file 'grafica.fxml'.";
		assert elencoCancBtn != null : "fx:id=\"elencoCancBtn\" was not injected: check your FXML file 'grafica.fxml'.";
		assert elenco != null : "fx:id=\"elenco\" was not injected: check your FXML file 'grafica.fxml'.";

	}
}
