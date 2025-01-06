package day_6;

import java.util.Scanner;

class Animal
{	
	String name;
	int age;
	static int a=0;
	Animal(String name, int age)
	{
		this.name=name;
		this.age=age;
		a++;
	}
	void displayInfo()
	{
		System.out.println("Animal: "+name);
		System.out.println("Age: "+age);
		
	}
	static int count()
	{
		return a;
	}
}
class Bird extends Animal
{
	String species;
	Bird(String name,int age, String species)
	{
		super(name,age);
		this.species=species;
	}
	void displayInfo()
	{	
		super.displayInfo();
		System.out.println("Bird: "+species);
	}
}
public class Zoo {
	public static void main(String[] a)
	{
		Scanner sc =new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		//Animal obj1 = new Animal(name,age);
		//Animal obj3 = new Animal(name,age);

		Bird obj2 = new Bird("Sparrow", 2, "bird");
		//obj1.displayInfo();
		obj2.displayInfo();
		System.out.println("Animal Count: "+Animal.count());
		//Animal.count();
	}

}
