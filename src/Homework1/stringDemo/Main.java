package Homework1.stringDemo;

public class Main {
    public static void main(String[] args) {
    	
    	String mesaj="Merhaba Dunya!";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayýsý: " + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(5));
		System.out.println(mesaj.concat(" Yasasin! "));
		System.out.println(mesaj.startsWith("M"));
		System.out.println(mesaj.endsWith("!"));
		System.out.println(mesaj.indexOf("y"));
		System.out.println(mesaj.lastIndexOf("e"));
		System.out.println(mesaj.replace(' ','-'));
		System.out.println(mesaj.substring(2,5));
		
		
		for(String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim()); //dizinin her iki ucundaki boslugu kaldirir.
    }
}
