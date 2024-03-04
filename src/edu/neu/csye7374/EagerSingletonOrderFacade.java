package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class EagerSingletonOrderFacade {
	private  static EagerSingletonOrderFacade facadeinstance = new EagerSingletonOrderFacade();
	private List<Order> ordershistory = new ArrayList<>();
	private static List<OrderObserver> observers = new ArrayList<>();
	private EagerSingletonOrderFacade()
	{
		
	}
	public static EagerSingletonOrderFacade getInstance()
	{
		observers.add(new EmailObserver());
		observers.add(new SmSObserver());
		return facadeinstance;
	}
	
	public OrderCommand placeOrder(OrderBuilder orderbuilder)
	{
		Order order = orderbuilder.build();
		OrderCommand orderCommand = new OrderCommand(order);
		orderCommand.execute();
		ordershistory.add(order);
		notifyObserversOnOrderPlacement(order);
		return orderCommand;
	}
	public OrderCommand changeOrderToShippingState(OrderCommand ordercommand)
	{	OrderState state = new OrderShippingState();
			ordercommand.setState(new OrderShippingState());
			ordercommand.getStatus();
			notifyObserversOnOrderShipping(ordercommand.getOrder());
		return ordercommand;
	}
	public OrderCommand changeOrderToDeliveryState(OrderCommand ordercommand)
	{
		ordercommand.setState(new OrderDeliveredState());
		ordercommand.getStatus();
		notifyObserversOnOrderDelivery(ordercommand.getOrder());
		return ordercommand;
	}
	private void notifyObserversOnOrderPlacement(Order order) {
        for (OrderObserver observer : observers) {
            observer.sendOnOrderPlaced(order);
        }
    }

    private void notifyObserversOnOrderShipping(Order order) {
        for (OrderObserver observer : observers) {
            observer.sendOnOrderShipped(order);
        }
    }

    private void notifyObserversOnOrderDelivery(Order order) {
        for (OrderObserver observer : observers) {
            observer.sendOnOrderDelivery(order);
        }
    }
}
