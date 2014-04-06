/**
 * OOP Lab 6 
 */
package lab6;

/**
 * @author Vaibhav
 */
public class MovablePoint implements Movable {
	int x, y, xSpeed, ySpeed;
	
	/**
	 * Constructor for MovablePoint
	 * @param x Initial horizontal position
	 * @param y Initial vertical position
	 * @param xSpeed Horizantal movement step-size
	 * @param ySpeed Vertical movement step-size
	 */
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	/**
	 * Serialize the object as a string  
	 */
	@Override
	public String toString() {
		return "Point at (" + this.x + "," + this.y + ")";
	}
	
	/**
	 * Accessor method for X-coordinate
	 * @return Current x position
	 */
	public int getX() {
		return this.x;
	}
	
	/**
	 * Accessor method for Y-coordinate
	 * @return Current y position
	 */
	public int getY() {
		return this.y;
	}
	
	/**
	 * Move a point upward by {@code ySpeed} units<br>
	 * Y axis points downward by default 
	 * @see lab6.Movable#moveUp()
	 */
	@Override
	public void moveUp() {
		this.y -= ySpeed;
	}

	/**
	 * Move a point downward by {@code ySpeed} units<br>
	 * y axis points downward by default
	 * @see lab6.Movable#moveDown()
	 */
	@Override
	public void moveDown() {
		this.y += ySpeed;		
	}

	/**
	 * Move a point left by {@code xSpeed} units
	 * @see lab6.Movable#moveLeft()
	 */
	@Override
	public void moveLeft() {
		this.x -= xSpeed;
	}

	/**
	 * Move a point right by {@code xSpeed} units
	 * @see lab6.Movable#moveRight()
	 */
	@Override
	public void moveRight() {
		this.x += xSpeed;
	}
	
}
