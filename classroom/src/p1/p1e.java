package p1;
class student{
	String name="lol";
	protected int roll_no=89;
	void display() {
		System.out.println("class_student");
	}
}
public class p1e{
	public static void main(String[] args) {
		student s=new student();
		System.out.println(s.name);
		System.out.println(s.roll_no);
	}
}