import javax.swing.JOptionPane;


public class CarDriver {
	public static void main (String[] args) {
		CarClass car1 = new CarClass();
		System.out.println(car1.toString());
		
		CarClass car2 = new CarClass("silver", "300", "large");
		System.out.println(car2);
		
		System.out.println(car1.getColor());
		System.out.println(car1.getEnginesize());
		System.out.println(car1.getHorsepower());
		
		String color1 = JOptionPane.showInputDialog(null, "What color would you like the car to be?");
		String horsepower1 = JOptionPane.showInputDialog(null, "How much horsepower?");
		String engine1 = JOptionPane.showInputDialog(null, "How big is the engine?");

		CarClass car3 = new CarClass(color1, horsepower1, engine1);
		JOptionPane.showMessageDialog(null, car3);
		
		String color2 = JOptionPane.showInputDialog(null, "What color would you like car 2 to be?");
		String horsepower2 = JOptionPane.showInputDialog(null, "How much horsepower for car 2?");
		String engine2 = JOptionPane.showInputDialog(null, "How big is the engine for car 2?");
		
		CarClass car4 = new CarClass();
		car4.setColor(color2);
		car4.setHorsepower(horsepower2);
		car4.setEnginesize(engine2);
		JOptionPane.showMessageDialog(null, car4);
		
		String color3 = JOptionPane.showInputDialog(null, "What color would you like car 3 to be?");
		String horsepower3 = JOptionPane.showInputDialog(null, "How much horsepower for car 3?");
		String engine3 = JOptionPane.showInputDialog(null, "How big is the engine for car 3?");
		
		CarClass car5 = new CarClass();
		car5.setColor(color3);
		car5.setHorsepower(horsepower3);
		car5.setEnginesize(engine3);
		JOptionPane.showMessageDialog(null, car5);
		
		JOptionPane.showMessageDialog(null, "Car 2 and Car 5 comparison results is " + car2.equals(car5));
		JOptionPane.showMessageDialog(null, "There are " + CarClass.getcarCount() + " cars.");
		
		
		
	}

}
