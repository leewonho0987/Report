package OCP2;

public class AreaCalculator {

		public double sumAreas(Shape[] shapes)
		{
			double sum = 0;
			for(Shape shape : shapes)
			{
				sum = sum + shape.calculateArea();
			}
			
			return sum;
		}
	
}
