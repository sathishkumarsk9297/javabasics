package com.basic;

public class Invoice {
String number;
String description;
int quantity;
double price;

public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	if(quantity>0) {
	this.quantity = quantity;
	}
	else {
		this.quantity=0;
	}
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	if(price>0) {
		this.price = price;
		}
		else {
			this.price=0;
		}
}
public double getInvoiceAmount()
{
return quantity * price;
}
public static void main(String[] args)
{
Invoice invoice1 = new Invoice();
invoice1.setNumber("2");
invoice1.setQuantity(-20);
invoice1.setPrice(200.0);
System.out.println(invoice1.getNumber());
System.out.println(invoice1.getQuantity());
System.out.println(invoice1.getPrice());
System.out.println(invoice1.getInvoiceAmount());
}
}
