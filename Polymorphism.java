package basic;

public class Polymorphism {

	public static void main(String[] args) {
		A a=new A();
		a.fun();
		B b=new B();
		b.fun();
		A a2=new B();
		a2.fun();

	}

}

class A
{
public void fun()
{
	System.out.println("A");
}
}

class B extends A
{
public void fun()
{
	System.out.println("B");
}
}

