package CodePush;

public class Student
{ 
	public Student(){
		
	System.out.println("Raja");	
	}
	public Student(int a)
	{
		System.out.println("one parameter");
	}
	public Student(int a,int b)
	{
		System.out.println("Two parameter");
	}
	public Student(int a,int b,int c) {
		System.out.println("Three parameter");
	}
	
	public static void main (String args[])
	{
	 Student s=new Student();
	 
	 Student s1=new Student(25);
	 
	 Student s2=new Student(25,26);
	 Student s3=new Student(25,26,27);
	 
	}
	 	
	
	{
}

	}


