package com.test.examination.normal22.socket;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/**
 * UDP UserDatagramProgram 无连接的用户数据报协议
 * 
 * 什么是Datagram？
 *     数据报是网上传输的独立数据包 ，数据报是否能正确地到达目的地，到达的时间，顺序，内容的正确性均没有保障。
 *java中使用Datagram与DatagramPacket类
 *DatagramSocket类利用UDP协议来实现客户与服务器的Socket.
 *send():发送数据报
 *receive(): 接收数据报
 *
 */
public class UDPClient
{
	public static void main(String[] args) throws Exception
	{
		DatagramSocket datagramSocket = new DatagramSocket();
		
		String content = "hello world!";
		
		byte[] buffer = content.getBytes();
		
		InetAddress address = InetAddress.getByName("localhost");
		
		DatagramPacket packet = new DatagramPacket(buffer,buffer.length,address,5678);
		
		datagramSocket.send(packet);
		
		byte[] b = new byte[100];
		
		DatagramPacket packet2 = new DatagramPacket(b,100);
		
		datagramSocket.receive(packet2);
		
		byte[] b2 = packet2.getData();
		
		int l = packet2.getLength();
		
		String str = new String(b2,0,l);
		
		System.out.println("length of string : " + str);
		
		datagramSocket.close();
	}
}
