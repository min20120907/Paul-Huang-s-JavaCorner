import java.net.DatagramSocket;
import java.net.DatagramPacket;
public class EchoServer {
	public static final int service_port;
	public EchoServer(){
		this.service-port = 5454;
	}
	public EchoServer(int port) {
		this.service_port = port;
	}
	public void startRunning(){
		DatagramSocket srvsock = new DatagramSocket(this.service_port);
	}
}
