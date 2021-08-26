import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.net.*;

/*
for the SocketServer and socketClient classes
 */
public class MyTest {
    int x = 0;
    int y = 0;
    public static Double MyAdd(Double x, Double y){
        return x + y;
    }
    //http request
    public static void LEDON(){
        try{
            URL ledON=new URL("http://192.168.1.23/?LED=ON_BLUE");
            HttpURLConnection huc=(HttpURLConnection)ledON.openConnection();
            for(int i=1;i<=8;i++){
                System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
            }
            huc.disconnect();
        }catch(Exception e){System.out.println(e);}
    }
    //http request
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
    //InetAddress
    public static void getIP(){
        try{
            InetAddress ip=InetAddress.getByName("www.javatpoint.com");
            System.out.println("\nHost Name: "+ip.getHostName());
            System.out.println("IP Address: "+ip.getHostAddress());
        }catch(Exception e){System.out.println(e);}
    }
}

