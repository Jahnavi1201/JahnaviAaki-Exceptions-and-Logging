package Simple_And_Compound_Interest;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main extends Interest{
  public static void main(String args[]) {
	  Interest interest_obj=new Interest();
	  Logger log=LogManager.getLogger(Main.class);
	  Scanner input_obj=new Scanner(System.in);
	  log.info("---WELCOME TO OUR APPLICATION---");
	  log.info("Which of our following services you are needed with?");
	  log.info("1.Calculate SIMPLE INTEREST\n2.Calculate COMPOUND INTEREST");
	  int choice=input_obj.nextInt();
	  log.info("Enter the principal amount...");
	  float principal_Amount=input_obj.nextFloat();
	  log.info("Enter the duration in years...");
	  int time_In_Years=input_obj.nextInt();
	  log.info("Enter the rate of interest...");
	  float rate_Of_Interest=input_obj.nextFloat();
	  if(choice==1) {
		    log.info("Calculating Simple Interest...");
			log.info("Simple interest---> "+interest_obj.calculate_simple_interest(principal_Amount,time_In_Years,rate_Of_Interest));
	  }
	  else if(choice==2)
		{
			log.info("Enter the number of times to be calculated");
			int num_Of_Times=input_obj.nextInt();
			log.info("Calculating Compound Interest...");
			log.info("Compound interest--->"+interest_obj.calculate_compound_interest(principal_Amount,num_Of_Times,time_In_Years,rate_Of_Interest));
		}
		else
			log.warn("Invalid option...TRY AGAIN!!");
	  input_obj.close();
}
}



	
	