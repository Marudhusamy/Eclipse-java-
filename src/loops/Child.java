package loops;

public class Child extends Parent{
	int age=18;

	public Child() {
		System.out.println("Child constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		ch.display();

	}
	private void display() {
		// TODO Auto-generated method stub
		System.out.println(age);
		System.out.println(super.age);
		
	}

}
