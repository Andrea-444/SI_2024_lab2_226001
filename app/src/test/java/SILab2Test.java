import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class SILab2Test {

    @Test
    void testEveryBranch() {
        // allItems = null, payment = 100
        RuntimeException exception1 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
        assertTrue(exception1.getMessage().contains("allItems list can't be null!"));

        // allItems = [new Item(null, null, 100, 0)], payment = 100
        List<Item> lista = new ArrayList<>();
        lista.add(new Item(null, null, 100, 0));
        RuntimeException exception2 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(lista, 100));
        assertTrue(exception2.getMessage().contains("No barcode!"));

        // allItems = [new Item("Item1", "1C34567890", 100, 0)], payment = 100
        List<Item> lista2 = new ArrayList<>();
        lista2.add(new Item("Item1", "1C34567890", 100, 0));
        RuntimeException exception3 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(lista2, 100));
        assertTrue(exception3.getMessage().contains("Invalid character in item barcode!"));

        // allItems = [new Item("Item1", "0234567891", 500, 0.5)], payment = 100
        List<Item> lista3 = new ArrayList<>();
        lista3.add(new Item("Item1", "0234567891", 500, 0.5F));
        assertFalse(SILab2.checkCart(lista3,100));

        // allItems = [new Item("Item1", "0234567891", 50, 0)], payment = 100
        List<Item> lista4 = new ArrayList<>();
        lista4.add(new Item("Item1", "0234567891", 50, 0));
        assertTrue(SILab2.checkCart(lista4,100));
    }

    @Test
    void testMultipleCondition() {
        // TTT
        List<Item> lista = new ArrayList<>();
        lista.add(new Item("Item1", "0234567891", 500, 0.5F));
        assertFalse(SILab2.checkCart(lista, 100));

        // TTF
        List<Item> lista2 = new ArrayList<>();
        lista2.add(new Item("Item1", "1234567890", 500, 0.5F));
        assertFalse(SILab2.checkCart(lista2, 100));

        // TFX
        List<Item> lista3 = new ArrayList<>();
        lista3.add(new Item("Item1", "0234567891", 500, 0));
        assertFalse(SILab2.checkCart(lista3, 100));

        // FXX
        List<Item> lista4 = new ArrayList<>();
        lista4.add(new Item("Item1", "0234567891", 200, 0.5F));
        assertTrue(SILab2.checkCart(lista4, 100));
    }

}

