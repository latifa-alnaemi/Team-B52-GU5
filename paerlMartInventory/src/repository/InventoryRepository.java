package repository;

import java.util.Optional;

import model.InventoryItem;
import model.InventoryMovement;

public interface InventoryRepository {
	void save(InventoryItem item);
    Optional<InventoryItem> findById(String itemBarcode);
	public void save(InventoryMovement item);

	public void findAll();

	public void addMovement(InventoryMovement movement);

	public void listMovements();
}
