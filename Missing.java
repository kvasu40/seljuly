package week1.day2;

public class Missing {
	public void misEle() {
		int[] a= {1,2,3,4,7,6,8};
		int j=0,i;
		for(i=0;i<=a.length;i++)
		{
			if(a[i]!=i+1)
			{
				i=i+1;
			System.out.println(i);	
			break;
			}
		}
		
	}
public static void main(String[] args) {
	Missing m = new Missing();
	m.misEle();
} {
	

}
}
