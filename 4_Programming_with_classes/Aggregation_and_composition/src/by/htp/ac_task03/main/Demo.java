package by.htp.ac_task03.main;

import by.htp.ac_task03.entity.City;
import by.htp.ac_task03.entity.District;
import by.htp.ac_task03.entity.Region;
import by.htp.ac_task03.entity.State;
import by.htp.ac_task03.logic.StateLogic;
import by.htp.ac_task03.view.StateView;

public class Demo {
	
	/*
	 * Создать объект класса Государство, используя классы Область, Район, Город. 
	 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
	 */

	public static void main(String[] args) {
		State state = State.create("Беларусь", City.create("Минск", true, false));		
		StateLogic logic = new StateLogic();	
		
		District district1 = District.create("Минский", City.create("Заславль", false, false));		
		District district7 = District.create("Березинский", City.create("Березино", false, false));		
		District district2 = District.create("Брестский", City.create("Брест", false, true));		
		District district3 = District.create("Гродненский", City.create("Гродно", false, true));		
		District district4 = District.create("Гомельский", City.create("Гомель", false, true));		
		District district5 = District.create("Могилевский", City.create("Могилев", false, true));		
		District district6 = District.create("Витебский", City.create("Витебск", false, true));	
		
		Region region1 = Region.create("Минская", 39854);
		region1.addDistricts(district1, district7);		
		
		Region region2 = Region.create("Брестская", 32787);
		region2.addDistricts(district2);		
		
		Region region3 = Region.create("Гродненская", 25127);
		region3.addDistricts(district3);
		
		Region region4 = Region.create("Гомельская", 40372);
		region4.addDistricts(district4);		
		
		Region region5 = Region.create("Могилевская", 29068);
		region5.addDistricts(district5);		
		
		Region region6 = Region.create("Витебская", 40051);
		region6.addDistricts(district6);		
		
		state.addRegions(region1, region2, region3, region4, region5, region6);		
		
		System.out.println("Вывожу на консоль столицу");
		StateView.printCapital(state);		
		
		System.out.println("Вывожу на консоль количество областей");		
		StateView.printCounterOfRegions(logic.counterOfRegions(state));
		
		System.out.println("Вывожу на консоль площадь");
		StateView.printArea(state);
		
		System.out.println("Районы: ");
		StateView.printDistricts(state);
		
		System.out.println("Вывожу на консоль областные центры");
		StateView.printRegionCenter(state);	
	}
}
