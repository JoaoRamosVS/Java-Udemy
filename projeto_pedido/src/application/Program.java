package application;

import java.time.LocalDate;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order1 = new Order(1, LocalDate.now(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order1);
	}

}
