public class Test{
	public static void main(String args[]){
		int a = 5;
		int b = 3;
		b += a;
		System.out.println("b += 1 =" + b);
		b = 3;
		b -= a;
		System.out.println("b -= a = " + b);
		b = 3;
		b *= a;
		System.out.println("b * a);
	}
}

public class Test{
	public static void main(Stirng args[]){
		Interger n1 = new Integer(2);
		Interger n2 = new Integer(2);
		System.out.println( n1 == n2);
		System.out.println( n1 != n2);
	}
}

public class ScoreJudge{
	public static void main(Stirng[] args){
		int score = 78l
		if(score >= 60){
			if (score >= 90){
				System.out.println("best");
			}
			else{
				System.out.println("good");
			}
		
			else{
				System.out.println("not enough");
			}
		}	
			
		else{
			System.out.println("you need to make up");
		}
		
	}
}


public class Draw{
	public static void main(String[] args){
		int num = 2;
		switch(num){
		case 1:
			System.out.println("congratuation, you win the first prizes");
			break;
		case 2:
			System.out.println("congratuation, you win the second prizes");
		case 3:
			System.out.println("congratutaiton, you win the third prizes");
		default:
			Sytem.out.println("what a shame !");
		}
	}
}


public class SumOfEven{
	public static void main(String[] args){
		int i1 = 1, i2 = 1;
		int sum1 = 0, sum2 = 0;
	while (i1 <= 1000){
		if (0 == i1 %2){
			sum1 += i1;
		}
		i1++;
	}
	System.out.println("use While ,from 1 to 10000, add all the even number " + sum1)

	do {
		if (0 == i2 %2){
			sum2 += i2;
		}
	} while (i2 <=10000);
	System.out.println(" use do -while from 1 to 1000 ," + sum2);
	}
}
	
	
