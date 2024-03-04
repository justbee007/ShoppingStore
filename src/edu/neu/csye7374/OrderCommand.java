package edu.neu.csye7374;

public class OrderCommand implements PlaceOrder {
	private Order order;
	private OrderState state;
	public OrderCommand(Order order)
	{
		this.order = order;
		this.state = new OrderPlacedState();
	}
	public OrderCommand(Order order,OrderState state)
	{
		this.order = order;
		this.state = state;
	}	
	@Override
	public void execute() {
		this.order.createOrder();
		this.order.changeOrderStatus(state);
	}
	@Override
	public void setState(OrderState state)
	{
		this.state = state;
//		state.changeOrderStatus();
	}
	@Override
	public void getStatus()
	{
		this.state.getStatus();
	}
	public Order getOrder()
	{
		return order;
	}
}
