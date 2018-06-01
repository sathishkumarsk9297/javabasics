package com.basic;

public class Shape {
  double side;
  double length;
  double breadth;
  public Shape(int side) {
	  this.side=side;
  }
  public  Shape(double length,double breadth) {
  if((length > 0.0 && length < 20.0)	&&  (breadth > 0.0 && breadth < 20.0)){
  this.length=length;
  this.breadth=breadth;
  }
  else
  {
	  System.out.println("sorry the should be greater than 0.0 and lesser than 20.0");
  }
  }
  public double Perimeter() {
		return 2*(length+breadth);
  }
public double Area() {
	return length*breadth;
}
public static void main(String[] args) {
	Shape Rectangle=new Shape(5,6);
	System.out.println(Rectangle.Area());
	System.out.println(Rectangle.Perimeter());
}
}