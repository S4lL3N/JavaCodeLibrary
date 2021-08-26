/*
creates a server listening on port 3333,
if client (SocketClient.java) sends a command, ex: command 1 1,
it will add the the to values and returns the sum to the client.
https://www.javatpoint.com/socket-programming
*/

import java.net.*;
import java.io.*;

public class SocketServer {
        public static void main(String args[])throws Exception{
            int counter = 0;
            ServerSocket ss=new ServerSocket(3333);
            System.out.println("Server Up:\nlistening on Port: 3333\nListening....");
            Socket s=ss.accept();
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";

            while(!str.equals("stop")){
                str=din.readUTF();
                System.out.println("\nclient says: "+str);
                //--------------------------------------------------
                String[] recieved = str.split(" ");
                if (recieved[0].equalsIgnoreCase("stop")){
                    MyTest.LEDOFF();
                    dout.writeUTF("Stopping server");
                    System.out.println("Stopping server....");
                    dout.writeUTF("Stopping server");
                }
                else if (recieved[0].equalsIgnoreCase("command")){
                    System.out.println("Revived command");
                    double varX = Double.parseDouble(recieved[1]);
                    double varY = Double.parseDouble(recieved[2]);
                    //calls the MyTest class and runs the MyAdd method
                    System.out.println("Sending: " + MyTest.MyAdd(varX,varY));
                    str2 = Double.toString(MyTest.MyAdd(varX,varY));
                    dout.writeUTF("the answers is: " + str2);
                    //calling other methods from the MyTest class
                    MyTest.LEDON();
                    //MyTest.getIP();
                }
                else {
                    dout.writeUTF("Error... command not found");
                    MyTest.LEDOFF();
                }//end if/else statement
                //--------------------------------------------------
                counter += 1;
                System.out.println("Counter: " + counter);

                dout.flush();
            }
            din.close();
            s.close();
            ss.close();
        }
}

