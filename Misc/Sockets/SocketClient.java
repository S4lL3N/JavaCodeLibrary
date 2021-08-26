/*
creates a client for the (SocketServer.java) on port 3333
the server accepts a command to add to numbers the format
is ex: command value1 value2
 */
import java.net.*;
import java.io.*;

public class SocketClient {
        public static void main(String args[])throws Exception{
            int counter = 0;
            Socket s=new Socket("localhost",3333);
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Client Up: \nconnected on port:3333\nAwaiting command....");
            String str="",str2="";
            while(!str.equals("stop")){
                counter++;
                str=br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2=din.readUTF();
                System.out.println("Server sent:\t"+str2);
                System.out.println("Counter: " +counter);

            }

            dout.close();
            s.close();
        }
}
