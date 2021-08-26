import java.util.Scanner;

/**
 * Name: Shae Allen
 * Date: 09/22/2019
 * Project: Ascii Fun
 * Getting Started - This program will demonstrate the input/process/output paradigm.
 *                   The user will be prompted to enter a single character. the program
 *                   uses a try/catch construct to check from proper input. The program
 *                   will output the users single character as a ascii decimal and determines
 *                   if it is an uppercase or lowercase vowel or not a vowel. The program also
 *                   checks if the user entered an integer or a space or a special character.
 *                   The program keeps track of how long it to took to run in nanoseconds and
 *                   outputs the run time to the user.
 *
 *
 *                   test data:
 *                              value entered: 1
 *                              output:
 *                                     ascii value = 49
 *                                     not a vowel
 *                                     this is a integer
 *                                     this it not a space
 *                                     this is not a special character
 *                                     run time
 *
 *                              value entered: d
 *                              output:
 *                                     ascii value = 100
 *                                     not a vowel
 *                                     this is not an integer
 *                                     this it not a space
 *                                     this is not a special character
 *                                     run time
 */
// start class
public class AsciiFun {
   /**
    * Description: This is the entry point for all Java console applications.
    * @param args - args is not used in this application.
    */
   // start main method
   public static void main (String[] args){
   
      //local variables
      long startTime;
      long endTime;
      char charValue;
   
      //input strings
      String input = "";
   
      //input objects
      Scanner cin = new Scanner(System.in);//to get input
   
      //start program timer
      startTime = System.nanoTime();// the start time in nano seconds
   
      //calling the create header method
      System.out.print(createHeader());
   
   
      //--------------------------------------------------------------------------------------------------------------
      //--------------- Input Section ---------------
      //prompt user
      System.out.printf("%27s","Enter a character: "); //***LEFT SIDE***
   
      //---------------Process Section --------------
      try {
         //convert input string to a character
         //charValue =input.charAt(0);
         //get input
         input = cin.nextLine();
         if (input.length() == 0 || input.length() > 1){
            System.out.printf("%44s","Error: Enter a single character only");//***LEFT SIDE***
            System.exit(1);
         }//end if statement
      } catch (Exception e){
         System.out.printf("%39s","\nError: invalid entry... Goodbye");//***LEFT SIDE***
         System.exit(1);
      }//end try/catch
   
   /**
      } catch (StringIndexOutOfBoundsException e){
          System.out.print("Error: invalid entry... Goodbye");
          System.exit(1);
      }//end try/catch
   */
      //convert input string to a character
      charValue =input.charAt(0);
   
      //--------------- Output Section --------------
      System.out.printf("%57s","You Entered this character: " + charValue + "\n"); //***RIGHT SIDE***
   
   
      //--------------------------------------------------------------------------------------------------------------
      //--------------- Process and Output Section --------------
      System.out.printf("%24s", "ASCII Value: " + (int)input.charAt(0) + "\n");//***LEFT SIDE***
   
      //conditionals to check for upper and lower case vowels or not a vowel
   
      //checking for ascii ranges that is not a letter to determine that input is not a vowel
      if ((int)input.charAt(0) >= 32 && (int)input.charAt(0) <= 64){
         System.out.printf("%57s","Not a vowel\n");//***RIGHT SIDE***
      }//end if statement
      else if ((int)input.charAt(0) >= 91 && (int)input.charAt(0) <= 96){
         System.out.printf("%57s","Not a vowel\n");//***RIGHT SIDE***
      }//end else ir statement
      else if ((int)input.charAt(0) >= 123 && (int)input.charAt(0) <= 127){
         System.out.printf("%57s","Not a vowel\n");//***RIGHT SIDE***
      }//end else ir statement
   
      //checking for upper case vowels
      if ((int)input.charAt(0) >= 65 && (int)input.charAt(0) <= 90){
         switch (charValue){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
               System.out.printf("%57s","Found an upper case vowel\n");//***RIGHT SIDE***
               break;
            default:
               System.out.printf("%57s","not a vowel\n");//***RIGHT SIDE***
               break;
         }//end switch
      }//end if statement
      
      // checking for lower case vowels
      else if ((int)input.charAt(0) >= 97 && (int)input.charAt(0) <= 122){
         switch (charValue){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
               System.out.printf("%57s","Found an lower case vowel\n");//***RIGHT SIDE***
               break;
            default:
               System.out.printf("%57s","Not a vowel\n");//***RIGHT SIDE***
               break;
         }//end switch
      }//end else if statement
   
   
      //conditionals to check for integers
      if ((int)input.charAt(0) >= 48 && (int)input.charAt(0) <= 57){
         System.out.printf("%26s","This is a integer\n");//**LEFT SIDE***
      
      }//end if statement
      else{
         System.out.printf("%37s","This is not an integer value\n");//***LEFT SIDE***
      }//end else statement
   
   
      //conditionals to check for space
      if ((int)input.charAt(0) == 32){
         System.out.printf("%57s","This is a space\n");//***RIGHT SIDE***
      }// end if statement
      else if ((int)input.charAt(0) != 32){
         System.out.printf("%57s","This is not a space\n");//***RIGHT SIDE***
      }//end else if statement
   
   
      //conditionals to check for special characters
      if ((int)input.charAt(0) > 32 && (int)input.charAt(0) < 48 ){
         System.out.printf("%37s","This is a special character\n\n");//***LEFT SIDE***
      }// end if statement
      else if ((int)input.charAt(0) > 57 && (int)input.charAt(0) < 65 ){
         System.out.printf("%37s","This is a special character\n\n");//***LEFT SIDE***
      }// end else if statement
      else if ((int)input.charAt(0) > 90 && (int)input.charAt(0) < 97 ){
         System.out.printf("%37s","This is a special character\n\n");//***LEFT SIDE***
      }// end if statement
      else if ((int)input.charAt(0) > 122 && (int)input.charAt(0) < 128 ){
         System.out.printf("%37s","This is a special character\n\n");//***LEFT SIDE***
      }// end if statement
      else {
         System.out.printf("%42s","This is not an special character\n\n");//***LEFT SIDE***
      }//end else statement
   
      //--------------------------------------------------------------------------------------------------------------
   
      // when the program ended in nano seconds
      endTime = System.nanoTime();
      // how long it took the program to run
      System.out.printf("%29s%.2f%-1s", "Run time: ", (endTime - startTime) / 1000000000.0," seconds\n");//***CENTER***
   
   }//end main method


