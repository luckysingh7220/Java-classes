/*
package classprogram;
class Parent{
		public int age =50;
		protected String name="Lucky";
			private String secret="xyz";
	public void display() {
		System.out.println("Parent_display");
	}
	public void hidden() {
		System.out.println("Parent hidden methos");
	}
	public static void staticMethod() {
		System.out.println("Static method of parent");
	}
	final void finalMethod() {
		System.out.println("Final method of parent");
	}
}
class Child extends Parent{
	public void show() {
		System.out.println("Name: "+name);
		//System.out.println("Secret:" +secret);//error private not inherit
	}
	//Override display()
	@Override
	public void display() {
		System.out.println("Child display");
	}
}
public class access{
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		c.display();
		Child.staticMethod();
	}
}
*/