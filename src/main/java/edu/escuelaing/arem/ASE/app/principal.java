package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.escuelaing.arem.ASE.app.Linkedlist;
import edu.escuelaing.arem.ASE.app.Nodo;

import spark.Request;
import spark.Response;
import static spark.Spark.*;

/**
 * clase principal dedica a calcular la media y desviacion de estandar de unos datos
 * mediante la estructura de datos Linkedlist
 * @author Jimmy Armando Chirivi
 *
 */
public class principal
{
	public Linkedlist list;
	private Nodo actual,siguiente;
	float Tmean = 0,Tstdes = 0,m;
	
	/**
	 * Creardor de la clase Principal donde se crea una linkedlist vacia
	 * @param No tiene ningun parametro
	 * 
	 */
	public principal () {
		list = new Linkedlist();
	}
	
	/**
	 * Clase mean se encarga de calcular la media de los datos de la linkedlist
	 * @param No tiene parametros
	 * @return la media calculada de los datos de la linkedlist tipo float
	 */
	
	public float mean () {
		actual = list.getFirst();
		Tmean += actual.getDatoNodo();
		siguiente = actual.getNextNodo();
		for (int i = 1; i < list.size();i++ ) {
			actual = siguiente;
			siguiente = actual.getNextNodo();
			Tmean += actual.getDatoNodo();
		}
		return Tmean / list.size();
	}
	
	/**
	 * Clase StandardDesviation se encarga de calcular la desviacion estandar de los datos de la linkedlist
	 * @param No tiene parametros
	 * @return la desviacion estandar calculada de los datos de la linkedlist tipo float
	 */
	
	public float StandardDesviation () {
		m = mean();
		actual = list.getFirst();
		Tstdes += (float) Math.pow((actual.getDatoNodo() - m),2);
		siguiente = actual.getNextNodo();
		for (int i = 1; i < list.size(); i++) {
			actual = siguiente;
			siguiente = actual.getNextNodo();
			Tstdes += (float) Math.pow((actual.getDatoNodo() - m), 2);
		}
		
				
		return (float) Math.round(Math.sqrt(Tstdes / (list.size()-1)) * 100) / 100;
	}
	
	/**
	 * Clase getLinkedlist se encarga de retornar la linkedlist actual
	 * @param No tiene parametros
	 * @return retorna una linkedlist
	 */
	
	public Linkedlist getLinkedlist() {
		return list;
	}
	
	/**
	 * Clase contenidofile se encarga de leer los caracteres de un archivo
	 * @param un String donde contiene la direccion fisica del archivo
	 * 
	 */
	
	public static void contenidofile (String file) throws FileNotFoundException,IOException {
		String cadena;
		FileReader f = new FileReader(file);
		BufferedReader b = new BufferedReader(f);
		while ((cadena = b.readLine()) != null ) {
			System.out.println(cadena);
		}
	}
	
	/**
	 * Clase main principal de la clase que depura la clase principal
	 * @param lista de strings
	 * 
	 */
	
   /* public static void main( String[] args ) throws IOException
    {
    	//contenidofile("/Users/jimmy97/Desktop/test.txt");
    	principal princ = new principal();
    	princ.list.add(160);
		princ.list.add(591);
		princ.list.add(114);
		princ.list.add(229);
		princ.list.add(230);
		princ.list.add(270);
		princ.list.add(128);
		princ.list.add(1657);
		princ.list.add(624);
		princ.list.add(1503);
		//princ.mean();
		//System.out.println(princ.mean());
		System.out.println(princ.StandardDesviation());
		
    	
    }*/
	
	
	
}
