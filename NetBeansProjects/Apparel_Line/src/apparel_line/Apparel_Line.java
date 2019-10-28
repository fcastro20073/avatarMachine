/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apparel_line;

/**
 *
 * @author franciscocastrowetzstein
 */


//Try and add a back function. Where you would be able to go back to different categories if you changed your mind or anything.


import java.util.Scanner;

public class Apparel_Line {

    static Scanner kb = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Design your avatar!");
        System.out.println("");
        String skinColor1 = skinColor();
        String eyeColor1 = eyeColor();
        String jacketChoice = jacketChoices();
        String pantsChoice1 = pantsChoice();
        
        if(skinColor1.equals("light") && eyeColor1.equals("blue")){
            System.out.println("You might wanna get some sunscreen.");
        }
        
        if (skinColor1.equals("tan") && eyeColor1.equals("brown") || eyeColor1.equals("black")){
            System.out.println("Do any surfing lately?");
        }
        
        if (skinColor1.equals("dark") && eyeColor1.equals("brown")){
            System.out.println("Do you lift weights?");
        }
        
        if (skinColor1.equals("light") && eyeColor1.equals("red")){
            System.out.println("You're an albino!");
        }
        
        if (skinColor1.equals ("dark") && eyeColor1.equals ("blue") || eyeColor1.equals("green")){
            System.out.println("You are one of a kind!");
        }
        if (jacketChoice.equals("jean jacket") && pantsChoice1.equals("jeans")){
            System.out.println("Ready to go chop some lumber you lumberjack or maybe go to a dive bar?");
            
        }
        
        if (jacketChoice.equals("dress jacket") && pantsChoice1.equals("dress pants")){
            System.out.println("You must be Bond, Garfunkel Bond.");
        }
        
        if (jacketChoice.equals("hoodie") && pantsChoice1.equals("sweat pants")){
            System.out.println("Get a job you hoodlum!");
        }
        
        if (jacketChoice.equals("rain coat") && pantsChoice1.equals("rain pants")){
            System.out.println("Splish, Splash, gone to engender cash!");
        }
        
        if (skinColor1.equals("tan") && eyeColor1.equals("blue") || eyeColor1.equals("green") && jacketChoice.equals("jean jacket") && pantsChoice1.equals("jeans")){
            System.out.println("You must really be a chick magnet!");
        }
        
