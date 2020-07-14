package week1.assign1;

import java.util.Scanner;

public class Fact {
	

	public void Facto() {
		int i, n=5, Fact = 1;
 for(i=1;i<=n;i++)
 {
	Fact = Fact*i; 
 }
 System.out.println(Fact);
	}

public static void main(String[] args) {
	Fact myFact = new Fact();
	myFact.Facto();
	
} 
}