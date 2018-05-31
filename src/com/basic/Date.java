package com.basic;

public class Date {
int month;
int day;
int year;
public Date(){
}
public Date(int day,int month,int year ){
	this.day = day;
	this.month = month;
	this.year = year;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void displayDate() 
{
	System.out.println(day+"/"+month+"/"+year);
}
public static void main(String[] args)
{
	Date d1 = new Date();
	d1.setDay(31);
	d1.setMonth(05);
	d1.setYear(2018);
	d1.displayDate();
	Date d2 = new Date(1,6,2018);
	d2.displayDate();
}
}
