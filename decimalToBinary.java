import java.lang.*;
import java.util.*;
class decimalToBinary{
	public static void main(String[] args){
		String add="";
		int deci;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number to covert in binary");
		deci=scan.nextInt();
		while(deci!=0)
		{int rem=deci%2;
		add=rem+add;
		deci=deci/2;}
		System.out.println(add);
	}
}