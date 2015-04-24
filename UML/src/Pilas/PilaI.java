 package Pilas;

public class PilaI { 
	int [] pila;
	int cima;
	
	public PilaI (int a){
		pila=new int [a];
		cima=-1;
			
	}
public void push (int a){
	pila[++cima]=a;
	}
public void pop(){
	cima--;
}
public void mostrar(){
	System.out.print("[ ");
	for (int i=0; i<=cima;i++)
		System.out.print(pila [i] +" ");
	System.out.println("]");
}
public static void main (String []args){
	PilaI pila = new PilaI(100);
	pila.push(10);
	pila.mostrar();
	pila.push(20);
	pila.mostrar();
	pila.pop();
	
}
}
