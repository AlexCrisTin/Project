package com.mycompany.app.EX_Tuan_2.Code_2.Access_Control;

class Connection{
	private Connection(int n){
			System.out.println("Creating connection " + n);
		}
	public static Connection makeConnection(int i){ 
		return new Connection(i);
	}
	public void connect(int a){
		System.out.println("Connecting to socket " + a);
	}
}
@SuppressWarnings("unused")
class ConnectionManager{
	private static int conncount=0;
	private static Connection[] connmgr = new Connection[5];
	private static void connInit(){
			for (int i=0; i<5; i++) 
			connmgr[i] = Connection.makeConnection(i);
	}
	private ConnectionManager(){ 
		connInit();
	}
	private static ConnectionManager cm = new ConnectionManager();
	
	public static Connection access(){
		if (conncount<5){
			System.out.println("Accessing connection " + conncount);
			return connmgr[conncount++];
			}
		else return null;
	}
}
public class Ex8 {
    public static void main(String[] args){
		for (int n=0; n<7; n++)
			ConnectionManager.access().connect(n);
	}
}
