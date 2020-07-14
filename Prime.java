package week1.day2;

public class Prime {

	public void checkPrime() {
		int n=4,i,count=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				count=count+1;
		}
if(count==2)
	System.out.println("prime number");
else
	System.out.println("not a prime number");
	}
public static void main(String[] args) {
	Prime v=new Prime();
	v.checkPrime();
}
}
