import java.util.Scanner;

public class testing {
    public static void main(String[] args){
        boolean done = false;
        Scanner cin = new Scanner(System.in);
        String input;
        int test1;

        while (!done){
            System.out.print("enter an integer: ");
            input = cin.nextLine();
            test1 = Integer.parseInt(input);
            //test(test);
            System.out.print("tha answer is: "+ test(test1));

            System.out.print("\nagain? Y/N");
            input = cin.nextLine();
            if (input.equalsIgnoreCase("n")){
                done = true;

            }else{
                continue;
            }//end if statement

        }//end while loop
    }//end main
    private static int test(int test){
        int answer;
        answer = test + 5;
        return answer;
    }//end test method
}//end class
