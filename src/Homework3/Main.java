package Homework3;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Person();
		BaseCreditManager teacherCreditManager = new TeacherCreditManager();
		CustomerManager customerManager = new CustomerManager(teacherCreditManager);
		customerManager.save(customer1);
		customerManager.giveCredit();

	}

}
