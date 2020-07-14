package week1.day2;

public class Calculator {
public int  addProg(int num1, int num2) {
	int sum;
sum= num1+num2;
return sum;
}
public double subProg(double num1, double num2) {
	double dif;
dif= num1-num2;
return dif;
}
public static void main(String[] args) {
	Calculator myCal = new Calculator();
	myCal.addProg(50,20);
	myCal.subProg(60.5,30.5);
	int calu=myCal.addProg(50,20);
	System.out.println(calu);
	System.out.println(myCal.subProg(60.5,30.5));
}
}
