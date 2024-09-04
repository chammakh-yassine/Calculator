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
		String  res ;
		if(b==0)
		res = "error";
		else
		res = ""+a/b ;
		return res;
	}
	

	public static int blanche_test(int a,int b){
		if(a == b)
			return 0;
		else if(a<b)
			return b-a;
		else
			return 2*a*b;
	}
}
