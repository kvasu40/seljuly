package week1.assign2;

public class Fib {
	public void fibSeq() {
		int n=8, n1=0,n2=1,n3,i;
		for(i=2;i<8;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}

	}
public static void main(String[] args) {
	Fib myFib = new Fib();
	myFib.fibSeq();
}
}
