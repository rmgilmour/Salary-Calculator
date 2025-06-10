/**
 * Returns a list of sales made and the total salary earned.
 * <p>
 * This program will return the total sales amount, and
 * the total salary earned based upon the amount of the sale.
 * The calculation is:  - The base salary is $5,000.00
 * 						- If the total sales = $0.00 then 
 * 						the salary is the base salary amount.
 * 						- If the total sales <= $5,000 and >
 * 						$0.00, then the commission is 8%
 * 						of the total sales.
 * 						- If the total sales <= $10,000 and >
 * 						$5,000, then the commission is 8% for 
 * 						the first $5,000 plus 10% for the 
 * 						remaining total sales amount over the 
 * 						first $5,000.
 * 						- If the total sales < $10,000, then the 
 * 						commission is paid at 8% for the first 
 * 						$5,000 plus 10% for the next $5,000, 
 * 						plus 12% for the remaining total sales 
 * 						amount over $10,000.
 * 						- The total salary is the total commission 
 * 						plus base salary.
 * 
 * @author  Roslyn Gilmour
 * @Version 1.0
 * @Since June 9 2025
 */
package Examples;

/**
 * 
 */
public class salaryCalculator {
	
	/**
	 * @param amount The total sales amount.
	 * @param salary The total amount of the salary, base + commission.
	 * @param base The base salary paid.
	 * @return The total salary to be paid.
	 */
	public double salaryCalc(double amount) {
		double salary = 0.00;
		double base = 5000.00;
		if (amount == 0.00) {
			salary = 5000.00;
		} else if (amount <= 5000.00) {
			salary = amount * 0.08 + base;
		} else if (amount <= 10000.00) {
			salary = (5000 * 0.08) + ((amount - 5000) * 0.1) + base;
		} else {
			salary = (5000 * 0.08) + (5000 * 0.1) + 
					((amount - 10000) * 0.12) + base;
		}
		return salary;
	}

	/**
	 * @param args Command line arguments, where the salary 
	 * 				list is printed.
	 */
	public static void main(String[] args) {
		
		salaryCalculator calc = new salaryCalculator();
		System.out.printf("Sales\t\t\t" + "Salary\n");

		double i;
		
		for(i = 1000; i <= 20000; ) {
			double calcOut = calc.salaryCalc(i);
			System.out.printf("$%.2f", i);
			System.out.printf("\t\t$%.2f\n", calcOut, "\n");
			i = i + 1000;
		}	

	}

}
