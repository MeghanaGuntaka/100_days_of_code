package day_7;

class Student
{
	final int maxGrades=10;
	static int totStud;
	String sclName;
	final int MaxGrades()
	{
		System.out.println("Max Grades: "+maxGrades);
		return 0;
	}
	static void studentCount()
	{
		totStud++;
	}
	void sclName()
	{
		System.out.println("School Name: "+sclName);
	}
	Student(String sclName)
	{
		//this.sclName=sclName;
		studentCount();
		System.out.println("Students Count: "+ sclName);
	}
	Student()
	{
	}
	public String toString()
	{
		return sclName+" "+maxGrades;
	}
}
public class StudentMarks {
	public static void main(String[] a)
	{
		Student s1=new Student("Meghana");
		Student s2=new Student("Pallavi");
		s1.MaxGrades();
		s1.sclName();
		//s2.sclName();
		System.out.println("Total Students: "+Student.totStud);
	}

}
