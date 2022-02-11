package by.htp.ac_task02.car;

public class Demo {
	
	/*
	 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо, 
	 * вывести на консоль марку автомобиля.
	 */

	public static void main(String[] args) {
		Car car = new Car("Toyota Corolla 1.8 CVT Hybrid", new Engine("1zrl5", 1598), 10);		
		car.addWheel(new Wheel(WheelType.WINTER, 16));
		car.addWheel(new Wheel(WheelType.WINTER, 16));
		car.addWheel(new Wheel(WheelType.WINTER, 16));
		car.addWheel(new Wheel(WheelType.WINTER, 16));		
		CarView.printInfoAboutCar(car);
		
		car.move();
		car.setFuelLevel(0);
		car.move();
		car.addFuel(15);
		car.move();
		car.getEngine().setStart(false);
		car.changeWheel(new Wheel(WheelType.SUMMER, 15), 0);
		car.changeWheel(new Wheel(WheelType.SUMMER, 15), 1);
		CarView.printInfoAboutCar(car);
		CarView.printCarModel(car);		
	}
}
