/*
* Programmer: <|VelocityOfStuff|>
* Version: <|1.1.6|>
* Start Date: <|3/?/2023|>
* Last Update: <|10/16/2023|>
* Second Scene added in March 2023 - functional in Oct 2023
*/

import java.util.Scanner; // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner interact = new Scanner(System.in); // Create a Scanner object

    System.out.println("Enter username");

    // Read user input
    String userName = interact.nextLine(); 
    // Output user input
    System.out.println("Username is: " + userName);

    // title scene 
    System.out.println("Welcome to The Interdimentional Tavern");
    System.out.println("Press Enter to Start");

    String startTest = interact.nextLine();

    // first scene starts
    if (startTest.equalsIgnoreCase("")) {
      System.out.println("  The void thickens into a fine mist around you. The darkeness fades into a warm light, the mist disapating into a tavern. A well-kept individual in a suit stands behind the bar polishing a glass while commanding a squad of unseen servants that tend to the guests.");
      System.out.println("  You are standing in front of the bar when the smiling bartender asks you 'What would you like to drink?'");
    }
      
    System.out.println("");
      
    System.out.println("Options:");
    System.out.println("Mead");
    System.out.println("Ale");
    System.out.println("Fruit Punch");
    System.out.println("Water");
    System.out.println("");
      
    String drink = interact.nextLine();
    System.out.print("You:  ");
    System.out.println("");

    if (drink.equalsIgnoreCase("Mead")) {
      System.out.println("  'Okay' The bartender slides a nearly foamless flaggon of mead over to you.");
    }

    else if (drink.equalsIgnoreCase("Ale")) {
      System.out.println("  'Okay' The bartender hands you a luke warm bottle of ale.");
    }

    else if (drink.equalsIgnoreCase("Fruit punch")) {
      System.out.println("  'Okay' The bartender passes you a cup of dark magenta concentrate settled at the bottom of foggy water.");
    }


    else if (drink.equalsIgnoreCase("Water")) {
      System.out.println("  'Okay' The bartender sets a foggy glass of water on the table.");
      }

    
    //sub tree
    else {
      System.out.println("  'I didn't quite get that. Never mind. You seem thirsty, how about some water'");

      System.out.println("Yes or No");
      String YN = interact.nextLine();
      
      //Yes
      if (YN.equalsIgnoreCase("Yes")) {
        System.out.println("  'Okay' The bartender sets a foggy glass of water on the table.");
      }
      
      //No
      else {
        System.out.println("  'suit yourself'");
        }
      }

    //Second scene starts
    System.out.println("");
    System.out.println("  You look around the bar again, now recovering from your sudden transportation, you notice the floor and tables have a considerable amount of dust on them. The boards warped and lifted in some places. The other patrons have seemingly disapeared alongside the waiters bringing them food and drink.");
    System.out.println("");
    
    String a = "What happened to the tavern?";
    String b = "This place is disgisting.";
    String c = "This bar really needs to be cleaned.";
    String d = "Were there not just staff and customers?";
    String exit = "Thank you for the drink. I'll see you later";
    
    System.out.println("Options:");
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);
    System.out.println("d: " + d);
    System.out.println("exit: " + exit);
    System.out.println("");
    
    String barQ1Ans = interact.nextLine();
    
    barQ1 : while (true) {  
      
      //choice a
      if (barQ1Ans.equalsIgnoreCase("a")) {
        System.out.println("You:  " + a);
        System.out.println("Bartender: This instance leads to a place that has long been abandoned.");
        System.out.println("");
        break barQ1;
      }

      //choice b
      else if (barQ1Ans.equalsIgnoreCase("b")) {
        System.out.println("You:  " + b);
        System.out.println("Bartender: Well, the bar wasn't expected to be used. I wasn't expecting anyone else on this plane of my tavern.");
        System.out.println("");
        break barQ1;
      }

      //choice c
      else if (barQ1Ans.equalsIgnoreCase("c")) {
        System.out.println("You:  " + c);
        System.out.println("Bartender: I tried to clean up, but the dust just kind of replaces itself as fast as I can remove it.");
        System.out.println("");
        break barQ1;
      }

      //choice d
      else if (barQ1Ans.equalsIgnoreCase("d")) {
        System.out.println("You:  " + d);
        System.out.println("Bartender: That was a different instance of the bar.");
        System.out.println("");
        break barQ1;
      }

      //choice exit
      else if (barQ1Ans.equalsIgnoreCase("exit")){
        System.out.println("You:  " + exit);
        System.out.println("Bartender: See you later");
        System.out.println("");
        break;
      }
    }

    //end program
    System.out.println("Goodbye");
  }   
}
