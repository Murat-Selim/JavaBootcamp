package Homework1.multiArray;

public class Main {
    public static void main(String[] args) {
    	
        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "Baku";
        sehirler[0][1] = "Istanbul";
        sehirler[0][2] = "Tebriz";
        
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Bursa";
        sehirler[1][2] = "Balikesir";
        

        sehirler[2][0] = "Adana";
        sehirler[2][1] = "Mersin";
        sehirler[2][2] = "Antalya";

        for (int i = 0; i < sehirler.length; i++) {
            System.out.println("---------------");
            for (int j = 0; j < sehirler[i].length; j++) {
                System.out.println(sehirler[i][j]);

            }

        }
    }
}
