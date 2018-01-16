package com.test.examination.normal22.socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPServerThread extends Thread
{
	private Socket socket;

	public TCPServerThread(Socket socket)
	{
		this.socket = socket;
	}

	@Override
	public void run()
	{
		try
		{
			InputStream is = socket.getInputStream();

			OutputStream os = socket.getOutputStream();

			byte[] buffer = new byte[100];

			int length = is.read(buffer);

			String content = new String(buffer, 0, length);

			System.out.println("read from client: " + content);

			int strLength = content.length();

			String str = String.valueOf(strLength);

			byte[] b = str.getBytes();

			os.write(b);

			is.close();

			os.close();

			socket.close();
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
