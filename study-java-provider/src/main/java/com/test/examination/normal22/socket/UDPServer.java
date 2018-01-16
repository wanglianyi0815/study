package com.test.examination.normal22.socket;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer
{

	public static void main(String[] args)throws Exception
	{
		DatagramSocket datagramSocket = new DatagramSocket(5678);
		
		byte[] buffer = new byte[100];
		
		DatagramPacket packet = new DatagramPacket(buffer,100);
		
		datagramSocket.receive(packet);
		
		byte[] data = packet.getData();
		
		int i = packet.getLength();
		
		String content = new String(data,0,i);
		
		System.out.println("content from client : " + content);
		
		int length = content.length();
		
		String strLength = String.valueOf(length);
		
		byte[] b = strLength.getBytes();
		
		InetAddress address = packet.getAddress();
		
		int port = packet.getPort();
		
		DatagramPacket packet2 = new DatagramPacket(b,b.length,address,port);
		
		System.out.println("length: " + new String(b,0,b.length));
		
		datagramSocket.send(packet2);
		
		datagramSocket.close();
		
		
	}

}
