package House_Construction_Cost;

public class House_Construction_Cost {
     public static float calculate_house_construction_cost(float area,int choice) {
    	 int[] cost= {1200,1500,1800,2500};
    	 return area*cost[choice];
     }
}
