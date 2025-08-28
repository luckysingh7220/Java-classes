package classprogram;
class student {
	private String name;
	private int rollno;
	private int marks;
	student (String name,int rollno,int marks){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
	public int getmarks() {
		return marks;
	}
	public void setmarks(int marks) {
		if(marks>=0 && marks<=100) {
			this.marks=marks;
			System.out.println("Marks updated");
		}else {
			System.out.println("Inavalid marks");
			
		}
	}
	void display() {
		System.out.println("name:"+name+" "+"roll no : "+"  "+rollno+" "+"marks : "+marks);
	}
	
}
public class tudent{
	public static void main(String[] args) {
		student s1=new student("Lucky",78,99);
		System.out.println(s1.getmarks());
		s1.display();
	}
}