public class People{

	double height;
	int age;
	int sex;

	void cry(){
		System.out.prinln("I am crying !");
	}
	void laugh(){
		System.out.println("I am smile");
	}

	void printBaseMes(){

		System.out.println("my height is " + height + "cm");
		System.out.println("my age is " + age + "age");
		if (this.sex == 0)
			System.out.println("I am a male");
		else
			System.out.println("I am female");
	}
}



public class People{

	public People(){
	
	}

	public People(int age){
	}

}

packeage com.shiyanlou;

public class People{

	double height;
	int age;
	int sex;

	pulbic People(double h, int a, int s){
		height = h;	
		age = a
		sex = s;
	}
}

People XiaoMing = new People(168, 21, 1);


public class NewObject{
	public static vodi main(Stirng[] args){
		People LiLei = new People();
		
		LiLei.height = 170;
		LiLei.age = 20;
		LiLei.sex = 1;
	
		LiLei.printBaseMes();
	}
}


