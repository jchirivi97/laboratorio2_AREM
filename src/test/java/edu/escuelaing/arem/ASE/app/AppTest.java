package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import edu.escuelaing.arem.ASE.app.Linkedlist;
import edu.escuelaing.arem.ASE.app.Nodo;;

public class AppTest
{
	public void testApp()
    {
        assertTrue( true );
    }
    
	@Test
	public void meanTest1() {
		
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
		
					
		assertTrue(princ.mean() == (float) 550.6);
		
	}
	
	@Test
	public void StandardDesviationTest1() {
		
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
					
		assertTrue(princ.StandardDesviation() == (float) 572.03);
	}
	
	
	@Test
	public void meanTest2() {
		
		principal princ = new principal();
    	princ.list.add((float)15.0);
		princ.list.add((float)69.9);
		princ.list.add((float)6.5);
		princ.list.add((float)22.4);
		princ.list.add((float)28.4);
		princ.list.add((float)65.9);
		princ.list.add((float)19.4);
		princ.list.add((float)198.7);
		princ.list.add((float)38.8);
		princ.list.add((float)138.2);
		
					
		assertTrue(princ.mean() == (float) 60.32);
		
	}
	
	
	@Test
	public void StandardDesviationTest2() {
		
		principal princ = new principal();
    	princ.list.add((float)15.0);
		princ.list.add((float)69.9);
		princ.list.add((float)6.5);
		princ.list.add((float)22.4);
		princ.list.add((float)28.4);
		princ.list.add((float)65.9);
		princ.list.add((float)19.4);
		princ.list.add((float)198.7);
		princ.list.add((float)38.8);
		princ.list.add((float)138.2);
		
		
		assertTrue(princ.StandardDesviation() == (float) 62.26);
	}
	
	@Test
	public void addnodoTest() {
			
		Linkedlist list = new Linkedlist();
		
		list.add((float) 45.6);
		list.add((float) 58.6);
		list.add((float) 78.5);
		list.add((float) 95.8);
		
				
		assertTrue(list.getFirst().getDatoNodo() == (float) 45.6);
	}
	
	
	@Test
	public void removenodoTest() {
			
		Linkedlist list = new Linkedlist();
		
		list.add((float) 45.6);
		list.add((float) 58.6);
		list.add((float) 78.5);
		list.add((float) 95.8);
		
		
		Nodo nodo = list.removeFirst();
						
		assertTrue(nodo.getDatoNodo() == (float) 45.6);
	}
	
	
	
    
}
