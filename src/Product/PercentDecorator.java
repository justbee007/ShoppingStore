package Product;

public class PercentDecorator implements ProductDecorator {
	private ProductAPI product;
	private double percentage;
	
	public PercentDecorator(ProductAPI product, double percentage)
	{
		this.product = product;
		this.percentage = percentage;
	}
	@Override
	public ProductAPI getDiscountedProduct() {
        double discountedCost = this.product.getCost() - (product.getCost() * percentage / 100);
        ProductBuilder builder = new ProductBuilder();
        ProductAPI discountedproduct = builder
			    .setCost(discountedCost)
			    .setCategory(this.product.getCategory())
			    .setProductname(this.product.getProductName())
			    .build();
		return discountedproduct;
		
	}

}
