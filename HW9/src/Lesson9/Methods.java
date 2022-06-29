package Lesson9;

public class Methods {
	
	private static int a;
	private static int b;
	
	public Methods(int a, int b) {
		this.a=a;
		this.b=b;
	}
  
	public int plus() throws MyException {
		Methods.check();
		return a+b;
	}
	
	public int minus() throws MyException {
		Methods.check();
		return a-b;
	}
	
	public int multiply() throws MyException {
		Methods.check();
		return a*b;
	}
	
	public int devide() throws MyException {
		Methods.check();
		return a/b;
	}
	
	static void Result(double result) {
		System.out.println(+ result);
	}
	
	static void check() throws MyException {
		if ((a<0) && (b<0)) {
			throw new IllegalArgumentException();
		}
		
		if (((a==0) && (b!=0)) || ((a!=0) && (b==0))) {
			throw new ArithmeticException();
		}
		
		if ((a==0) && (b==0)) {
			throw new IllegalArgumentException();
		}
		
		if ((a>0) && (b>0)) {
			throw new IllegalArgumentException();
		}
		
	}
	
}
