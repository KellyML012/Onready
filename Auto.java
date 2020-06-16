
public class Auto extends Vehiculo{
	
	private int puertas;
	
	public Auto(String marca, String modelo, int puertas, double precio) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}

	public void vDesc() {
		System.out.print("Puertas: " + puertas + " // ");		
	}
	
	
}
