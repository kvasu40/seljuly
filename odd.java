package week1.assign2;

public class odd {
	
	public void oddNum() {
		int i;
		for(i=1; i<=20;i++)
		{
			if(i%2!=0)
			{
			System.out.println(i);
			}
		}
	}
public static void main(String[] args) {
	odd myOdd = new odd();
	myOdd.oddNum();
}
}
