import java.util.Scanner;

public class CHAINE {
Scanner dd = new Scanner(System.in);
	
	void popo(){
		String chaine;
	    char c;
	    int i, cpt = 0;
		System.out.println("saisir une chaine");
		chaine = dd.next();
		System.out.println("saisir le caractere chercher");
		c = dd.next().charAt(0);
		
		for ( i = 0; i < chaine.length(); i++) {
			
			if (c==chaine.charAt(i))
			{
				
				cpt++;
			}
			
			
		}
		
		System.out.println("le nombre de fois est " + cpt);
		
		
	}
	

}