        if (!skinColor1.equals("tan") || !eyeColor1.equals("blue") || !eyeColor1.equals("green") || !jacketChoice.equals("jean jacket") || !pantsChoice1.equals("jeans")){
            System.out.println("You should also get some tips on how to pick up chicks...");
        }
    }

    public static String skinColor() {
        System.out.println("Please choose a skin color for your avatar: Light, Tan, or Dark");
        String colorOfSkin = kb.nextLine().toLowerCase();

        if ((colorOfSkin.equals("tan") || colorOfSkin.equals("light") || colorOfSkin.equals("dark"))) {
            System.out.println("You have chosen the option: " + colorOfSkin.toUpperCase());
            return colorOfSkin;
        } 
        else if ((!colorOfSkin.equals("tan") || !colorOfSkin.equals("light") || !colorOfSkin.equals("dark"))) {
            System.out.println(colorOfSkin.toUpperCase() + " is not a skin color." + " Please provide an appropriate response.");
            String colorOfSkin2 = kb.nextLine().toLowerCase();
            if (colorOfSkin2.equals("tan") || colorOfSkin2.equals("light") || colorOfSkin2.equals("dark")) {
                System.out.println("You have chosen the option:" + colorOfSkin2.toUpperCase());
                return colorOfSkin;   

            }
            else {

                while (!colorOfSkin2.equals("tan") || !colorOfSkin2.equals("light") || !colorOfSkin2.equals("dark")) {
                    System.out.println("Please provide an appropriate response.");
                    String colorOfSkin3 = kb.nextLine().toLowerCase();
                    if (colorOfSkin3.equals("tan") || colorOfSkin3.equals("light") || colorOfSkin3.equals("dark")) {
                        System.out.println("You have chosen the option:" + colorOfSkin3.toUpperCase());
                        return colorOfSkin3;
                    }
                }

            }
        }

        return null;

    }

    public static String eyeColor() {
        System.out.println("");
        System.out.println("Please choose an eye color for your avatar: Brown, Black, Red, Blue, Green, or Yellow.");
        String colorOfEye = kb.nextLine().toLowerCase();

        if (colorOfEye.equals("brown") || colorOfEye.equals("black") || colorOfEye.equals("red") || colorOfEye.equals("blue") || colorOfEye.equals("green") || colorOfEye.equals("yellow")) {
            System.out.println("You have chosen the option: " + colorOfEye);
            return colorOfEye;
        } else if (!colorOfEye.equals("brown") || !colorOfEye.equals("black") || !colorOfEye.equals("red") || !colorOfEye.equals("blue") || !colorOfEye.equals("green") || !colorOfEye.equals("yellow")) {
            System.out.println(colorOfEye.toUpperCase() + " is not an eye color. Please provide an appropriate response.");
            String colorOfEye2 = kb.nextLine().toLowerCase();
            if (colorOfEye2.equals("brown") || colorOfEye2.equals("black") || colorOfEye2.equals("red") || colorOfEye2.equals("blue") || colorOfEye2.equals("green") || colorOfEye2.equals("yellow")) {
                System.out.println("You have chosen the option: " + colorOfEye2);
                return colorOfEye2;
            }

            while (!colorOfEye2.equals("brown") || !colorOfEye2.equals("black") || !colorOfEye2.equals("red") || !colorOfEye2.equals("blue") || !colorOfEye2.equals("green") || !colorOfEye2.equals("yellow")) {
                System.out.println("Please provide an appropriate response.");
                String colorOfEye3 = kb.nextLine().toLowerCase();

                if (colorOfEye3.equals("brown") || colorOfEye3.equals("black") || colorOfEye3.equals("red") || colorOfEye3.equals("blue") || colorOfEye3.equals("green") || colorOfEye3.equals("yellow")) {
                    System.out.println("You have chosen the option: " + colorOfEye3);
                    return colorOfEye3;
                }

            }
        }
        System.out.println("");
        return null;

    }

    public static String jacketChoices() {
        System.out.println("Please choose from the following jacket choices: ");
        System.out.println("................ Jean Jacket");
        System.out.println("..................... Hoodie");
        System.out.println("............... Dress Jacket");
        System.out.println(".................. Rain Coat");

        String jacketChoice = kb.nextLine().toLowerCase();

        if (jacketChoice.equals("jean jacket") || jacketChoice.equals("hoodie") || jacketChoice.equals("dress jacket") || jacketChoice.equals("rain coat")) {
            System.out.println("You have chosen the option: " + jacketChoice.toUpperCase());
            return jacketChoice;
        } else {
            while (!jacketChoice.equals("jean jacket") || !jacketChoice.equals("hoodie") || !jacketChoice.equals("dress jacket") || !jacketChoice.equals("rain coat")) {
                System.out.println("Please provide an appropriate response.");
                String jacketChoice2 = kb.nextLine().toLowerCase();

                if (jacketChoice2.equals("jean jacket") || jacketChoice2.equals("hoodie") || jacketChoice2.equals("dress jacket") || jacketChoice2.equals("rain coat")) {
                    System.out.println("You have chose the option: " + jacketChoice2.toUpperCase());
                    return jacketChoice2;
                } else {
                    System.out.println("Please provide an appropriate repsonse.");
                    String jacketChoice3 = kb.nextLine().toLowerCase();

                    if (jacketChoice3.equals("jean jacket") || jacketChoice3.equals("hoodie") || jacketChoice3.equals("dress jacket") || jacketChoice3.equals("rain coat")) {
                        System.out.println("You have chosen the option: " + jacketChoice3.toUpperCase());
                        return jacketChoice3;
                    }
                }
            }
        }
        return null;
    }

    public static String pantsChoice() {
        System.out.println("Please choose from the following pants choices: ");
        System.out.println("........................Jeans ");
        System.out.println("..................Sweat Pants ");
        System.out.println("................. Dress Pants");
        System.out.println(".................. Rain Pants");

        String pantChoice = kb.nextLine().toLowerCase();

        if (pantChoice.equals("jeans") || pantChoice.equals("sweat pants") || pantChoice.equals("dress pants") || pantChoice.equals("rain pants")) {
            System.out.println("You have chosen the option: " + pantChoice);
            return pantChoice;

        } else {
            while (!pantChoice.equals("jeans") || !pantChoice.equals("sweatpants") || !pantChoice.equals("dress pants") || pantChoice.equals("rain pants")) {
                System.out.println("Please provide an appropriate response.");
                String pantChoice2 = kb.nextLine().toLowerCase();

                if (pantChoice2.equals("jeans") || pantChoice2.equals("sweat pants") || pantChoice2.equals("dress pants") || pantChoice2.equals("rain pants")) {
                    System.out.println("You have chosen the option: " + pantChoice2);
                    return pantChoice2;

                } else {
                    System.out.println("Please provide an appropriate response.");
                    String pantChoice3 = kb.nextLine().toLowerCase();

                    if (pantChoice3.equals("jeans") || pantChoice3.equals("sweat pants") || pantChoice3.equals("dress pants") || pantChoice3.equals("rain pants")) {
                        System.out.println("You have chosen the option: " + pantChoice3);
                        return pantChoice3;
                    }
                }
            }
        }
        return null;

    }
}
