package week1.day2;

import java.util.Arrays;

public class Arraylen {
	int i;
	
public void arrayEle() {
	int[]  a = new int[3];
	int len= a.length;
	int lent=a.length-1;
	a[0]= 25;
	a[1]= 15;
	a[2]= 23;
	System.out.println(len);
	System.out.println(a[lent]);
	Arrays.sort(a);
 for(i=0;i<3;i++)
	{ 
		System.out.println(a[i]);
	}
for(i=len-1;i>=0;i--)
	{
		System.out.println(a[i]);
	}
}
public static void main(String[] args) {
	Arraylen myArr = new Arraylen();
	myArr.arrayEle();
	}
}
