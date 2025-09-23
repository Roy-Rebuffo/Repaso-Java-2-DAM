package primero;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class ejer08 {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//buscar una palabra en castellano, si existe mostrar la traduccion en ingles, 
		//sino no existe pedirla y meterla en el diccionario
		
		//Continuar el proceso
		
		HashMap<String, String> traductor = new HashMap<String,String>();

		traductor.put("Hola", "Hello");
		traductor.put("Adios", "GoodBye");
		traductor.put("Casa", "House");
		/*
		System.out.println(traductor.get("Hola"));//Le damos la clave y nos devuelve el valor
		
		System.out.println(traductor.keySet());//Devuelve el conjunto de las claves
		
		System.out.println("Acceder a los valores a través de la clave");
		for (String c : traductor.keySet()) {//Acceder al valor a traves de la clave
			System.out.println(c + " " + traductor.get(c));
		}
		
		for(String c : traductor.values())//Acceder solo a los valores
			System.out.println(c);
		
		for(Entry<String, String> c : traductor.entrySet())//Acceder a la clave y al valor mediante la colección Entry
			System.out.println(c.getKey() + c.getValue());
		
		/*if(!traductor.containsKey("Azul")) {
			traductor.put("Azul", "Blue");
		}*/
		
		System.out.print("Escriba una palabra: ");
		String res = sc.nextLine();
		
		if(!traductor.containsKey(res)) {
			System.out.println("Añada traduccion");
			String trad = sc.nextLine();
			traductor.put(res, trad);
		}else {
			System.out.println(traductor.get(res));
		}
		
		
		
		/*
		for(Entry<String, String> c : traductor.entrySet()) {//Acceder a la clave y al valor mediante la colección Entry
			
			while (!encontrada) {
				System.out.println("Añada palabra traducción al diccionario");
				String newRes = sc.nextLine();
				traductor.put(res, newRes);
				break;
			}
		}*/
		
	}

}
