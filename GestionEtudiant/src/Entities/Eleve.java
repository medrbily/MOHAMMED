package Entities;

public class Eleve extends Etudiant {

	public String pere , mere;
	public String teleparents;
	
	public void affiche() {
		System.out.println( "bonjour eleve");
	}
	public void affiche(int i) {
		System.out.println( " je suis a la fonction avec le paramettre  " + i);
	}
	public void affiche(String a) {
		System.out.println( "  had ma fonction paramettre string  " + a);
	}
	public void affiche(int n,String b) {
		for(int i= 0; i < n ; i++ )
		System.out.println( " had la fonction paramettre int + string  " + i + " éme iteration " + b );
	}
}
