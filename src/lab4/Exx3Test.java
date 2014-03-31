package lab4;

class A { public int a = 10;}
class B extends A { public int a = 20; }
class C extends B { public int a = 30; }
class D extends C { public int a = 40; }

class E extends D {
	public int a = 50;
	public void show() {
		int a = 0;
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		System.out.printf("A:%d\nb:%d\nC:%d\nD:%d\nE:%d\nE::local:%d\n", 
				a1.a, b1.a, c1.a, d1.a, this.a, a);
	}
}

public class Exx3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E e = new E();
		e.show();
	}

}
