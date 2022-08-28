/**
 * 
 */
package shape.shapes;

import shape.ShapeInfo;
import shape.Dimension;

/**
 * This class defines a rectangle shape.
 * 
 * @author Promineo
 *
 */
public class Rectangle extends BaseShape {
  protected double width;
  protected double length;

  /**
   * Rectangles are 4-sided shapes in which the opposite sides have the same length. The constructor
   * supplies the lengths of the two sides.
   * 
   * @param width The width of the rectangle
   * @param length The height of the rectangle
   */
  public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  /**
   * The area of a rectangle is the product of the lengths of the two adjacent sides.
   */
  @Override
  public double area() {
    return width * length;
  }

  /**
   * The perimeter of a rectangle is the sum of all four sides.
   */
  @Override
  public double perimeter() {
    return (width + length) * 2;
  }

  /**
   * 
   */
  @Override
  protected ShapeInfo shapeInfo() {
    ShapeInfo info = new ShapeInfo("rectangle");
    String widthName = "width";
    String lengthName = "length";

    info.getDimensions().add(new Dimension(widthName, width));
    info.getDimensions().add(new Dimension(lengthName, length));
    info.getDimensions().add(new Dimension(widthName, width));
    info.getDimensions().add(new Dimension(lengthName, length));

    return info;
  }

}
