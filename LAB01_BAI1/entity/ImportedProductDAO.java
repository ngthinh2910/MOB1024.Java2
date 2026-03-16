package entity;

import java.util.Scanner;

public class ImportedProductDAO extends ImportedProduct {
	
	public ImportedProductDAO(String id, String name, double basePrice, double importedTaxRate, double shippingFee) {
		super(id, name, basePrice, importedTaxRate, shippingFee);
	}
	
	public ImportedProductDAO() {}
	
	Scanner sc = new Scanner(System.in);
    public void NewImportedProduct() {
        // 1. Nhập ID
        String id;
        do {
            System.out.print("Nhập ID: ");
            id = sc.nextLine();
        } while (!this.setId(id)); 
        System.out.print("Nhập tên SP: ");
        this.setName(sc.nextLine());
        do {
            System.out.print("Nhập giá: ");
            double basePrice = Double.parseDouble(sc.nextLine()); 
            
            if (!this.setBasePrice(basePrice)) {
                System.out.println("Bạn nhập giá phải lớn hơn 0");
            } else {
                break;
            }
        } while (true);
        
        do {
            System.out.print("Nhập thuế: ");
            double importTaxRate = Double.parseDouble(sc.nextLine()); 
            
            if (!this.setImportTaxRate(importTaxRate)) {
                System.out.println("Bạn nhập thuế trong khoảng từ 0 đến 1");
            } else {
                break;
            }
        } while (true);
        
        do {
            System.out.print("Nhập phí: ");
            double shippingFee = Double.parseDouble(sc.nextLine()); 
            
            if (!this.setShippingFee(shippingFee)) {
                System.out.println("Bạn nhập giá phải lớn hơn 0");
            } else {
                break;
            }
        } while (true);
    }
}