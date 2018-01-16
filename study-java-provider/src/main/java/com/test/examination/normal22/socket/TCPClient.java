package com.test.examination.normal22.socket;

import java.io.InputStream;

import java.io.OutputStream;
import java.net.Socket;


/**
 * Socket是连接运行在网络上的两个程序间的双向通讯的端点
 * 使用Socket进行网络通信的过程
 *     1、服务器程序将一个套接字绑定到一个特定的端口，并通过此套接字等待和监听客户的连接请求。 
 *     2、客户程序根据服务器程序所在的主机名和端口号发出连接请求。  
 *     3、如果一切正常，服务器接受连接请求。并获得一个新的绑定到不同端口地址的套接字。--->important
 *     4、客户和服务器通过读、写套接字进行通讯。 
 * @author Administrator
 * 
 * 题目：编写一个网络应用程序，有客户端与服务器端，客户端向服务器端发送一个字符串，服务器收到该字符串后将其打印到命令行上，然后向客户端返回该字符串的长度，最后，客户端输出服务器端返回的该字符串的长度。
 *
 */
public class TCPClient
{

	public static void main(String[] args) throws Exception
	{
		for (int i = 0; i < 5000; ++i)
		{
			Socket socket = new Socket("localhost", 5678);

			InputStream is = socket.getInputStream();

			OutputStream os = socket.getOutputStream();

			String str = "This comes from client";

			os.write(str.getBytes());

			byte[] buffer = new byte[100];

			int length = is.read(buffer);

			String s = new String(buffer, 0, length);

			System.out.println("string's length: " + s);

			is.close();

			os.close();

			socket.close();

		}

	}

}
