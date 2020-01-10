
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>(4);
		
		lista.add(new Auto("Peugeot", "206", 4, 200000));
		lista.add(new Moto("Honda", "Titan", 125, 60000));
		lista.add(new Auto("Peugeot", "208", 5, 250000));
		lista.add(new Moto("Yamaha", "YBR", 160, 80500.50));
		
		lista.trimToSize();
		
		for(Vehiculo o : lista) {
			o.vMarca();
			o.vModelo();
			o.vDesc();
			o.vPrecio();
		}
		
		System.out.println("=============================");
		
		System.out.println("Vehículo más caro: " + Collections.max(lista).getMarca() + " " + Collections.max(lista).getModelo());
		System.out.println("Vehículo más barato: " + Collections.min(lista).getMarca() + " " + Collections.min(lista).getModelo());
				
		System.out.print("Vehículo que contiene en el modelo la letra 'Y': ");
		for(int i=0; i<lista.size(); i++) {
			String modelo = lista.get(i).getModelo();
			if (modelo.contains("Y")) {
				System.out.println(lista.get(i).getMarca() + " " + lista.get(i).getModelo() + " " + lista.get(i).getPrecio());
			}
		}
		
		System.out.println("=============================");
		
		System.out.println("Vehículos ordenados por precio de mayor a menor:");
		lista.sort((o2, o1) -> o1.compareTo(o2)) ;
		for (Vehiculo v : lista) {
			System.out.println(v.getMarca() + " " + v.getModelo());
		}
				
	}
}