package calcul_test;

public class calculatrice {
	
	
	public static int addition(int a,int b){
		int sum = a+b ;
		return sum;
	}
	
	public static int soustraction(int a,int b){
		int res = a-b ;
		return res;
	}
	
	public static int produit(int a,int b){
		int res = a*b ;
		return res;
	}
	
	public static String division(int a, int b){
		String res ;
		if(b==0)
		res = " Math error";
		else
		res = ""+a/b ;
		return res;
	}
}
