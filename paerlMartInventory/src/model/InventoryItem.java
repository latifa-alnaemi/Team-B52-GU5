package model;

import java.time.LocalDate;

public class InventoryItem {
	private String id;
	private String barcode;
	private String name;
	private double sellingPrice;
	private int availableQuantity;
	private String manufacturer;
	
	private String orgin;
	private LocalDate expirtaiondate;

	public InventoryItem() {

	}

	public InventoryItem(String id, String barcode, String name, double sellingPrice, int availableQuantity,
			String manufacturer, String orgin, LocalDate expirtaiondate) {

		this.id = id;
		this.barcode = barcode;
		this.name = name;
		this.sellingPrice = sellingPrice;
		this.availableQuantity = availableQuantity;
		this.manufacturer = manufacturer;
		this.orgin = orgin;
		this.expirtaiondate = expirtaiondate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public LocalDate getExpirtaiondate() {
		return expirtaiondate;
	}

	public void setExpirtaiondate(LocalDate expirtaiondate) {
		this.expirtaiondate = expirtaiondate;
	}

	@Override
	public String toString() {
		return "\nInventoryItem id: " + id + "\nbarcode: " + barcode + "\nname: " + name + "\nsellingPrice: "
				+ sellingPrice + "\navailableQuantity: " + availableQuantity + "\nmanufacturer: " + manufacturer
				+ "\norgin: " + orgin + "\nexpirtaiondate: " + expirtaiondate;
	}

}
