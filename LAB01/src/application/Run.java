package application;

import java.util.ArrayList;
import entity.ImportedProduct;
import entity.Product;

public class Run {

	public static void main(String[] args) {
		ArrayList<Product> dsSanPham = new ArrayList<>();
		Product sp1 = new Product();
		Product sp2 = new Product();
		Product sp3 = new Product();
		ImportedProduct sp4 = new ImportedProduct();
		ImportedProduct sp5 = new ImportedProduct();
		
		//add sản phẩm 1
		sp1.setId("SP01");
		sp1.setName("Rượu");
		sp1.setBasePrice(100000);
		
		//add sản phẩm 2
		sp2.setId("SP02");
		sp2.setName("Bia");
		sp2.setBasePrice(99000);
		
		//add sản phẩm 3
		sp3.setId("SP03");
		sp3.setName("Nước ngọt");
		sp3.setBasePrice(20000);
		
		//add sản phẩm 4
		sp4.setId("SP04");
		sp4.setName("Bánh");
		sp4.setBasePrice(10000);
		sp4.setImportedTaxRate(0.8);
		sp4.setShippingFee(1000);
		
		//add sản phẩm
		sp5.setId("SP05");
		sp5.setName("Kẹo");
		sp5.setBasePrice(5000);
		sp5.setImportedTaxRate(0.8);
		sp5.setShippingFee(500);
		
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		dsSanPham.add(sp4);
		dsSanPham.add(sp5);
		
		
		for (Product product : dsSanPham) {
			System.out.println(product.toString());
		}
		
	}	

}
