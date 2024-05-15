package entities;

import java.time.LocalDate;

import entities.enums.OrderStatus;

public class Order {
	private int id;
	private LocalDate moment;
	private OrderStatus status;
	
	public Order()
	{
		
	}
	
	public Order(int id, LocalDate moment, OrderStatus status) 
	{
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getMoment() {
		return moment;
	}

	public void setMoment(LocalDate moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public String toString()
	{
		return "Id do pedido: " + id + ", data do pedido: " + moment + ", status do pedido: " + status;
	}
	
}
