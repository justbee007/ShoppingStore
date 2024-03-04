package Product;

public interface ProductFactory {
	 ProductAPI createProduct(double cost, String category, String productName);
}
