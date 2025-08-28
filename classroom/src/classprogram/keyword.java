package classprogram;
class Parent1 {
	String name="Lucky";
	Parent1(){
		System.out.println("Parent class constructor");
	}
	void display() {
		System.out.println(this.name);
	}
}
class child extends Parent1 {
	String name="lol";
	void play() {
		System.out.println(this.name);
		System.out.println(super.name);
		super.display();
	}
	child(){
		super();
		
	}
	
}
public class keyword{
	public static void main(String[] args) {
		child c= new child();
		c.play();
	}
}