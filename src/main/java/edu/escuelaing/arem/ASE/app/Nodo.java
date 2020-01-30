/**
 * 
 */
package edu.escuelaing.arem.ASE.app;

/**
 * 
 * Clase nodo es utilizada para almacenar la informacion de se concatena con otros nodos secuancialmente
 * @author Jimmy Armando Chirivi Nivia
 *
 */
public class Nodo {
	
	private float dato;
	private Nodo next;
	
	/**
	 *Clase creadora encargada de crear el nodo 
	 *@param dato de tipo float
	 *
	 */
	
	public Nodo(float dato) {
		this.dato = dato;
		this.next = null;
	}
	
	/**
	 *Clase encargada de cambiar el dato del nodo 
	 *@param dato de tipo float
	 *
	 *
	 */
	
	public void setDatoNodo(float dato) {
		this.dato = dato;
	}
	
	/**
	 *Clase encargada de dar el dato del nodo 
	 *@param No tiene elementos de entrada
	 *@return dato de tipo float
	 */
	
	public float getDatoNodo() {
		return dato;
	}
	
	/**
	 *Clase encargada de cambiar el nodo siguiente del nodo 
	 *@param Objeto de tipo nodo 
	 *
	 */
	
	public void setNextNodo(Nodo next) {
		this.next = next;
	}
	
	/**
	 *Clase encargada de dar el nodo siguiente del nodo 
	 *@param No tiene elementos de entrada
	 *@return Objeto de tipo nodo
	 */
	
	public Nodo getNextNodo() {
		return next;
	}
	
	
}


