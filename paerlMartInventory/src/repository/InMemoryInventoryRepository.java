package repository;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import model.InventoryItem;
import model.InventoryMovement;

public abstract class InMemoryInventoryRepository implements InventoryRepository {
    
    private final Map<String, InventoryItem> storage = new ConcurrentHashMap<>();

    @Override
    public void addMovement(InventoryMovement movement) {
        save(movement);
    }

    public Optional<InventoryItem> findById(String itemBarcode) {
        return Optional.ofNullable(storage.get(itemBarcode));
    }
}