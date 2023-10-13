package test.streamapi;


import java.util.List;
import java.util.Map;
import test1.Food;
import test1.Type;

 

/* You cannot change any code*/

public class MainClass {

 

	public static void main(String[] args) {


		BusinessOperation bo = new BusinessOperation();

		System.out.println("Avg cost of Veg Food :- "+bo.avgCostByCategory(Type.VEG));

		System.out.println("Avg cost of Non-Veg Food :- "+bo.avgCostByCategory(Type.NON_VEG));

		System.out.println("\n\n--------------------------\n\n");


		for (Food food : bo.increaseCostOfFoodByRegion("Indian")) {

			System.out.println(food);

		}


		System.out.println("\n\n--------------------------\n\n");


		for (Map.Entry<String, Integer> entry :bo.getFoodDetails().entrySet()) {

			System.out.println(entry.getKey()+" - "+entry.getValue());

		}

	}

}
