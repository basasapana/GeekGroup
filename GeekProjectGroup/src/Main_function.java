import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_function {
	public static Main_function ds = new Main_function();
	public int count1;
	public int choice;

	public static void main(String[] args) throws IOException {

		String fName = "First Name", lName = "Last Name", // column name in variable for formating purpose
				DOB = "DOB", Position = "Position", Salary = "Salary", ssn = "ssn", DID = "DID";
		File file1 = new File("C:\\Users\\BASUDEV\\eclipse-workspace\\GeekProjectGroup\\empFile.txt");
		FileReader fr1;
		File file2 = new File("C:\\Users\\BASUDEV\\eclipse-workspace\\GeekProjectGroup\\department.txt");
		FileReader fr2;
		try {

			fr1 = new FileReader(file1);
			fr2 = new FileReader(file2);
			BufferedReader br1 = new BufferedReader(fr1);
			BufferedReader br2 = new BufferedReader(fr2);
			String data;
			int count = 0;

			System.out.println("Enter 1 to display with salary");
			System.out.println("Enter 2 to display with dept");
			Scanner ca = new Scanner(System.in);
			int choice = ca.nextInt();
			top(fName, lName, DOB, Position, Salary, ssn, DID);

			// System.out.println(dept_id);
			ArrayList<Employee_info> list = new ArrayList<Employee_info>(7);
			// getDeptData(br2,list);
			Employee_info fun2 = new Employee_info("ram", "bista", "12/11/1222", "rrar", "122212", "14", "1");
			while ((data = br1.readLine()) != null) {
				String[] tokens = data.split(",");

				Employee_info fun1 = new Employee_info(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5],
						tokens[6]);

				list.add(fun1);

				// Diplay With Unique Value
				if (choice == 2) {
					displayUnique(fun1, list, count, fun2);

				}

				// Display with Salary
				if (choice == 1) {
					ds.evaluateWithSal(list, count);
				}

				if (choice == 3) {
					// System.out.println(tokens[6].contains(getDeptData(br2)));
				}

				//

				count++;
			}
			br1.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

	private static void displayUnique(Employee_info fun1, ArrayList<Employee_info> list, int count,
			Employee_info fun2) {
		String ssf1 = fun1.getSsn();

		String ssf2 = fun2.getSsn();

		if ((ssf1.contains(ssf2)) == false) {
			list.add(fun2);
			ds.displayEmployeeList(list, count);
		} else if (ssf1.contains(ssf2) == true) {
			ds.displayEmployeeList(list, count);
		}

	}

	private static void getDeptData(BufferedReader br2, ArrayList<Employee_info> list) {
		String data;
		String Dept_id;
		try {
			while ((data = br2.readLine()) != null) {
				String[] tok_d = data.split(",");
				Dept_id = tok_d[0];
				System.out.println(Dept_id);

			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private void evaluateWithSal(ArrayList<Employee_info> list, int count) {
		for (int i = 0; i <= 1; i++) { // used to create loop only
			if (choice < 1) { // used to break the statement
				System.out.println("Please enter 1 to display all and 2 to display Salary more then 10000");
				Scanner ca = new Scanner(System.in);
				choice = ca.nextInt();
				break;
			}
		}

		float sal = Float.parseFloat(list.get(count).getSalary());
		if (choice > 2) {
			System.out.println("Enter valid number");
		} else if (choice == 1) {
			ds.displayEmployeeList(list, count);
		} else if (choice == 2) {
			if (sal > 10000) {
				ds.displayEmployeeList(list, count);
			}
		}
		count1++;

	}

	private void displayEmployeeList(ArrayList<Employee_info> list2, int count1) {
		System.out.printf("|%-13s|", list2.get(count1).getfName());
		System.out.printf("|%-13s|", list2.get(count1).getlName());
		System.out.printf("|%-12s|", list2.get(count1).getDOB());
		System.out.printf("|%-15s|", list2.get(count1).getPosition());
		System.out.printf("|%-11s|", list2.get(count1).getSalary());
		System.out.printf("|%-15s|", list2.get(count1).getSsn());
		System.out.printf("|%-15s|", list2.get(count1).getDID());
		System.out.println("\n");

	}

	private static void top(String fName, String lName, String dob, String position, String salary, String ssn,
			String DID) {
		System.out.print("_____________________________________________________________");
		System.out.print("_____________________________________________________________\n");
		System.out.printf("%-13s | %-13s | %-12s | %-15s | %11s | %11s | %11s |%n", fName, lName, dob, position, salary,
				ssn, DID);
		System.out.print("_____________________________________________________________");
		System.out.print("_____________________________________________________________\n");

	}

}
