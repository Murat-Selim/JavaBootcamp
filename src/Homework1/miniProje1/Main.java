package Homework1.miniProje1;

public class Main {
    public static void main(String[] args) {
    	
        int number = 10;
//      int remainder = number % 2;
        boolean isPrime = true;
        
        if (number < 2) {
            System.out.println("Asal sayi degildir");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        
        if (isPrime) {
            System.out.println("Asal sayidir");
        } else {
            System.out.println("Asal sayi degildir");
        }

    }
}
