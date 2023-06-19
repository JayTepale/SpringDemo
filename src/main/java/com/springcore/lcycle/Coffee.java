package com.springcore.lcycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Coffee implements InitializingBean,DisposableBean{
	private double price;

	@Override
	public String toString() {
		return "Coffee [price=" + price + "]";
	}

	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Coffee(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking coffee");
		
	}

	public void destroy() throws Exception {
		System.out.println("Putting cup");
		
	}

}
