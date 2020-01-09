package section4;

class ProductC {
    private long id;
    private String productName;
    private String supplierName;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ProductC() {

    }

    public ProductC(long id, String productName, String supplierName) {
        super();
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    void display() {
        System.out.println("Product Id is " + getId());
        System.out.println("Product Name is " + getProductName());
        System.out.println("Supplier Name is " + getSupplierName());
    }

}
