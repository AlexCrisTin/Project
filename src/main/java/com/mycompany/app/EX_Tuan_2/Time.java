package com.mycompany.app.EX_Tuan_2;

public class time {
    private int second;
    private int minute;
    private int hour;

    
    public time() {
        setTime(0, 0, 0);
    }
    public time(int s) {
        setTime(0, 0, s);
    }
    public time(int s, int m) {
        setTime(0, m, s);
    }
    public time(int s, int m, int h) {
        setTime(h, m, s);
    }


    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        if (h >= 0 && h < 24) {
            hour = h;
        } 
         
    }
    public void setMinute(int m) {
        if (m >= 0 && m < 60) {
            minute = m;
        } 
    }
    public void setSecond(int s) {
        if (s >= 0 && s < 60) {
            second = s;
        } 
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    
    public static void main(String[] args) {
        time t = new time(01, 01, 12);
        System.out.println(t);
    }
}

