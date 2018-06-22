public class PrintScore {
	public static void main(String[] args){

		PrintScore a = new PrintScore()
		int rSum;
	
		rSum = a.calcSum(78, 99);
		System.out.println("summary" + rSum);
	}

	public int calsum(int a, int b){
		int sum = a + b;
		return sum;
	}
}

public void printName(String name){
	System.out.println(name);
}

public void printName(String name){
	System.out.println(name);
}


public class PrintScore{
	public static void main(String[] args){
	
		PrintScore a = new printScore();

		double rAve;

		int sub1 = 78;
		int sub2 = 99;

		rAve = a.calcAve(sub1, sub2);
		System.out.println("Average" + rAve);
	}
	
	public double calcAve(int a, int b){

		double ave = (a + b) / 2;
		return ave;
	}
}


public class Test{

	void f(int i) {
		System.out.println("i" + i);
	}
	void f(float f){
		System.out.println("f" + f);
	}
	void f(String s){
		System.out.println("S=" + s);
	}
	void f(String s1, String s2){
		System.out.println(" s1 + s2" +(s1 + s2))
	}
	void f(String s, int i ){
		System.out.println("S=");
	}
	public static void main(String[] args){

		Test test = new Test();
		test.f(3456);
		test.f(34.56f);
		test.f("abc");
		test.f("abc", "def");
		test.f("abc", 3456);
	}
}

public class PrintTriangle {
	public static void main(String[] args){
		
		PrintTriangle a = new PrintTriangle();
		int lastNum;

		lastNum = a.printRightTriangle(5);
	
		System.out.println("the last value id " + lastNum);
	}

	public int printRightTriangle(int n){
		int last = 0;
		for (int i = 1; i <= n; i ++){
			for(int j = 1; j <= i; j++){
				last++;
				System.out.printf("%02d", last);
			}
			System.out.println();
		}
		return last;
	}
}


