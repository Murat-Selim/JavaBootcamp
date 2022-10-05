package Homework2.methods1;

public class Main {
    public static void main(String[] args) {

        findNumber();
        
    }

    public static void findNumber() {
    	int[] sayilar = new int[]{1, 2, 5, 7, 8, 9};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        
        String mesaj = "";
        if (varMi) {
        	mesaj = "Sayi bulundu: " + aranacak;
        	sendMessage(mesaj);
        }
        else {
			sendMessage("Sayi mevcut degildir: " + aranacak);
		}
    }

    public static void sendMessage(String mesaj) {
        System.out.println(mesaj);

    }

}
