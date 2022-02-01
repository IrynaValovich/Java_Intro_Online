package by.htp.algorithmization_2.decomposition;

import java.util.Scanner;

public class Task04 {
	
	/*
	 * На плоскости заданы своими координатами n точек. Написать метод (методы), определяющие, 
	 * между какими из пар точек самое большое расстояние. Координаты точек занести в массив.
	 */
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {		
		int n;
		n = getNPointsFromUser("Введите количество точек на плоскости (n) >> ");
		
	    double arrayX[] = new double[n];
	    double arrayY[] = new double[n];
	    
	    System.out.println("Вводите координаты точек парами по очереди. Сначала X первой точки, после Y первой точки. \n" +
			    "Затем X второй точки, Y второй точки и т.д.");	     
	    for (int i = 0; i < n; i++){
	        arrayX[i] = enterCoordFromConsole("Введите координату Х вашей точки, а затем нажмите ввод >> ");
	        arrayY[i] = enterCoordFromConsole("Введите координату Y вашей точки, а затем нажмите ввод >> ");
	    }
	    
	    printCoordinatesOfPoints(arrayX, arrayY);	        
	    findMaxDistanceBetweenPoints(arrayX, arrayY);		
	}
	
	private static int enterFromConsole(String message) {				
		System.out.print(message);		
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}		
		return scan.nextInt();			
	}
	
	private static int getNPointsFromUser(String message) {
		int points;
		do {
			points = enterFromConsole(message);			
		} while (points <= 1);			
		return points;
	}
	
	private static double enterCoordFromConsole(String message) {					
		System.out.print(message);			
		while(!scan.hasNextDouble()) {
			scan.next();
			System.out.print(message);
		}			
		return scan.nextDouble();			
	}	
	
	private static void findMaxDistanceBetweenPoints(double x[], double y[]) {		
		double distance;				
		double distanceMax = 0;	   
	    int indexFirstMaxPoint = 0;
	    int indexSecondMaxPoint = 0;	    
	    for (int i = 0; i < x.length - 1; i++) {
	    	for (int j = i + 1; j < x.length; j++) {	    		
                distance = Math.sqrt(Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2));
                if (distanceMax < distance) {
                    distanceMax = distance;
                    indexFirstMaxPoint = i;
                    indexSecondMaxPoint = j;
                }
            }
        }
        System.out.println("Между точкой " + indexFirstMaxPoint + " и точкой " + indexSecondMaxPoint);	    
	    System.out.println("максимальное расстояние, равное " + distanceMax);	    
	}
	
	private static void printCoordinatesOfPoints(double x[], double y[]) {
		for (int pointIndex = 0; pointIndex < x.length; pointIndex++) {	    	   
	        System.out.print("\nЗначение координат для " + pointIndex + " точки: \n Х = " + x[pointIndex] 
	        		+"\tY = " + y[pointIndex] + "\n");
	    }		
	}
}
