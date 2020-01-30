/**
 * 
 */
package edu.escuelaing.arem.ASE.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import edu.escuelaing.arem.ASE.app.Nodo;

/**
 *  Consiste en una secuencia de nodos, en los que se guardan campos de datos arbitrarios y 
 *  una o dos referencias, enlaces o punteros al nodo anterior o posterior.
 * @author Jimmy Armando Chirivi Nivia
 *
 */
public class Linkedlist implements List<Nodo>{
	private Nodo nodofirst;
	private Nodo nodolast;
	private Nodo nodonew;
	private Nodo nodoremove, nodoprev, nodoact,nodonext;
	int longitud;
	
	
	/**
	 *Creador de la clase Linkedlist donde se inicializa la longitud y cabeza de la linkedlist 
	 *@param No tiene elementos de entrada
	 * 
	 *
	 */
	public Linkedlist(){
		longitud = 0;
		nodofirst = null;
		nodolast = null;
	}
	
	
	/**
	 *Clase encargada de retornar el primero de la linkedlist 
	 *@param No tiene elementos de entrada
	 *@return retorna el primero de la lista tipo Nodo
	 *
	 */
	public Nodo getFirst() {
		return nodofirst;
	}
	
	/**
	 *Clase encargada de retornar el ultimo de la linkedlist 
	 *@param No tiene elementos de entrada
	 *@return retorna el ultimo de la lista tipo Nodo
	 *
	 */
	
	public Nodo getLast() {
		return nodolast;
	}
	
	/**
	 *Clase encargada de agregar un nodo en la linkedlist 
	 *@param dato de tipo float
	 *@return boleano de confirmacion
	 *
	 */

	public boolean add(float nodo) {
		nodonew = new Nodo(nodo);
		if (isEmpty()) {
			nodofirst = nodonew;
			nodolast = nodofirst;
			longitud += 1;
			return true;
		}
		else {
			nodolast.setNextNodo(nodonew);
			nodolast = nodonew;
			longitud +=1;
			return true;
		}
	}
	
	/**
	 *Clase encargada de verificar si esta vacia o llena la linkedlist 
	 *@param No elementos de entrada
	 *@return boleano de confirmacion
	 *
	 */
	
	public boolean isEmpty() {
		if (longitud == 0) {
			return true;
		} 
		else {
			return false;
		}
	}
	
	
	/**
	 *Clase encargada de verificar el tamaño dela  linkedlist 
	 *@param No elementos de entrada
	 *@return entero con el tamaño de la lista
	 *
	 */
	
	public int size() {
		return longitud;
	}
	
	/**
	 *Clase encargada de eliminar el primer nodo de la  linkedlist 
	 *@param No elementos de entrada
	 *@return primero nodo de la lista
	 *
	 */
	
	public Nodo removeFirst() {
		nodoremove = nodofirst;
		nodoprev = nodofirst;
		nodoact = nodofirst.getNextNodo();
		nodofirst = nodoact;
		for (int i = 1; i < size();i++) {
			nodoprev = nodoact;
			nodoact = nodoprev.getNextNodo();
			nodoprev.setNextNodo(nodoact);
		}
		longitud -= 1;
		return nodoremove;
	}
	
	/**
	 *Clase encargada de eliminar el ultimo nodo de la  linkedlist 
	 *@param No elementos de entrada
	 *@return ultimo nodo de la lista
	 *
	 */
	
	public Nodo removeLast() {
		nodoprev = nodofirst;
		nodoact = nodofirst.getNextNodo();
		for(int i = 1 ; i < size();i++) {
			nodoprev = nodoact;
			nodoact = nodoprev.getNextNodo();
		}
		longitud -= 1;
		nodoprev.setNextNodo(null);
		return nodoact;
	}
	
	/**
	 *Clase encargada de eliminar un nodo de la  linkedlist 
	 *@param entero con el index del nodo 
	 *@return Nodo eliminado
	 *
	 */
	
	public Nodo remove(int index) {
		index += 1; 
		if (index == 0) {
			removeFirst();
			
		}
		else {
			nodoprev = nodofirst;
			nodonext = nodofirst.getNextNodo();
			for(int i = 1; i < index;i++) {
				if (i == index-1) {
					nodoprev.setNextNodo(nodonext.getNextNodo());
				}
				else {
					nodoprev = nodonext;
					nodonext = nodonext.getNextNodo();
				}
				
			}
		}
		longitud -= 1;
		return null;
	}

	public void add(int index, Nodo element) {
		throw new RuntimeException ("Metodo en proceso");
		
	}

	public boolean addAll(Collection<? extends Nodo> c) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public boolean addAll(int index, Collection<? extends Nodo> c) {
		throw new RuntimeException ("Metodo en proceso");
		
	}

	public void clear() {
		throw new RuntimeException ("Metodo en proceso");
		
	}

	public boolean contains(Object o) {
		throw new RuntimeException ("Metodo en proceso");
		
	}

	public boolean containsAll(Collection<?> c) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public Nodo get(int index) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public int indexOf(Object o) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public Iterator<Nodo> iterator() {
		throw new RuntimeException ("Metodo en proceso");
	}

	public int lastIndexOf(Object o) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public ListIterator<Nodo> listIterator() {
		throw new RuntimeException ("Metodo en proceso");
	}

	public ListIterator<Nodo> listIterator(int index) {
		throw new RuntimeException ("Metodo en proceso");
	}

	

	

	public boolean removeAll(Collection<?> c) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public boolean retainAll(Collection<?> c) {
		throw new RuntimeException ("Metodo en proceso");
	}

	
	
	public Object[] toArray() {
		throw new RuntimeException ("Metodo en proceso");
	}

	public <T> T[] toArray(T[] a) {
		throw new RuntimeException ("Metodo en proceso");
	}

		public boolean remove(Object o) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public boolean add(Nodo e) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public Nodo set(int index, Nodo element) {
		throw new RuntimeException ("Metodo en proceso");
	}

	public List<Nodo> subList(int fromIndex, int toIndex) {
		throw new RuntimeException ("Metodo en proceso");
	}
	
	
	
	

}
