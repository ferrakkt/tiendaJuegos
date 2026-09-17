package tiendaJuegos;

import java.util.ArrayList;

public class Store {
	//Representa la tienda, clase encargada de gestionar la información
	
	private ArrayList<Game> game = new ArrayList<>();
	private ArrayList<Customer> customer = new ArrayList<>();
	private ArrayList<Purchase> purchase = new ArrayList<>();
	
	public void newGame (Game nuevoJuego) {
		this.game.add(nuevoJuego);
	}
}
