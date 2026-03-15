package Application;

import java.util.ArrayList;

import entity.ImportedProduct;
import entity.Product;

public class Run {
	public static void main(String[] args) {
		ArrayList<Product> listProduct = new ArrayList<>();
		Product pd01 = new Product("PD01", "Rượu", 100000);
		Product pd02 = new Product("PD02", "Bia", 90000);
		ImportedProduct pd03 = new ImportedProduct("PD03", "Nước ngọt", 20000, 0.8, 5000);
		ImportedProduct pd04 = new ImportedProduct("PD04", "Bánh", 10000, 0.5, 500);
		ImportedProduct pd05 = new ImportedProduct("PD05", "Kẹo", 5000, 0.5, 200);
		
		listProduct.add(pd01);
		listProduct.add(pd02);
		listProduct.add(pd03);
		listProduct.add(pd04);
		listProduct.add(pd05);
		
		System.out.println("Danh sách sản phẩm: ");
		for (Product product : listProduct) {
			System.out.println(product.toString());
		}
		
		listProduct.sort((o1, o2) -> Double.compare(o2.finalPrice(), o1.finalPrice()));
		Product highestValue = listProduct.get(0);
		System.out.println("Sản phẩm có giá cao nhất là: "+highestValue);
	}

}
