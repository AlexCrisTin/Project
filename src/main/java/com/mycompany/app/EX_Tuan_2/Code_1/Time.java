package com.mycompany.app.EX_Tuan_2.Code_1;

public class Time {

    int second;
    int minute;
    int hour;

    
    public Time() {
        setTime(0, 0, 0);
    }
    Time(int s) {
        setTime(0, 0, s);
    }
    Time(int s, int m) {
        setTime(0, m, s);
    }
    Time(int s, int m, int h) {
        setTime(h, m, s);
    }

    void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    void setHour(int h) {
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

    
    public void main(String[] args) {
        Time t = new Time(01, 01, 12);
        System.out.println(t);
    }
}

