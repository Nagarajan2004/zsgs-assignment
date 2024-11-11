package methodoverloading;

class MethodOverLoadDemo{
	//add
	public int add(int a, int b) {
		return a+b;
	}
	public int add(int ...a) {
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		return sum;
	}
	public double add(double a, double b) {
		return a+b;
	}
	public double add(double ...a) {
		double sum = 0;
		for(double i : a) {
			sum += i;
		}
		return sum;
	}
	
	//sub
	public int subtract(int a, int b) {
		return a-b;
	}
	public int subtract(int ...a) {
		int sum = a[0];
		for(int i = 1; i < a.length; i++) {
			sum -= a[1];
		}
		return sum;
	}
	public double subtract(double a, double b) {
		return a-b;
	}
	public double adsubtractd(double ...a) {
		double sum = a[0];
		for(int i = 1; i < a.length; i++) {
			sum -= a[1];
		}
		return sum;
	}
	
	//multiply
	public long multiply(int a, int b) {
		return a * b;
	}
	public long multiply(int ...a) {
		long res = 1;
		for(int i : a) {
			res *= i;
		}
		return res;
	}
	public double multiply(double a, double b) {
		return a * b;
	}
	public double multiply(double ...a) {
		double res = 1;
		for(double i : a) {
			res *= i;
		}
		return res;
	}
	
	//divide
	public double divide(double a, double b) {
		if(b == 0.0) {
			throw new ArithmeticException("infinite");
		}
		return a/b;
	}
}

public class BasicMathematicalOperation {
	public static void main(String[] args) {
		MethodOverLoadDemo m = new MethodOverLoadDemo();
		System.out.println(m.add(2,3.0,4,5));
		System.out.println(m.subtract(5,3,5,5,5));
		System.out.println(m.multiply(3,2,1,9));
		System.out.println(m.divide(9, 4));
	}
}
