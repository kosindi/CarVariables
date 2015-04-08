
public class CarClass {
	private String color;
	private String horsepower;
	private String enginesize;
	public static int carCount;
	public boolean equals(CarClass Cars){
		return (this.color .equals(Cars.color))
		&& 	   (this.enginesize .equals(Cars.enginesize))
		&&	   (this.horsepower .equals(Cars.horsepower));
	}
	
	
	public CarClass () {
		this.color = "silver";
		this.horsepower = "300";
		this.enginesize = "large";
		carCount++;
	}
	
	
	public CarClass(String color, String horsepower, String enginesize) {
		this.color = color;
		this.horsepower = horsepower;
		this.enginesize = enginesize;
		carCount++;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getHorsepower() {
		return this.horsepower;
	}
	
	public void setHorsepower(String horsepower) {
		this.horsepower = horsepower;
	}
	
	public String getEnginesize() {
		return this.enginesize;
	}
	
	public void setEnginesize(String enginesize) {
		this.enginesize = enginesize;
	}
	
	public String toString() {
		return "The car is " + this.color + " with a horse power of " + this.horsepower + ". Also the engine is " +
				this.enginesize + ".";
	}
	
	public static int getcarCount() {
		return carCount;
	}
	
	

}