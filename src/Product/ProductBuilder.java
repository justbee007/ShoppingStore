package Product;

public class ProductBuilder {
	private double cost;

	@Override
	public String toString() {
		return "ProductBuilder [cost=" + cost + ", category=" + category + ", productname=" + productname + "]";
	}

	public double getCost() {
		return cost;
	}

	public ProductBuilder setCost(double cost) {
		this.cost = cost;
		return this;
	}

	public String getCategory() {
		return category;
	}

	public ProductBuilder setCategory(String category) {
		this.category = category;
		return this;
	}

	public String getProductname() {
		return productname;
	}

	public ProductBuilder setProductname(String productname) {
		this.productname = productname;
		return this;
	}

	private String category;
	private String productname;

	public Product build() {
		return new Product(this);
	}

//	public ProductBuilder() {
//	}

}