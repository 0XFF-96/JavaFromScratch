
package com.shiyanlou.course


import java.util.ArrayList;
import java.util.List;


public class ArrayListTravelsla {
	public static void main(String[] args){
		List<Integer> lsit = new ArrayList<Integer>();

		for (int i=0; i < 10;i++){
			list.add(i);
		}

		System.out.println("Items is the lsit:");
		System.out.println(list);
	
		System.out.prinln("Items in the list with odd index;");

		for (int i = 1; i < list.size(); i += 2){

			System.out.print(list.get(i) + "  ");
		}
	}
}


package com.shiyanlou.course;


import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookByMap{

	public static void main(String[] args){
		HashMap<String, String> phonebook = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in)
		String keyword = new String();
		phonebook = initPhoneBook(phonebook);

		System.out.prinln("plesage input a name that you want to search");

		keyword = scan.nextLine();
		
		while (keyword.isEmpty()){
			System.out.println("please input a name!");
			keyword = scan.nextLine();
		}

		System.out.prinln("the result is :");
		System.out.println(queryPhone(phonebook, keyword));
		scan.close();

	}


	private static HashMap<String, String> initPhoneBook(HashMap<String, String>phonebook){

		phonebook.put("Steve", "21321");
		phonebook.put("BOe", "123");
		phonebook.put("perpe,"213");

		return phonebook;
	}


	private static String queryPhone(HashMap<String, String> phonebook, String Keyword){

		String result = new String();

		result = phonebook.get(keyword);

		if (result == null)
			return "can not find this user";

		return result;

	}
}



