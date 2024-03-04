package edu.neu.csye7374;

public interface OrderObserver {
void sendOnOrderPlaced(Order order);
void sendOnOrderShipped(Order order);
void sendOnOrderDelivery(Order order);
}
