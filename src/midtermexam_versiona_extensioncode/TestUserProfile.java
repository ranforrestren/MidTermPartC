/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author sorai
 */
public class TestUserProfile {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.println("Please enter your name: ");
            String name = input.nextLine();
            
            UserProfile.genre genre = null;
            boolean inputValid = false;
            while (inputValid != true) {
                try {
                    System.out.println("Please enter a genre from the following list: ");
                    for (int i = 0; i < UserProfile.genre.values().length; i++) {
                        System.out.printf("%d: %s,\n", i+1, UserProfile.genre.values()[i]);
                    }
                    genre = UserProfile.genre.values()[input.nextInt() - 1];
                    inputValid = true;
                } catch (InputMismatchException e) {
                    input.next();
                    System.out.printf("Error: %s\n", e);
                } catch (Exception e) {
                    System.out.printf("Error: %s\n", e);
                } 
            }
            
            UserProfile studentProfile = new UserProfile(name, genre);
            
            System.out.println("Your profile was created!");
            System.out.printf("Your profiles name is: %s\n", studentProfile.getUserID());
            System.out.printf("Your profiles favourite genre is: %s\n", studentProfile.getGenre());
        }
}
