
public class Moto extends Vehiculo{
	
	private int cilindrada;
	
	public Moto(String marca, String modelo, int cilindrada, double precio) {
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	public String getCilindrada() {
		return this.cilindrada + "c";
	}

	public void vDesc() {
		System.out.print("Cilindrada: " + cilindrada + "c // ");		
	}

}
