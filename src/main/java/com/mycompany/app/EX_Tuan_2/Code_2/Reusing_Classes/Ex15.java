package com.mycompany.app.EX_Tuan_2.Code_2.Reusing_Classes;

public class Ex15 {
	protected void destroy(){
		System.out.println("Destroy");
	}
}

class Captain extends Ex15{
	 Captain(){
		 destroy();
	 }
}
