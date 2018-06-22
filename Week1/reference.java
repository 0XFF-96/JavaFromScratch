public class Test {
	public static void main(String[] args) {
		int [] a1 = {1, 2, 3};
		int [] a2;
		a2 = a1;
		
		for (int i = 0;i < a2.length; i++){
			a2[i]++;
		}
		for (int i = 0 ;i < a1.length;i++){
			System.out.println(a1[i]);
		}
	}
}

int [] ages = {12, 18, 9, 33, 45, 60};
for (int i =0; i < ages.length; i++){
	System.out.println(" array is "+(i+1) + "number of element " + ages[i]);
}


String [][] name = {{"ZhaoYi", "QianEr", "SumSan"},
		   {"Lisi", "ZhouWu", "WULiu"}};
	for (int i = 0; i < 2; i ++){
		for (int j = 0 ;j < 3; j++){
			System.out.println(name[i][j]);
		}
	}


public class PrintNum{
	public static void main(String[] args){
	int num[][] = new int[10][10]
	int count = 0;
	for (int i=0; i < 10; i++){
		num[i][j] = ++count;
		System.out.printf("%3d", num[i][j]);
		}
		System.out.println();
	}
}


