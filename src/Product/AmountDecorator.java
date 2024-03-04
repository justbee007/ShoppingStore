package Product;

public class AmountDecorator implements ProductDecorator {
	private ProductAPI product;
	private double amount;
	
	public AmountDecorator(ProductAPI product, double amount)
	{
		this.product = product;
		this.amount = amount;
	}
	@Override
	public ProductAPI getDiscountedProduct() {
        double discountedCost = this.product.getCost() - (this.amount);
        ProductBuilder builder = new ProductBuilder();
        ProductAPI discountedproduct = builder
			    .setCost(discountedCost)
			    .setCategory(this.product.getCategory())
			    .setProductname(this.product.getProductName())
			    .build();
		return discountedproduct;
		
	}

}
