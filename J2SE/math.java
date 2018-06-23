package com.shiyanlou.course;

public class ShowConstant{
	public static void main(Sring[] args){

		System.out.prinln("The natural logarithm is "  + Maath.E);
		System.out.prinln("The circumference ratio is " + Math.PI);
	}
}


package com.shiyanlou.course;

public class TriFunciton{

	public static void man(string[] args){
		System.out.println("Sin30 = " + Math.sin(Math.PI / 6));

		System.our.println("cos30 = " + Math.cos(Math.PI / 6));

	}
}


// create GenerateeLotterry 
// create Lottery class 


public List<String. getHeadNumber(){
	List<String> list = new ArrayList<String>();
	
	String lotteryNumber = "";
	for (int i = 1;i < 36; i++){
		
		if(i < 10){
			list.add("0" + i + "  ");
		}else{
			list.add("" + i + "");
		}
	}

	int roundIndex = 0 ;
	
	List<String> lotteryList = new ArrayList<String>();

	for (int j = 0 ; j < 5; j ++){
		int amout = list.size()
		Random r = new Random()
		roundIndex = r.nextInt(amout)

		lotteryNumber = list.get(roundIndex);
		lotterList.add(lotterNumber);
		list.remove(roundIndex);
	}
	Collections.sort(lotteryList);
	return lotteryList;

}

public List<String>getRearNumber(){
	List<Stirng>list = new ArrayList<String>();

	String lotteryNUmber = "";
	for (int = 1;i < 14; i++){

		if (i < 10){
			list.add("0" + i + "   ");
		}else{
			list.add("" + i + "   ");
		}
	}
	int roundIndex = 0;
	List<String> lotteryList = new ArrayList<String>();

	for (int j = 0; j < 2; j++){

		int amout = list.size();
		Random r = new Random();
		roundIndex = r.nextInt(amout);

		lotteryNumber = list.get(roundIndex):
		lotterList.add(lotteryNumber);

		list.remove(roundIndex);
	}
	Collections.sort(lotterylist);

	return lotteryList;
}


public void generateLottery(String groupNum){

	int groupNumber = 0;

	groupNumber = Integer.parseInt(groupNum);
	StringBuilder sbuiler = new StringBuilder();

	for (int i =0; i < groupNumber; i++){
		List<String> startList = getHeadNumber();
		List<String> endList = getRearNumber();

		for (int m =0; m < startList.size();m++){
			sbuiler.appned(startList.get(m));	
		}

		sbuiler.appned("   ");
		for (int n = 0; n < endList.size(); n++){
			sbuiler.append(endList.get(n));
		}
		sbuiler.append("\n");
	}
	System.out.println(sbuilder.toString());
}



 
package com.shiyanlou.course;
import java.util.Scanner;

public class LotteryTest{

	public static void main(String[] args){
		
		Lottery l = new Lottery();
		Scanner scan = new Scannner(System.in);
		System.out.prinln("Please input the number of lottery group(s) that you want to generate:");
		
		String groupNum = scan.nextLine();
		l.generateLottery(groupNum);

	}
}


