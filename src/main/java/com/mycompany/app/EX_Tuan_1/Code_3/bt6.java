package com.mycompany.app.EX_Tuan_1.Code_3;

public class bt6 {
	static int result = 0;
	public static void main(String[]args) {
        System.out.println(testReturn(4, 1, 9));
    }
	static int testReturn(int testval, int begin, int end) {
		if((testval > begin) && (testval < end))
		return +1;
		else if((testval == begin) || (testval == end))
		return 0;
		else
		return -1;
		}
}
