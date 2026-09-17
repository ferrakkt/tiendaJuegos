package tiendaJuegos;

public class Purchase {

	//Representa la compra realizada por el cliente
	
	private Customer customer;
	private Game game;
	private int quantity;
	private double totalPrice;
	public Customer getCustomer() {
		return customer;
	}
	
	public Purchase(Customer customer, Game game, int quantity, double totalPrice) {
		super();
		this.customer = customer;
		this.game = game;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
    
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = quantity*Game.getPrice();
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	
	
	
}
