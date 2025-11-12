package com.rs.main;

import com.rs.arth.Airthmetic;
import com.rs.digitalPayment.Digital;
import com.rs.payment.UpiPayment;

public class App {
	public static void main(String[] args) {
		Airthmetic arth = new Airthmetic();
		System.out.println("Result is: " + arth.Sum(10, 20));
		System.out.println("Result is: " + arth.Sub(10, 20));
		System.out.println("=======================");
		UpiPayment payment=new UpiPayment();
		System.out.println(payment.Upi(52684971l, 5000.0));
		System.out.println("=======================");
		Digital dig=new Digital();
		System.out.println(dig.SendMoney(541287964l, 50000.0, "Birsinghpur"));
	}
}
