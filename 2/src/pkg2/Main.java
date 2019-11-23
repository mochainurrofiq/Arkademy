package pkg2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

        public static void main(String[] args) {
            String username, password;
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Username : ");
            username = scanner.nextLine();
                     
            if (username.matches("[a-z]")) {
                System.out.println("Username cocok");
                
            } else {
                System.out.println("Username harus huruf kecil");
            } 
            
            
             if (username.matches("/^[aiueo]{3}[a-z0-9]{2,7}$/i")) {
                System.out.println("Password cocok");
            } else {
                System.out.println("Password tidak sesuai");
            } 
            //maaf saya menyerah untuk yang ini
            
        }
           
}
