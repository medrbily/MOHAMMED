package Interfacess;

public class ExceptionEssai {
	void somme(int a , int b) throws ExceptionAegalB {
		int s ;
		if (a==b)
			throw new ExceptionAegalB();
		else {
			s=a+b;
			System.out.println("la somme est : "+s);
			
		}
	}

}
