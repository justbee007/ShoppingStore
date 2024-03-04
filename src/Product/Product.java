package Product;

public class Product implements ProductAPI {
 private double cost;
 private String category;
 private String productname;
 
 public Product(ProductBuilder productbuilder) {
     this.cost = productbuilder.getCost();
     this.category = productbuilder.getCategory();
     this.productname = productbuilder.getProductname();
 }
	@Override
	public double getCost() {
		return cost;
//		return this.getCost();
		
	}

	@Override
	public String getProductName() {
	
		return productname;
	}
	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return category;
	}
	@Override
	public String toString() {
		return "Product [cost=" + cost + ", category=" + category + ", productname=" + productname + "]";
	}
	
}
