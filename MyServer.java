package Client_Server_Chat;
import java.net.*;
import java.io.*;
public class MyServer {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ServerSocket s=new ServerSocket(6666);
		Socket sock=s.accept();
		DataInputStream dis=new DataInputStream(sock.getInputStream());
		DataOutputStream dout=new DataOutputStream(sock.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";
		while(str!="stop") {
			str=dis.readUTF();
			System.out.println("Client says: "+str);
			str2=br.readLine();
			dout.writeUTF(str2);
			dout.flush();
			}
			dis.close();
			sock.close();
			s.close();
	}
}
