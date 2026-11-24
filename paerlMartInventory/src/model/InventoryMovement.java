package model;

import java.time.LocalDate;

public class InventoryMovement {
	private String movementId;
	private int itemId;
	private String type;
	private int quantityChange;
	private LocalDate timeStamp;

	public InventoryMovement() {

	}

	public InventoryMovement(String movementId, int itemId, String type, int quantityChange, LocalDate timeStamp) {

		this.movementId = movementId;
		this.itemId = itemId;
		this.type = type;
		this.quantityChange = quantityChange;
		this.timeStamp = timeStamp;
	}

	public String getMovementId() {
		return movementId;
	}

	public void setMovementId(String movementId) {
		this.movementId = movementId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantityChange() {
		return quantityChange;
	}

	public void setQuantityChange(int quantityChange) {
		this.quantityChange = quantityChange;
	}

	public LocalDate getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDate timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "InventoryMovement movementId: " + movementId + "\nitemId: " + itemId + "\ntype: " + type
				+ "quantityChange: \n" + quantityChange + "\ntimeStamp: " + timeStamp;
	}

}
