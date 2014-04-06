/**
 * 
 */
package lab6;

/**
 * @author Vaibhav
 *
 */
public class MovableCircle implements Movable {
	private MovablePoint center;
	private int radius;
	
	/**
	 * Constructor for MovableCircle
	 * @param x Initial horizontal position
	 * @param y Initial vertical position
	 * @param xSpeed Horizantal movement step-size
	 * @param ySpeed Vertical movement step-size
	 * @param radius Radius of the circle
	 */
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	
	public String toString() {
		return "Center at (" + center.x + "," + center.y + ")";
	}
	
	
	/**
	 * @see lab6.Movable#moveUp()
	 * Default: Y-axis points downwards
	 */
	@Override
	public void moveUp() {
		center.moveUp();
	}

	/**
	 * @see lab6.Movable#moveDown()
	 * Default: Y-axis points downwards
	 */
	@Override
	public void moveDown() {
		center.moveDown();;
	}

	/**
	 * @see lab6.Movable#moveLeft()
	 */
	@Override
	public void moveLeft() {
		center.moveLeft();
	}

	/**
	 * @see lab6.Movable#moveRight()
	 */
	@Override
	public void moveRight() {
		center.moveRight();
	}

}
