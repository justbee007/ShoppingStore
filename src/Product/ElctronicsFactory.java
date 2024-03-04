package Product;

public class ElctronicsFactory implements ProductFactory {

	@Override
	public ProductAPI createProduct(double cost, String category, String productName) {
		ProductBuilder builder = new ProductBuilder();
		ProductAPI product = builder
			    .setCost(cost)
			    .setCategory(category)
			    .setProductname(productName)
			    .build();
		return product;
//        return new ProductBuilder(cost, category, productName).build();
    }
}
