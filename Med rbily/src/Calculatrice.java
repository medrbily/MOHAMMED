import java.util.Scanner;

public class Calculatrice {
            void somme()
             {
            	System.out.println("l'operetion que vous avez choisi est la sommation ");
            	 @SuppressWarnings("resource")
            	 
         		Scanner sf = new Scanner(System.in);
            	 System.out.println("donner moi a");
         	    int a=  sf.nextInt();
         	   System.out.println("donner moi b");
         	    int b = sf.nextInt();
         	    int sum = a+b;
         	   System.out.println("la somme est egale " +sum);
//            	 return a+b;
             }
            
            void soustraction() {
            	System.out.println("l'operetion que vous avez choisi est la soustraction ");
               	 @SuppressWarnings("resource")
               	 
            		Scanner ss = new Scanner(System.in);
               	 System.out.println("donner moi a");
            	    int a=  ss.nextInt();
            	   System.out.println("donner moi b");
            	    int b = ss.nextInt();
            	    int soustr = a-b;
            	   System.out.println("la soustraction est egale " +soustr);
            }
            
            
            void multiplication() {
            	System.out.println("l'operetion que vous avez choisi est la multiplication ");
               	 @SuppressWarnings("resource")
               	 
            		Scanner sm = new Scanner(System.in);
               	 System.out.println("donner moi a");
            	    int a=  sm.nextInt();
            	   System.out.println("donner moi b");
            	    int b = sm.nextInt();
            	    int multip = a*b;
            	   System.out.println("la multiplication est egale " + multip);
            }
            
            
            void division() {
            	System.out.println("l'operetion que vous avez choisi est la division ");
              	 @SuppressWarnings("resource")
              	 
           		Scanner sd = new Scanner(System.in);
              	 System.out.println("donner moi a");
           	    float a=  sd.nextInt();
           	   System.out.println("donner moi b");
           	    float b = sd.nextInt();
           	    float div = a/b;
           	   System.out.println("la division est egale " + div);
           }
            
            void modulo() {
            	System.out.println("l'operetion que vous avez choisi est le modulo ");
              	 @SuppressWarnings("resource")
              	 
           		Scanner smo = new Scanner(System.in);
              	 System.out.println("donner moi a");
           	    int a=  smo.nextInt();
           	   System.out.println("donner moi b");
           	    int b = smo.nextInt();
           	    int multip = a%b;
           	   System.out.println("la modulo de "+a+ " sur " +b+ " est egale " + multip);
           }
            
boolean test(int a, int b)
{
	return a<b;
}

	void test1(int a, int b)
	{
		if(a>b)
			System.out.println("le premier est superieur");
		else
		    System.out.println("le deuxieme est superieur");
		
		    }
	{
	}
	void test2 (int a) 
	{
		switch (a)
		{
		case 10 : System.out.println("passable");break;
		case 12 : System.out.println("assez bien");break;
		case 14 : System.out.println("bien");break;
		case 16 : System.out.println("tres bien");break;
		default : System.out.println("indefini");	
		}
	
}
	  void test3 (int a) {
	         int i = 0 ;
	    	 while (a>30) {
	    		 System.out.println("hello");
	    		 i=i+1;
	    		 if(i==5)
	    		 break;
	    	 }
	    	 System.out.println("inferieur a 30");	
     }
	  
	  void testsigma(int a) {
	  int i = 0;
	  while(a>0)
	  {
		  i=i+a;
		  a--;
		  
				  
	  }
	  System.out.println(i);
	  }
	  

      void sigma() {
      	System.out.println("l'operetion que vous avez choisi est sigma ");
         	 @SuppressWarnings("resource")
         	 
      		Scanner sig = new Scanner(System.in);
         	 System.out.println("donner moi a");
      	    int a=  sig.nextInt();
      	  int i = 0;
    	  while(a>0)
    	  {
    		  i=i+a;
    		  a--;
    		  
    				  
    	  }
      	   System.out.println("sigma de " +a+" est egale " + i);
      }
      

      void testfactorial(int k ) {
       
    	  int i = 1;
    	  while(k>0)
    	  {
    		  i=i*k;
    		  k--;
    		  
    				  
    	  }
    	  System.out.println(i);
      }
      
      void factoriel() {
        	System.out.println("l'operetion que vous avez choisi est le factoriel ");
           	 @SuppressWarnings("resource")
           	 
        		Scanner sfa = new Scanner(System.in);
           	 System.out.println("donner moi a");
        	    int k=  sfa.nextInt();
        	  int i = 1;
        	  while(k>0)
        	  {
        		  i=i*k;
        		  k--;
        		  
        				  
        	  }
        	   System.out.println("factoriel  est egale " + i);
        }
      

	void testouss() {
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
       System.out.println("saisir un numero");
       int x = sc.nextInt();
      int i = 1 ;
      while (i<=0) {
    	  x = x * x ;
    	  i++;
    	  
      }
         System.out.println("la puissance est egal "+x );
      }
      

	void calcula() {
		int s=1;
		do  {
			System.out.println("si tu veux quitter taper 8 ");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	       System.out.println("choisir l'operation");
	       
	       int z = sc.nextInt();
	    
	       switch (z) {
	       case 1 : somme();break;
	       case 2 : soustraction();break;
	       case 3 : multiplication();break;
           case 4 : division ();break;
           case 5 : modulo();break;
           case 6 : sigma();break;
           case 7 : factoriel();break;
           case 8 : s=2; break;
	       default : System.out.println("l'operation n'existe pas");
	       }
		}
	       while(s==1); {
	    	   System.out.println("bey");
	       }

	}
	
	
	void TableMultiplication () {
		
		@SuppressWarnings("resource")
		Scanner sk = new Scanner(System.in);
	       System.out.println("saisir un numero");
	       
	       long f = sk.nextInt();
	      
	       
	      for(int i=1 ;i<10 ;i++) {
	      long mu = f*i;
	      System.out.println(f+"*"+i+"="+mu);
	      }
	    	  
	    	  
 	   
    }
    
	
//	   void sigmafoor() {
//		   System.out.println("l'operetion que vous avez choisi est sigma ");
//       	 @SuppressWarnings("resource")
       	 
//    		Scanner sigf = new Scanner(System.in);
//       	 System.out.println("donner moi a");
//    	       int a=  5;
//    	       sigf.nextInt();
//    	       int i = 0;
    	       
//          	for(a ;a>0 ;a--)
//  	  {
//  		  i=i+a;
  		  
  				  
//  	  }
//    	   System.out.println("sigma de " +a+" est egale " + i);
//	   }
	
	    
	   void pyramide() {
		   System.out.println();
		   System.out.println();
		   System.out.println();
		   int nb=5;
		   int espace=nb+3;
		   for(int i =0 ; i<nb ; i++ ) {
			   for (int j = 0; j <= (espace - i) ; j++) {
				   System.out.print(" ");
				   
			   }
			   for (int k = 1; k<(2*i) ; k++) {
				   System.out.print("*"); 
			   }
System.out.println();
			   
		   }
	   }
	
	
	
	
	
	
	
	
	
}        