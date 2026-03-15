package entity;

public class ImportedProduct extends Product{
	private double importedTaxRate;
	public boolean setImportedTaxRate(double importedTaxRate) {
		if (importedTaxRate >= 0 && importedTaxRate <=1) {
			this.importedTaxRate = importedTaxRate;
			return true;
		}else {
			return false;
		}
	}
	
	private double shippingFee;
	public boolean setShippingFee(double shippingFee) {
		if (shippingFee >= 0) {
			this.shippingFee = shippingFee;
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public double finalPrice() {
		// TODO Auto-generated method stub
		return super.finalPrice() + super.finalPrice()*this.importedTaxRate + this.shippingFee;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "shippingFee= " + shippingFee + ", VAT= "+importedTaxRate;
	}
	
	
}
