package exceptionHandling;

public class ExceptionTryCatch {
	int a=10,b=10;
	String string="abcd";
	public void sum() {
		System.out.println(a+b);
	}
public void multiplication() {
	System.out.println(a*b);
      System.out.println(a+b);

}
public void division() {
	try {
	System.out.println(a/b);
	System.out.println(a/0);
	}
	catch (ArithmeticException ae) {
		System.out.println(ae.getMessage());
	}
	
}
	public static void main(String[] args) {
		ExceptionTryCatch exceptions=new ExceptionTryCatch();
		System.out.println("Exicution starts");
		System.out.print(" ");
		exceptions.sum();
		exceptions.multiplication();
		exceptions.division();
		System.out.println("exicution ends");
	}


}
