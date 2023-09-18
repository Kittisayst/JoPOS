package Model;

public class UnitModel {

    private int UnitID;
    private String UnitName;

    public UnitModel() {
    }

    public UnitModel(int UnitID, String UnitName) {
        this.UnitID = UnitID;
        this.UnitName = UnitName;
    }

    public int getUnitID() {
        return UnitID;
    }

    public void setUnitID(int UnitID) {
        this.UnitID = UnitID;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String UnitName) {
        this.UnitName = UnitName;
    }

    @Override
    public String toString() {
        return "UnitModel{" + "UnitID=" + UnitID + ", UnitName=" + UnitName + '}';
    }

}
