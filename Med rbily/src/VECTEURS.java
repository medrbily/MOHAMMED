import java.util.Scanner;
import java.util.Vector;

public class VECTEURS {
	Scanner sc = new Scanner(System.in);
	Vector v = new Vector();
	void note() {
		
		String s = "11";
		int t, max=0 ,i=0;
		char quitter ='n';
		while (true) {
			System.out.println("saisir nom");
		v.add(sc.next());
		System.out.println("saisir la note");
		v.add(sc.next());
		System.out.println("quitter O/N");
		if (sc.next().equals("O"))
			break;
	}
	
	System.out.println(v);

			int Imin=1,Imax=1;
			for(i=3; i<v.size();i=i+2) {
				if (Integer.parseInt(v.get(Imax).toString())<Integer.parseInt(v.get(i).toString()))
				Imax=i;
				if (Integer.parseInt(v.get(Imin).toString())>Integer.parseInt(v.get(i).toString()))
					Imin=i;
				
				
			}
			System.out.println("la note maximale est  " + v.get(Imax) + "  est obtenu par " + v.get(Imax-1));
			System.out.println("la note minimale est  " + v.get(Imin) + "  est obtenu par " + v.get(Imin-1));
			
			String nom ,note;
			System.out.println("BEFORE TRIE" + v.size());
			for(i=0;i<=v.size()-4;i=i+2) 
			{
			if(Integer.parseInt(v.get(i+1).toString())>Integer.parseInt(v.get(i+3).toString()))
				{
				System.out.println("START TRIE" + v.size());
			
				 
				
				nom = v.get(i+2).toString();
			        note = v.get(i+3).toString();
			        v.add(i+2,v.get(i).toString());
					v.add(i+3,v.get(i+1).toString());
			    	v.remove(i+3);
			    	v.remove(i+3);
		
				
				v.add(i, nom);
				v.add(i+1, note);
				v.remove(i+1);
		    	v.remove(i+1);
			
				
				}
	
			}


		

	
}
}

