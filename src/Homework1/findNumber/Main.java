package Homework1.findNumber;

public class Main {
    public static void main(String[] args) {
    	
        int[] sayilar = new int[]{1, 2, 5, 7, 8, 9};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Sayi bulundu: " + aranacak);
        }
    }
}
