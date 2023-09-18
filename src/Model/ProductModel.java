package Model;

import java.sql.Date;

public class ProductModel {

    private int ProductID;
    private String Barcode;
    private String ProductName;
    private int CategoryID;
    private int UnitID;
    private double BuyPrice;
    private double SalePrice;
    private Date SaveDate;
    private String ImagePath;
    private String Comment;
    private int Sate;

    public ProductModel() {
    }

    public ProductModel(int ProductID, String Barcode, String ProductName, int CategoryID, int UnitID, double BuyPrice, double SalePrice, Date SaveDate, String ImagePath, String Comment, int Sate) {
        this.ProductID = ProductID;
        this.Barcode = Barcode;
        this.ProductName = ProductName;
        this.CategoryID = CategoryID;
        this.UnitID = UnitID;
        this.BuyPrice = BuyPrice;
        this.SalePrice = SalePrice;
        this.SaveDate = SaveDate;
        this.ImagePath = ImagePath;
        this.Comment = Comment;
        this.Sate = Sate;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getBarcode() {
        return Barcode;
    }

    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public int getUnitID() {
        return UnitID;
    }

    public void setUnitID(int UnitID) {
        this.UnitID = UnitID;
    }

    public double getBuyPrice() {
        return BuyPrice;
    }

    public void setBuyPrice(double BuyPrice) {
        this.BuyPrice = BuyPrice;
    }

    public double getSalePrice() {
        return SalePrice;
    }

    public void setSalePrice(double SalePrice) {
        this.SalePrice = SalePrice;
    }

    public Date getSaveDate() {
        return SaveDate;
    }

    public void setSaveDate(Date SaveDate) {
        this.SaveDate = SaveDate;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String ImagePath) {
        this.ImagePath = ImagePath;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public int getSate() {
        return Sate;
    }

    public void setSate(int Sate) {
        this.Sate = Sate;
    }

    @Override
    public String toString() {
        return "ProductModel{" + "ProductID=" + ProductID + ", Barcode=" + Barcode + ", ProductName=" + ProductName + ", CategoryID=" + CategoryID + ", UnitID=" + UnitID + ", BuyPrice=" + BuyPrice + ", SalePrice=" + SalePrice + ", SaveDate=" + SaveDate + ", ImagePath=" + ImagePath + ", Comment=" + Comment + ", Sate=" + Sate + '}';
    }

}
