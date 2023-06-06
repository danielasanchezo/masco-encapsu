package mascotas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Mascota {
	ModeloDatos datos =new ModeloDatos();
	modeloMascota mascota = new modeloMascota();
	
	int codigo;
    String nombre;
    String especie;
    int edad;
  
    public Mascota() {
    	
    }
    
	public void ingresar() {
    	mascota.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la mascota")));
    	mascota.setNombre(JOptionPane.showInputDialog("Ingrese nombre de la mascota"));
        mascota.setEspecie(JOptionPane.showInputDialog("Ingrese especie de la mascota"));
        mascota.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota")));
        
        codigo = mascota.getCodigo();
        nombre = mascota.getNombre();
        especie = mascota.getEspecie();
        edad = mascota.getEdad();
    }
    public Mascota(String nombre, String especie, int edad) {
    	this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInformacion() {
    	System.out.println("Codigo: " + mascota.getCodigo());
        System.out.println("Nombre: " + mascota.getNombre());
        System.out.println("Especie: " + mascota.getEspecie());
        System.out.println("Edad: " + mascota.getEdad() + " anos");
    }

    public void hacerSonido() {
        if (mascota.getEspecie().equalsIgnoreCase("perro")) {
            System.out.println(""
            		+ "Guau guau!");
        } else if (mascota.getEspecie().equalsIgnoreCase("gato")) {
            System.out.println("Miau miau!");
        }else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }
    public void comer() {
        if (mascota.getEspecie().equalsIgnoreCase("perro")) {
            System.out.println("El perro come!");
        } else if (mascota.getEspecie().equalsIgnoreCase("gato")) {
            System.out.println("El gato come!");
        }else {
            System.out.println("La mascota no ha comido conocidos.");
        }
    }
	public void jugar() {
        if (mascota.getEspecie().equalsIgnoreCase("perro")) {
            System.out.println("El perro juega!");
        } else if (mascota.getEspecie().equalsIgnoreCase("gato")) {
            System.out.println("El gato juega!");
        }else {
            System.out.println("La mascota no juega conocidos.");
        }
		
	}
    public void imprimirDatos(ModeloDatos datos) {
   	 HashMap<Integer, Mascota> mascota = datos.getSizeMap();
   	Iterator iterator = mascota.keySet().iterator();
   	Mascota mascotas; Integer llave;
		while(iterator.hasNext()) {
           llave = (Integer) iterator.next();
           mascotas = datos.getSizeMap().get(llave);
           System.out.println("ID: " + llave + ", Nombre: " + mascotas.nombre + ", edad: " + mascotas.edad 
               		+ " y especie " + mascotas.especie);
		}
		System.out.println("-----");
   }

}