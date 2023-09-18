package Model;

public class CategoryModel {

    private int CategoryID;
    private String CategoryName;

    public CategoryModel(int CategoryID, String CategoryName) {
        this.CategoryID = CategoryID;
        this.CategoryName = CategoryName;
    }

    public CategoryModel() {
       
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    @Override
    public String toString() {
        return "CategoryModel{" + "CategoryID=" + CategoryID + ", CategoryName=" + CategoryName + '}';
    }

}
