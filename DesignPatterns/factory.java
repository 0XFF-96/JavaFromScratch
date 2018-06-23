public interface Human{
	public void eat();
	public void sleep();
	public void beat();
}


public class Male implements Human{
	public void eat(){
		System.out.println("male can eat");
	}
	public void sleep(){
		System.out.prinln("male can sleep");
	}
	public void beat(){
		System.out.println("Male can beat");
	}
}

public class Female implements Human{
	pulbic void eat(){
		System.out.println("Female can eat");
	}
	public void sleep(){
		System.out.println("Feamale can sleep");
	}
	public void beat(){
		System.out.println("Feamale can sleep");
	}
	public void beat(){
		Sytem.out.println("Female can beat");
	}
}

public class HumanFactory{
	pbulic Human createHuman(String gender){
		if (gender.equals("male")){
			return new Male();
		}else if (gender.equals("female")){
			return new Female();
		}else{
			System.out.println("please input the right ");
			return null;
		}
	}
}


public class FactoryTest{
	public static void main(String[] args){
		HumanFactory factory = new HumanFactory();
		Human male = factory.createHuman("male");
		male.eat();
		male.sleep();
		male.beat();
	}
}

public class HummanFacotry{
	public Male createMale(){
		return new Male();
	}
	public Female createFemale(){
		return new Female();
	}
}

public class FactoryTest{
	public static void main(String[] args){
		HumanFactory factory = new HumanFactory();
		Human male = factory.createMale();
		male.eat();
		male.sleep();
		male.beat();
	}
}

public class humanFactory{
	public static Male createMale(){
		return new Male();
	}
	public static Female createFemale(){
		return new Female();
	}
}

public class FactoryTest {
	public static void main(String[] args){
		Human male = Humanfacotry.createMale();
		male.eat();
		male.sleep();
		male.beat();
	}
}



