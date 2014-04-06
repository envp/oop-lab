/**
 * OOP Lab 6
 */
package lab6;

/**
 * @author Vaibhav
 */
public class TestMovable {

	/**
	 * @param args CLI args
	 */
	public static void main(String[] args) {
		Movable m1 = new MovablePoint(5, 5, 10, 10);
		Movable m2 = new MovableCircle(0, 0, 5, 5, 10); 
		m1.moveLeft();
		System.out.println(m1);
		m1.moveRight();
		System.out.println(m1);
		m2.moveUp();
		System.out.println(m2);
	}
}
