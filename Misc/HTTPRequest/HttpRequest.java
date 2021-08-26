import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.net.*;


public class HTTPRequest {
    //http://192.168.1.23/?LED=ON_BLUE
    //http://192.168.1.23/?LED=OFF_BLUE

    public static void main(String[] args) {
        URLConnectionExample();
        LEDON();

        for(int i = 0; i < 5; i++) {
            LEDON();
            try {
                System.out.print("Timer: ");
                System.out.print(5);
                Thread.sleep(1000);
                System.out.print(4);
                Thread.sleep(1000);
                System.out.print(3);
                LEDOFF();
                Thread.sleep(1000);
                System.out.print(2);
                Thread.sleep(1000);
                System.out.print(1);
                Thread.sleep(1000);
                int attempt = i + 1;
                System.out.print("\tAttempt: " + attempt);

            }catch(Exception e){System.out.println(e);}

            LEDOFF();
        }


    }//end main

    public static void LEDON(){
        try{
            //URL url=new URL("http://www.javatpoint.com/java-tutorial");
            URL ledON=new URL("http://192.168.1.23/?LED=ON_BLUE");
            HttpURLConnection huc=(HttpURLConnection)ledON.openConnection();
            for(int i=1;i<=8;i++){
                System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
            }
            huc.disconnect();
        }catch(Exception e){System.out.println(e);}
    }

    public static void LEDOFF(){
        try{
            //URL url=new URL("http://www.javatpoint.com/java-tutorial");
            URL ledOFF=new URL("http://192.168.1.23/?LED=OFF_BLUE");
            HttpURLConnection huc1=(HttpURLConnection)ledOFF.openConnection();
            for(int i=1;i<=8;i++){
                System.out.println(huc1.getHeaderFieldKey(i)+" = "+huc1.getHeaderField(i));
            }
            huc1.disconnect();
        }catch(Exception e){System.out.println(e);}
    }
    public static void URLConnectionExample(){
        //import java.io.*;
        //import java.net.*;
                try{
                    //URL url=new URL("http://www.javatpoint.com/java-tutorial");
                    URL url=new URL("http://192.168.1.23/?LED=OFF_BLUE");
                    HttpURLConnection huc2=(HttpURLConnection)url.openConnection();
                    for(int i=1;i<=8;i++){
                        System.out.println(huc2.getHeaderFieldKey(i)+" = "+huc2.getHeaderField(i));
                    }
                    huc2.disconnect();
                }catch(Exception e){System.out.println(e);}


    }
}
