package Pilas;

public class Main {
	 public static void main(String []args){
		  
		  System.out.println("------Pila------");
		  PilaII pila = new PilaII();
		  pila.apilar("A");
		  pila.apilar("B");
		  pila.apilar("C");
		  pila.apilar("D");
		  
		  System.out.println("Esta vacia la pila?:" + pila.vacia());
		  System.out.println("Tama�o de la pila:" + pila.size());
		  
		  System.out.println(pila.cima());
		  pila.desapilar();
		  System.out.println(pila.cima());
		  pila.desapilar();
		  System.out.println(pila.cima());
		  pila.desapilar();
		  System.out.println(pila.cima());
		  pila.desapilar();
		  
		  System.out.println("Esta vacia la pila?:" + pila.vacia());
		    
		  System.out.println("------Cola------");
		  Cola cola = new Cola();
		  cola.encolar("A");
		  cola.encolar("B");
		  cola.encolar("C");
		  cola.encolar("D");
		  
		  System.out.println("Esta vacia la cola?:" + cola.vacia());
		  System.out.println("Tama�o de la cola:" + cola.size());
		  
		  System.out.println(cola.frente());
		  cola.desencolar();
		  System.out.println(cola.frente());
		  cola.desencolar();
		  System.out.println(cola.frente());
		  cola.desencolar();
		  System.out.println(cola.frente());
		  cola.desencolar();
		  
		  System.out.println("Esta vacia la cola?:" + cola.vacia());
		 }
		}


