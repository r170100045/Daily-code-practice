class Point{
	private double x, y;
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	double getX(){
		return x;
	}
	double getY(){
		return y;
	}
	
}

class Quadrilateral{
	private Point p1, p2, p3, p4;
	Quadrilateral(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4 ) {
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		Point p3 = new Point(x3, y3);
		Point p4 = new Point(x4, y4);		
	}
	Point getPoint1() {
		return p1;
	}
	Point getPoint2() {
		return p2;
	}
	Point getPoint3() {
		return p3;
	}
	Point getPoint4() {
		return p4;
	}
	
	
}
class Trapezoid extends Quadrilateral{
	private double height;
	Trapezoid(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4 ){
		super(x1, x2, x3, x4, y1, y2, y3, y4);
	}
	double getHeight(){
		if (getPoint1().getY() == getPoint2().getY()) {
			return Math.abs(getPoint2().getY() - getPoint3().getY());
		}else {
			return Math.abs(getPoint1().getY() - getPoint2().getY());
		}
	}
	double getArea() {
		return height * getSumOfTwoSides()/2.0;
	}
	double getSumOfTwoSides() {
		if (getPoint1().getY() == getPoint2().getY()) {
			return Math.abs(getPoint1().getX() - getPoint2().getX()) + Math.abs(getPoint3().getX() - getPoint4().getX());
		}else {
			return Math.abs(getPoint1().getX() - getPoint4().getX()) + Math.abs(getPoint2().getX() - getPoint3().getX());
		}
	}
}
class Parallelogram extends Trapezoid{
	Parallelogram(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4){
		super(x1, x2, x3, x4, y1, y2, y3, y4);
	}
}
class Rectangle extends Parallelogram{
	Rectangle(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4){
		super(x1, x2, x3, x4, y1, y2, y3, y4);
	}
}
class Square extends Rectangle{
	Square(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4){
		super(x1, x2, x3, x4, y1, y2, y3, y4);
	}
	
}
public class QuadrilateralAreaHierarchy {

	public static void main(String[] args) {
		Square s1 = new Square(1,3,3,1,1,1,3,3);
		System.out.println(s1.getPoint2().getY());

	}

}
