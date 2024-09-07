package lab_exercise;

public class Car {
	private String model;
    private String color;
    private boolean isRunning;

    // Constructor to initialize the Car object
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.isRunning = false; // Car is off initially
    }

    // Method to start the car
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The car '"+model+"' is now started.");
        } else {
            System.out.println("The car '"+model+"' is already running.");
        }
    }

    // Method to stop the car
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The car '"+model+"' is now stopped.");
        } else {
            System.out.println("The car '"+model+"' has already stopped.");
        }
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("Toyota Camry", "Blue");

        // Display car attributes
        System.out.println("Car model: " + car.getModel());
        System.out.println("Car color: " + car.getColor());

        // Start and stop the car
        car.start();
        car.stop();
        car.stop(); // Trying to stop the car again to demonstrate the check
        car.start();
	}

}