   //--------------- Output Section --------------
   // header method
   public static String createHeader(){
      String output = "";
      output += "\n";
      output += "\nAAA                                                    iiii    iiii  FFFFFFFFFFFFFFFFFFFFFF\n";
      output += "A:::A                                                  i::::i  i::::i F::::::::::::::::::::F\n";
      output += "A:::::A                                                  iiii    iiii  F::::::::::::::::::::F\n";
      output += "A:::::::A                                                               FF::::::FFFFFFFFF::::F\n";
      output += "A:::::::::A             ssssssssss       cccccccccccccccciiiiiii iiiiiii   F:::::F       FFFFFFuuuuuu    uuuuuunnnn  nnnnnnnn\n";
      output += "A:::::A:::::A          ss::::::::::s    cc:::::::::::::::ci:::::i i:::::i   F:::::F             u::::u    u::::un:::nn::::::::nn\n";
      output += "A:::::A A:::::A       ss:::::::::::::s  c:::::::::::::::::c i::::i  i::::i   F::::::FFFFFFFFFF   u::::u    u::::un::::::::::::::nn\n";
      output += "A:::::A   A:::::A      s::::::ssss:::::sc:::::::cccccc:::::c i::::i  i::::i   F:::::::::::::::F   u::::u    u::::unn:::::::::::::::n\n";
      output += "A:::::A     A:::::A      s:::::s  ssssss c::::::c     ccccccc i::::i  i::::i   F:::::::::::::::F   u::::u    u::::u  n:::::nnnn:::::n\n";
      output += "A:::::AAAAAAAAA:::::A       s::::::s      c:::::c              i::::i  i::::i   F::::::FFFFFFFFFF   u::::u    u::::u  n::::n    n::::n\n";
      output += "A:::::::::::::::::::::A         s::::::s   c:::::c              i::::i  i::::i   F:::::F             u::::u    u::::u  n::::n    n::::n\n";
      output += "A:::::AAAAAAAAAAAAA:::::A  ssssss   s:::::s c::::::c     ccccccc i::::i  i::::i   F:::::F             u:::::uuuu:::::u  n::::n    n::::n\n";
      output += "A:::::A             A:::::A s:::::ssss::::::sc:::::::cccccc:::::ci::::::ii::::::iFF:::::::FF           u:::::::::::::::uun::::n    n::::n\n";
      output += "A:::::A               A:::::As::::::::::::::s  c:::::::::::::::::ci::::::ii::::::iF::::::::FF            u:::::::::::::::un::::n    n::::n\n";
      output += "A:::::A                 A:::::As:::::::::::ss    cc:::::::::::::::ci::::::ii::::::iF::::::::FF             uu::::::::uu:::un::::n    n::::n\n";
      output += "AAAAAAA                   AAAAAAAsssssssssss        cccccccccccccccciiiiiiiiiiiiiiiiFFFFFFFFFFF               uuuuuuuu  uuuunnnnnn    nnnnnn\n";
      output += "\n";
      output += "                                                          By: Shae Allen\n";
      output += "                                                            Project # 3\n";
      output += "                                                             CITC 1010\n\n";
   
   
      //returns output
      return output;
   
   }//end create header method
}//end class
