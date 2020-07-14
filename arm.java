package week1.assign2;

public class arm {
	public void armStrong() {
	int j=0,n=1,k;
	int l=n;
while(n!=0)
{
	k=n%10;
	j=j+k*k*k;
	n=n/10;
}
if(j==l)
	System.out.println(" it is an armstrong number");
	else
System.out.println("not an armstrong number");
	}
public static void main(String[] args) {
	arm myArm = new arm();
	myArm.armStrong();
}
}
