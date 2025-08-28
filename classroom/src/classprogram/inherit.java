package classprogram;
class A{
	String name="Lucky";
	int roll_no=1;
	int age=20;
	void show() {
		System.out.println("Parent-Class");
	}
}
class B extends A{
	void display() {
		System.out.println("child-class");
	}
}
class C extends A{
	void add() {
		System.out.println("Class C method");
	}
}
public class inherit{
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.name);
		System.out.println(b.roll_no);
		b.show();
		b.display();
		C c=new C();
		System.out.println(c.name);
		System.out.println(c.roll_no);
		c.show();
	}
}
//Multi level inheritence a parent child its immediate child then immediatee child of the current child
// one parent and one child class only the inheritence is called single inheritence
// one parent and more than one  immediate child then herarchial inheritence 
// two parents of a single child then multiple inheritence
//two immediate child of same parent and a common child of the two previous child then Hybrid inheritence