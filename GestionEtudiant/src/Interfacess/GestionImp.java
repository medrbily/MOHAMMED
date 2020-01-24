package Interfacess;

public class GestionImp implements Gestion{
	public int somme(int a, int b) {
		return a+b;
	}
	public int difference(int a, int b) {
		return a-b;
	}
	
	public int multiplication(int a, int b) {
		return a*b;
	}
    public void hello() {
    	System.out.println("hello world");
    }
}
