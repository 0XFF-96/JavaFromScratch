interface Food{
	public String getFoodName();
}

interface TableWare{
	public String getTooName();
}

interface KitchenFactory{
	public Food getFood();
	public Tableware getTableWare();
}

class Apple implements Food{
	public String getFoodName(){
		return "apple"
	}
}


class Knife implements TableWare{
	public String getTooName(){
		return "knife";
	}
}

class AKitche implements KitchenFactory{

	public Fodd getFood(){
		return new Apple();
	}
	public TableWare getTableWare(){
		return new Knife();
	}
}

public class Foodaholic {
	public void eat(KitcheFactory k){
		System.out.println("A foodaholic is eating ");
	}
	public static void main(String[] args){
		Foodahollic fh = new Foodaholic();
		KitchenFactory kf = new AKitchen();
		fh.eat(kf);
	}
}



