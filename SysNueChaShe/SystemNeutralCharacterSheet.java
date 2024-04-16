/**
* <h1>CommentTypes</h1>
*  This program uses class creation methods and the scanner
* class to create a character sheet based heavily on
* roleplaying centered characters. 
*  The purpose of this program is to be used and modified for
* use in game programs and to serve an example of 
*
* @author  JillCarton
* @version 1.0
* @since   2022-05-23
*/

import java.util.Scanner;  // Import the Scanner class

class Character {
  //Instance Variables composing the sheet
  private String playerName;
  private String characterName;
  private String background;
  private String specialty;
  private String personality;
  private String ideal;
  private String bond;
  private String flaw;
  private String fullSheet;
  

  //Constructor decleration of class
  public Character(String pn, String cn, String bg, String sp, String pr, String id, String bd, String fl) {

    // allows for variable chracter sheet details in preferred format 
    this.playerName = "Player Name: " + pn + "  ";
    this.characterName = "Character Name: " + cn + "  ";
    this.background = "Background: " + bg + "  ";
    this.specialty = "Specialty: " + sp + "  ";
    this.personality = "Personality Trait: " + pr + "  ";
    this.ideal = "Ideal: " + id + "  ";
    this.bond = "Bond: " + bd + "  ";
    this.flaw = "Flaw: " + fl + "  ";
    
    this.fullSheet = playerName + characterName + background + specialty + personality + ideal + bond + flaw;
  }

  // Return Player Name
  public String getPlayer() { return playerName; }
 
  // Return Character Name
  public String getCharacter() { return characterName; }
 
  // Return Background
  public String getBackground() { return background; }
 
  // Return Specialty
  public String getSpecialty() { return specialty; }

  // Return Personality Trait
  public String getPersonality() { return personality; }

  // Return Ideal
  public String getIdeal() { return ideal; }

  // Return Bond
  public String getBond() { return bond; }

  // Return Flaw
  public String getFlaw() { return flaw; }

  // Return All
  public String getSheet()  { return fullSheet; }
}

class Main {
  public static void main(String[] args) {

    //Print user instructions
    System.out.println("please input character details in the shown order");
    Character blank = new Character("", "", "", "", "", "", "", "");
    System.out.println(blank.getSheet());

    // Opens scanner to recieve user input of character info
    Scanner fillSheet = new Scanner(System.in);

    // Declares variables to record user input of character info 
    Character playerOne = new Character(fillSheet.next(), fillSheet.next(), fillSheet.next(), fillSheet.next(), fillSheet.next(), fillSheet.next(), fillSheet.next(), fillSheet.next());

    fillSheet.close();

    // Prints the details of the character sheet, seperating each item by line
    System.out.println(playerOne.getPlayer());
    System.out.println(playerOne.getCharacter());
    System.out.println(playerOne.getBackground());
    System.out.println(playerOne.getSpecialty());
    System.out.println(playerOne.getPersonality());
    System.out.println(playerOne.getIdeal());
    System.out.println(playerOne.getBond());
    System.out.println(playerOne.getFlaw());

  }
}