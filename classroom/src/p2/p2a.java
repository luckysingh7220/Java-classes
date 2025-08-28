package p2;
import p1.p1e;
class parent extends p1e{
	void display() {
		System.out.println(name);
		System.out.println(roll_no);
	}
}
public class  child{
	public static void main(String[] args) {
		parent p1=new parent();
		p1.display();
		
	}
}