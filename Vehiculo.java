import java.text.DecimalFormat;

public abstract class Vehiculo implements Comparable<Vehiculo>, VehiculosLista{
	
	private final String marca, modelo;
	private double precio;
	private DecimalFormat df = new DecimalFormat("###,###.00");
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
		
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getPrecio() {
		return "$" +  this.df.format(precio);
	}
	
	public int compareTo(Vehiculo o) {
		return Double.compare(this.precio, o.precio);
	}
	
	//-------------------------
	
	public void vMarca() {
		System.out.print("Marca: " + marca + " // ");
	}
	
	public void vModelo() {
		System.out.print("Modelo: " + modelo + " // ");
	}

	public void vDesc() {
		System.out.println();		
	}

	public void vPrecio() {
		System.out.println("Precio: $" + df.format(precio));
	}
	
	
}
