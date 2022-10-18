package Homework2.classesWithAttribute;

public class Main {
    public static void main(String[] args) {
    	
        Product product = new Product(1, "product", "random", 5000, 5);
        
        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}
