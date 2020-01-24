import java.util.Scanner;

public class Tableau {
         
	 		int n=3;
	    	 int x []  = new int [n];
	    	 int y []  = new int [n];
	    	 int z []  = new int [n];
	    	 int c []  = new int [2*n];
	    	 int s []  = new int [n];
	   
			Scanner sc = new Scanner (System.in);
		
			
		
		int [] concat(int e[], int r[]) {
			
			for(int i=0; i<n; i++) {
				c[i]=e[i] ;
				c[i+n]=r[i] ;
			}
			
    		return c;
    	}
		
	
		
			void tableaux() {
	    	 int i,j ,max, min;
	    	
		
		
	    	 for( i=0 ;i<x.length ; i++) 	 {
	    		 
        		 System.out.print(" entrer x ["+i+"]=");
        		    x[i]= sc.nextInt(); 
        	 }
	    	 	for( i=0 ;i<x.length ; i++) 	 {	    		 
        		    z[i]=x[i];
        		    }
        	 	 
	        	 for( i=0 ;i<y.length ; i++) 	 {
		    		 
	        		 System.out.print(" entrer y ["+i+"]=");
	        		    y[i]= sc.nextInt(); 
	        	 }
	        	 
	        	 //Concatenation 
	        		c=concat(x,y);
		        	for( i=0 ;i<2*n ; i++) { 
		        		System.out.print(c[i]+" ");
		        	}
		        	System.out.println("");
	        	 
	        	 System.out.println("affichage");
	         	 for( i=0 ;i<x.length ; i++)
	         		 System.out.print(" " + x[i]);
	    		 
	    	     max = x[0];
	         	 for( i=0 ;i<n ; i++) 
	    		 if (max< x[i])
	    			 max = x[i];
	    	
	    		 min = x[0];
    		     for( j=0 ;j<n; j++)
    			 if (min > x[j])
    				 min = x[j];	
    		
    		     int somme = 0;
    		     for( i=0 ;i<n ; i++)
    		    	 somme += x[i];
    		     {
    		    	 float moyenne = (float) somme / x.length;
    		    	 System.out.println();
    		    	 System.out.println(" la Moyenne du tableau est  = " + moyenne);
    		     }
    		     
    		     
	    		
	     		 System.out.println(" la valeur maximale du tableau est :" +max);
	    		 System.out.println(" la valeur minimale de tableau est :" +min);
	    		 
	    		 
	    		 
	    	   
	    		 for (int I=0; I<n-1; I++)
	  	       {
	  	    	    
	  	        int PMAX= I;
	  	        
	  	        for (int J=I+1; J<n; J++)
	  	            if (x[J]<x[PMAX])  PMAX=J;
	  	       
	  	        int AIDE=x[I];
	  	        x[I]=x[PMAX];
	  	        x[PMAX]=AIDE;
	  	        
	  	       }
	  	       
	  	      
	  	       System.out.println("Tableau trié par ordre croissant : ");
	  	       for (int J=0; J<n; J++)
	  	    	   System.out.println(x[J]);
	  	     
	  	   
	  	       for (int I=0; I<n-1; I++)
	  	       {
	  	    	    
	  	        int PMIN= I;
	  	        
	  	        for (int J=I+1; J<n; J++)
	  	            if (x[J]>x[PMIN])  PMIN=J;
	  	       
	  	        int HELP=x[I];
	  	        x[I]=x[PMIN];
	  	        x[PMIN]=HELP;
	  	        
	  	       }
	  	       
	  	      
	  	       System.out.println("Tableau trié par ordre decroissant : ");
	  	       for (int J=0; J<n; J++)
	  	    	   System.out.println(x[J]);
	  	       
	  	       
 
	  	       
	  	       
	  	     for( i=0 ;i<n ; i++) 	 {
	    		 s[i]= z[i] + y[i];
        	 }
	    	 
	  	     System.out.println("la somme est : ");
	  	    for( i=0 ;i<s.length ; i++) 	 {
	    		 System.out.println(s[i]);
       	 }
	  	    
	  	    
	  	  int[][] tableau;
	  	  
	      tableau = new int[2][3];
	      for (int i1 = 0;i1 < tableau.length; i1++) {
	         for (int j1 = 0;j1 < tableau[i1].length;j1++) {
	            tableau[i1][j1] = i1 + j1;
	            System.out.print(tableau[i1][j1] + " ");
	         }
	         System.out.println();
	      }
	      System.out.println();
	      
	    tableau = new int[3][];
	    for (i = 0; i < tableau.length; i++) {
		tableau[i] = new int[i + 1];
		for (j = 0; j < tableau[i].length; j++) {
		    tableau[i][j] = i + j;
	            System.out.print(tableau[i][j] + " ");
	         }
	         System.out.println();
	      }  
	      System.out.println(); 
	   }
	
	    	 }  
			

	    	 
	     
	     
	     

