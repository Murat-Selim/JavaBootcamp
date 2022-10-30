package Homework4.polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
//		BaseLogger[] loggers = new BaseLogger[] { new FileLogger() };
//		 for (BaseLogger logger: loggers){
//           logger.log("log mesaj");
//        }
		 	 
		CustomerManager customerManager = new CustomerManager( new DatabaseLogger() );
		customerManager.add();

	}

}
