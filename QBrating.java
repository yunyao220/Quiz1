import java.util.Scanner;
public class QBrating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//create a Scanner
		
		//Collect touchdowns (TD)
		System.out.println("Please enter the number of touchdowns: ");
		double TD = input.nextDouble();
		
		//Collect total yards (Yards)
		System.out.println("Please enter the total yards: ");
		double Yards = input.nextDouble();
		
		//Collect interceptions (INT)
		System.out.println("Please enter the number of interceptions: ");
		double INT = input.nextDouble();
		
		//Collect completions (COMP)
		System.out.println("Please enter the number of completions: ");
		double COMP = input.nextDouble();
		
		//Collect passes attempted (ATT)
		System.out.println("Please enter the number of passes attempted: ");
		double ATT = input.nextDouble();
		
		//Close the input
		input.close();
		
		//Calculate QB rating
		double QBrating = 0;
		QBrating = ((COMP/ATT-0.3)*5+(Yards/ATT-3)*0.25+
				(TD/ATT)*20+(2.375-INT/ATT*25))/6*100;
		
		//Display results
		System.out.printf("The QB rating is: " + "%2.3f",QBrating);
		
	}

}
