package House_Construction_Cost;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main extends House_Construction_Cost{
	public static void main(String args[]) {
		Scanner input_obj=new Scanner(System.in);
		Logger log=LogManager.getLogger(Main.class);
		log.info("Enter the area of your house (in square feet)");
		float area=input_obj.nextFloat();
		log.info("Enter your choice of type of material for house construction:");
		log.info("1.Standard Material\n2.Above Standard Material\n3.High Standard Material");
		int choice=input_obj.nextInt();
		int special_choice=0;
		if(choice==3) {
			log.info("Do you want a fully automated house(0/1)?");
			special_choice=input_obj.nextInt();
		}
		if(choice>=1 && choice<=3) {
			log.info("Calculating house construction cost...");
			if(choice==3 && special_choice==1) {
					log.info("Your House Construction Cost--->  "+calculate_house_construction_cost(area,3)+" INR");
			}
			else
				log.info("Your House Construction Cost--->  "+calculate_house_construction_cost(area,choice-1)+" INR");
		}
		else
			log.warn("Invalid choice...TRY AGAIN!!!");
		input_obj.close();
	}
}
