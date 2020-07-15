package week1.day2;

import java.util.Arrays;

public class Largest
{
int[] data= {3,2,11,4,6,7};
int len=data.length;
int lent=len-2;
	public void secondLarge() {
		
Arrays.sort(data);
System.out.println(data[lent]);
	}

	public static void main(String[] args) {
		Largest l = new Largest();
		l.secondLarge();
	}
}
