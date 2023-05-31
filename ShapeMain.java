package OCP2;

import java.text.DecimalFormat;

public class ShapeMain {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(4,5);
		Circle circle = new Circle(3);
		
		Shape[] shapes = new Shape[] { rectangle, circle };
		
		AreaCalculator areaCalculator = new AreaCalculator();
		double totalArea = areaCalculator.sumAreas(shapes);
		
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		String formattedTotalArea = decimalFormat.format(totalArea);
		
		System.out.println("Total Area: " + formattedTotalArea);

	}

}
