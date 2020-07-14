package week1.assign2;

public class Sod {
	public void sodProg() {
	int n=456,j=0,k;
	while(n>0)
	{
		k=n%10;
		j=j+k;
		n=n/10;
	}
	System.out.println(j);
	}
public static void main(String[] args) {
	Sod mySod = new Sod();
	mySod.sodProg();
}
}
