package cpe.eng.kps.ku.ac.th.employee;

import java.util.ArrayList;

public class TestEmployee {
	public static void main(String[] args) {

		Employees fixedSalary = new FixedSalary("Clark", "Kent",
		 "555-999-5555", 15000.00);
		Employees hourlySalary = new HourlySalary("Bruce", "Wayne",
		 "555-777-1111", 20.00, 165);
		Employees commissionPay = new CommissionPay("Peter", "Parker",
		 "555-111-5555", 95000, 0.06);


		ArrayList<Employees> employees = new ArrayList<Employees>();
		employees.add(fixedSalary);
		employees.add(hourlySalary);
		employees.add(commissionPay);

		for (Employees emp : employees) {
		 System.out.println(emp);
		 System.out.printf("earned $%.2f\n\n", emp.earnings());
		}
		}
}
