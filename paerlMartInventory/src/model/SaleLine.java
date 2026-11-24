package model;

import java.time.LocalDate;

public class SaleLine {
	private String itemId;
	private String name;
	private String unitPrice;
	private int quantity;
	private LocalDate transactionTime;
	public SaleLine() {
		
	}
	public SaleLine(String itemId, String name, String unitPrice, int quantity, LocalDate transactionTime) {
		
		this.itemId = itemId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.transactionTime = transactionTime;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public LocalDate getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(LocalDate transactionTime) {
		this.transactionTime = transactionTime;
	}
	@Override
	public String toString() {
		return "SaleLine itemId: " + itemId + "\nname; " + name + "\nunitPrice: " + unitPrice + "quantity: " + quantity
				+ "\n transaction time: " + transactionTime ;
	}
	 public void saleStart() {
		 
	 }
	public void addline(Sale sale, String itemId, int wantedQuantity) throws IllegalArgumentException{
		if(itemId == null ) {
            throw new IllegalArgumentException("Item does not exsits");
		}
		if(wantedQuantity > quantity) {
			System.out.println("Availabe Stock is: "+ quantity);
	}
		}
}
