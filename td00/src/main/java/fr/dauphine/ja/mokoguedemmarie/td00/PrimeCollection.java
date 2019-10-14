package fr.dauphine.ja.mokoguedemmarie.td00;

import java.util.ArrayList;
import java.util.Random;


/**
 * Bonjour!
 *
 */
public class PrimeCollection 
{
	
	public int toto;
	public ArrayList<Integer> numbers;
	
	public PrimeCollection () {
		
	numbers = new ArrayList<Integer>();
	
	}
	
	public void initRandom(int n,int m) {
		
		Random random =new Random();
		for(int i=0 ; i<m;i++) {
			int RandomInt=random.nextInt(n);
			numbers.add(RandomInt);
		}
		
	}
	
	public static boolean isPrime (int p) {
		if (p==1 || p==0) return false;
		else {
		
		 for(int i = 2;i< Math.sqrt(p);i++) {
			 
			 if(p%i == 0)  return false; 
		 
		 }
		 	 
			return true ;
		 
	
		 }
	}
	
	public void printPrime() {
		
		for(int i = 0;i< numbers.size();i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
	 
	
    public static void main( String[] args )
   
	  {
        System.out.println( "Hello World!" );
      PrimeCollection p =new PrimeCollection();
      p.initRandom(15, 1000);
      //p.printPrime();
      PrimeCollection.isPrime(10);
      
       
    }
}