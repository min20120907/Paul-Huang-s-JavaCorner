import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;

public class EchoClient{
    public static void main(String[] args) {
        try{
            if (args.length<3){
                System.err.println("<msg> <addr> <port>");
                System.exit(1);
            }
            //args msg, host, port
            String msg = args[0];
            InetAddress addr = InetAddress.getByName(args[1]);
            int port = Integer.parseInt(args[2]);
            byte[] msgbytes = msg.getBytes();
            DatagramPacket pkt = new DatagramPacket(msgbytes, msgbytes.length);
            DatagramSocket sck = new DatagramSocket();
            sck.send(pkt);
            byte[] buf = new byte[256];
            DatagramPacket rpkt = new DatagramPacket(buf, buf.length)
            sck.setSoTimeout(3000);
            sck.receive(rpkt);
            System.out.println(msg);
        } catch (SocketTimeoutException ex){
            System.err.println("ReadTimeout");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
