import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LISTE {
	Scanner sc = new Scanner(System.in);
	void liste()
	{ List<Integer> MED = new ArrayList<Integer>();

	
    int b = 1;
    
    	while (b!=0)
    	{
    		System.out.println("saisir un element");
    		MED.add(sc.nextInt());
    		System.out.println("quitter appyer 0");
    		if(sc.nextInt()==0)
    			break;
    	}
    	System.out.println(MED);
    	System.out.println("saisir un element a chercher "); 
    	int chercher = sc.nextInt();
    	int j,nbr=0;
    	{
    		for(j=0;j<MED.size();j++) {
    			if(MED.get(j)== chercher)
    				nbr++;
    			
    		}
    		System.out.println(" l'element  " +chercher+ "  exist  " +nbr+ "  fois  ");
    		
    	}
      
		}
}

