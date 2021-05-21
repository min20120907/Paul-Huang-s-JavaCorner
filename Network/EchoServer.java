import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.DatagramPacket;
public class EchoServer {
	public final int service_port;
	public EchoServer(){
		this.service_port = 5454;
	}
	public EchoServer(int port) {
		this.service_port = port;
	}
	public void startRunning() throws SocketException{
		DatagramSocket srvsock = new DatagramSocket(service_port);
		byte[] buf = new byte[256];
		while(true){
			DatagramPacket rpkt = new DatagramPacket(buf, 256);
			srvsock.receive(rpkt);
			SocketAddress rmt_addr = rpkt.getSocketAddress();
			String rmsg = new String(rpkt.getData(), 0, rpkt.getLength());
			String smeg = "GOT: "+rmsg;
			DatagramPacket spkt = new DatagramPacket();

		}
	}
}
