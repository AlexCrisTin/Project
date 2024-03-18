package com.mycompany.app.EX_Tuan_2.Code_2.Inhe_Classes;

interface SCSI{
	String add();
	static class Wire{
		static void roll(SCSI s) {
			System.out.println(s.add());
		}
	}
}
public class Ex21 implements SCSI{
	public String add(){
		int i = 1;
		i++;
		return Integer.toString(i);
	}

	public static void main(String[] args) {
		SCSI.Wire.roll(new Ex21());
	}
}