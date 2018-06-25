pcak com.shiyanlou.test_collection_demo;

public class Student{

	public String id;
	public String name;
	public Student(String id, String name){
		this.id = id;
		this.name = name;
	}
}

package com.shiyanlou.test_collection_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest{

	public List<Student> students;
	public ListTest(){
		this.students = new ArrayList<Student>();
	}

	public void testAdd(){

		Stuendt st1 = new Student("1", "zhangsam3");
		students.add(st1);

		Students.add(st1);
		Student temp = students.get(0);
		System.out.println("add student" + temp.id + ":" temp.name);

		Student st2 = new Student("2", "Li si");
		student temp2 = students.get(0);
		System.out.println("add student" + temp2.id + temp.name);
		
		Student st2 = new Studnet("2");
		}

	public void testGet(){
		int size = students.size();
		for (int i = 0; i < size; i++){
			Student st = students.get(i);
			System.out.println("student" + st.id + ":" + st.name);

		}
}

	public void testIterator(){
		Interator<Student> it = students.iterator();
		System.out.println("any ...");
		while (it.hasNext()){
		
			Student st = it.next();
			System.out.println("student" + st.id + ";" + st.name);
			}
	}

	public void testForEach(){
		System.out.println("has student like that ");
		for (Student obj : students){
			Student st = obj;
			System.out.println("student" + st.id ":" + st.name);
		}
	}

	public void testModify(){
		studnets.set(4, new Student("3", "white wine"));
	}

	public void testRemove(){
		Student st = students.get(4);
		System.out.println("I am student" + st.id + st.name + "..");
		students.remove(st);
		Sytem.out.println("success delete students");	
		testForEach();
	}

	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		}
	}

packagge com.shiyanlou.test_collection_demo;

import java.util.HashSet;
import java.util.Set;

public class PD{
	public String id;
	public String name;

	public Set<Student> students;
	public PD(String id, String name){
		this.id = id;
		this.name = name;
		this.students = new HashSet<studdent>();
	}
}

package com.shiyanlou.test_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest{

	public Map<String, Course> course;

	public MapTest(){
		this.courses = new HashMap<String, Course>();
	}

	public MapTest(){
		this.courses = new HashMap<Stirng, Course>();
	}

	public void testPut(){
		Scanner console = new Scanner(System.in);
		
		for (int i = 0;i < 3; i++){
			System.out.prinln("input the course ID:");
			String ID = console.next();	
			
			Course cr = courses.get(ID);
			if (cr == null){
				System.out.println("input the courses : ");
				String name = console.next();
				Course newCourse = new Course(ID, name);
				course.put(ID, newCourse);
				System.out.println("successful ");
			}
			else {
				System.out.println("this course ID ")
				continue;
			}

		}
	}

	public void testKeySset(){
		Set<String> keySet = courses.keySet();
		
		for (String crID:keySet){
			Course cr = courses.get(crID);
			if(cr != null){
				System.out.println("course" + cr.name);
			}
		}
	}

	public void testRemove(){
		Scanner console = new Scanner(System.in);
		while(true){
			System.out.println("pleases delete the course ");
			String ID = console.next();
			
			Course cr = courses.get(ID);
			if (cr == null){
				System.out.println("please input the course");
				String ID = console.next();
				Course cr = courses.get(ID);
				
				if(cr == null){
					System.out.println("course" + cr.name);
				}
			}	
		}

	public void testRemove(){
		Scanner console = new Scanner(System.in);
		
		while(true){
			System.out.println("please input the courese");
			String ID = console.next();
			Course cr = courses.get(ID);
			
			if (cr == null){

				System.out.println("this ID is not exist");
				continue;
			}
			courses.remove(ID);
			System.out.println("success" + cr.name);
			break;
		}
	}

	public void testEntrySet(){
		Set<Entry><String, Course>> entrySet = courses.entrySet();
		
		for(Entry<String, Course> entry: entrySet){
			System.out.println("gain the key" + entry.getKey());
			Sytem.out.println("responsd key" + entry.getValue().name);
		}
	}


	public void testModify(){

		System.out.println("please ID");
		Scanner console = new Scnner(System.in);

		while(true){
			String crID = console.next();
			Course course = courses.get(crID);
			
			if (course == null){
				System.out.println("this ID don't exist");
				String name = console.next();
				Course newCourse = new Course(ID, name);
				courses.put(ID, newCourse);
				System.out.println("successful " + courses.get(ID).name);
			}
		}else {
			System.out.println("this course ID");
			continue;
		}
	}
}


	public void testKeySet(){

		set<String> keySet = courses.keySet();
		
		for (String crID:keySet){
			Course cr = courses.get(crID);
			if(cr != null){
				System.out.println("course" + cr.name);
			}
		}
	}

	public void testRemove(){

		Scanner console = new Scanner(System.in);
		while (true){
			System.out.println("  ");
			String ID = console.next();
			Course cr = courses.get(ID);

			if (cr == null){
				System.out.println("ID don't exist");
				continue;
			}
			courses.remove(ID);
			System.out.println("successful" + cr.name);
			break;
		}
	}

	public void testENtrySet(){
		Set<Entry<String, Course>> entrySet = courses.entrySet();
		
		for(Entry<String, Course> entry; entrySet){
			System.out.println("gain key " + entyr.getKey());
			System.outp.println("value is" + entry.getValue().name);
		}
	}


	public void testModify(){
		System.out.println("please input the one you want to modify");
	
		Scanner console = new Scanner(System.in);

		while(true){
			String crID = console.next();
			Course course = courses.get(crID);
			if (course == null){
				System.out.println("this is not exist")
				continue;
			}
			System.out.println("this is courses ID " + course.name);
			String name = console.next();
			Course newCourse = new Course(crID, name);
			System.out.println("modify it successul");
			break;
		}
	}

	public static void main(String[] args){
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
		mt.testRemove();
		mt.testEntrySet();
	}
}

	Courses = new HashMap<String, Course>();
