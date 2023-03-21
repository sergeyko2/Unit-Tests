package hw11.coffee.order;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CoffeeOrderBoardTest {
    CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();


    @Test
    public void delivery_throw_exception() {
        assertThrows(RuntimeException.class, () -> coffeeOrderBoard.deliver());
    }

    @Test
    public void deliver_OK() {
        Order order = new Order("client");
        List<Order> orderList = new ArrayList<>();
        orderList.add(order);
        coffeeOrderBoard.setOrderList(orderList);

        var result = coffeeOrderBoard.deliver();

        assertEquals(0, coffeeOrderBoard.getOrderList().size());
        assertTrue(result);
    }

    @Test
    public void deliver_number_OK() {
        Order order = new Order("client");
        order.setNumber(1);
        Order order2 = new Order("client");
        order2.setNumber(2);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order);
        orderList.add(order2);
        coffeeOrderBoard.setOrderList(orderList);

        coffeeOrderBoard.deliver(1);
        assertEquals(1, coffeeOrderBoard.getOrderList().size());
        assertEquals(2, coffeeOrderBoard.getOrderList().stream().findFirst().get().getNumber());
    }
}
