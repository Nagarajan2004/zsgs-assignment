package abstractclassandmethods;

import java.util.ArrayList;
import java.util.List;

abstract class Product{
	private String name;
	private double price;
	Product(String name, double price){
		this.name = name;
		this.price = price;
	}
	public abstract String getDiscription();
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Product name=" + name + "\n price=" + price + "\n";
	}	
}

class ElectronicsProduct extends Product{
	private String brand;
	public ElectronicsProduct(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}
	@Override
	public String getDiscription() {
		return super.toString()+ "brand: "+brand+"\n";
	}
}

class ClothingProduct extends Product{
	private String brand;
	private String size;
	private String material;
	public ClothingProduct(String name, double price, String brand, String size, String mateial) {
		super(name, price);
		this.brand = brand;
		this.size = size;
		this.material = mateial;
	}
	@Override
	public String getDiscription() {
		return super.toString()+ "brand: "+brand+"\n"+ "size: "+size+"\n"+ "material: "+material+"\n";
	}
}

public class ShippingCart {
	public static void main(String[] args) {
		List<Product> shippingCart1 = new ArrayList<Product>();
		shippingCart1.add(new ElectronicsProduct("Watch", 2000, "Titen"));
		shippingCart1.add(new ElectronicsProduct("phone", 10000, "realme"));
		shippingCart1.add(new ClothingProduct("hoodie", 500, "Calvin Klein", "M", "Cotton"));
		System.out.println(calculateShippingCart(shippingCart1));
	}
	
	private static double calculateShippingCart(List<Product> spc) {
		double sum = 0;
		for(Product p : spc) {
			sum += p.getPrice();
		}
		return sum;
	}
}
