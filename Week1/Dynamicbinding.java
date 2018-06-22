Animal a = new Animal();
Animal b = new Dog();


package com.shiyanlou;

class Animal{

	public void bark(){
		System.out.println("bark out");
	}
}


class Dog extends Animal{

	public void bark() {
		System.out.println("wang wang wang");
	}

	public void dogType(){
		System.out.println("what kind of bleed it is ");
	}
}

public class Test{

	public static void main(String[] args){
		Animal a = new Animal();
		Animal b = new Dog();
		Dog d = new Dog();
		
		a.bark();
		b.bark();

		d.bark();
		d.dogType();
	}
}

abstract void f();

package com.shiyanlou;

public abstract class TelePhone {
	public abstract void call();
	public abstract void message();
}


package com.shiyanlou;

public class CellPhone extends TelePhone{

	@Override 
	public void call(){
		// TODO AUto-generated mehtod stub 
		System.out.println("I can make a call");
	}

	@Override 
	public void message() {
	
		System.out.println("I mean I can text u");
	}

	public static void main(String[] args){

		CellPhone cp = new CellPhone();
		cp.call();
		cp.message();
	}
}

interface Animal{

	int y = 5;
	public void eat();
	public void travel();
}


public class Cat implements Animal{

	public void eat(){
		System.out.println("CAT eats");
	}

	public void travel(){
		System.out.println("Cat travels");
	}
	public static void main(String[] args){

		Cat cat = new Cat();
		cat.eat()
		cat.travle();
	}
}


