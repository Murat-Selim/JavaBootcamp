package Homework1.switchDemo;

public class Main {
    public static void main(String[] args) {
    	
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Gectiniz");
                break;
            case 'B':
                System.out.println("Iyi");
                break;
            case 'C':
                System.out.println("Normal");
                break;
            case 'F':
                System.out.println("Kaldiniz");
                break;
            default:
                System.out.println("Dogru not girin");
        }
    }
}
