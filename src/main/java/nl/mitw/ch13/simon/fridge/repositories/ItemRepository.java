package nl.mitw.ch13.simon.fridge.repositories;

import nl.mitw.ch13.simon.fridge.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Simon Hiemstra
 * Purpose:
 **/
public interface ItemRepository extends JpaRepository<Item, Long> {
}
