package tiendaJuegos;

public class Customer {
	//Es el cliente

	private int id;
	private String name;
	private double balance;
	private static int contadorID=1;
	
	public Customer (String name, double balance){
		this.name=name;
		this.balance=balance;
		this.id=contadorID++;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getBalance(){
		return balance;
	}
	public void anadirSaldo(double anadirAlBalance) {
	
		if(anadirAlBalance<=0) {
			System.out.println("No puedes añadir saldo negativo");
		}else {
			this.balance=this.balance+anadirAlBalance;
		}
	}
	public void retirarSaldo(double balanceRetirado) {
		if((this.balance-balanceRetirado)<0) {
			System.out.println("No tienes saldo suficiente para retirar la cantidad solicitada");
		}else {
			this.balance=this.balance-balanceRetirado;
			System.out.println("Has retirado el saldo: "+balanceRetirado);
			System.out.println("Te queda: "+this.balance);
		}
	}
	public void comprobarDisponibilidad(double cantidad) {
		if(this.balance>=cantidad) {
			System.out.println("Si dispones de esa cantidad de dinero");
			
		}else {
			System.out.println("No dispones de esa cantidad de dinero");
		}
	}
	public boolean comprobarDisponibilidadBoolean(double cantidad){
		boolean disponible = false;
		if(this.balance>=cantidad) {
			disponible= true ;
		}
		return disponible;
		
	}
public String toString() {
	return "Cliente [ID: " + id + ", Nombre: " + name + ", Saldo= "+ balance + "]";
}

}