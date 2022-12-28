package week1.day1;

public class Report {
	public static void main(String[] args) {
		Student s= new Student();
		s.studentName="Dhinesh";
		s.rollNumber=7;
		s.collegeName="Anna University";
		s.markScored=4500;
		s.cgpa=8.25f;
           
     System.out.println("The Student Name is "+s.studentName);
     System.out.println("The roll Number is "+s.rollNumber);
     System.out.println("The college name is "+s.collegeName);
     System.out.println("Marks scored by the student is "+s.markScored);
     System.out.println("CGPA of the student is "+s.cgpa);
	}

}
