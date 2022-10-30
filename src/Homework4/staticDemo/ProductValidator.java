package Homework4.staticDemo;

public class ProductValidator {
	
	static {
        System.out.println("Static yapici blok calisti");
    }
    
	public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
	
    //inner class
	
//  public static class Demo{
//      public static void delete() {
//
//      }
//  }
}
