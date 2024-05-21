package pac;
public class Contract {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private double rentAmount;
    private Term term;

    public Contract(int contractID, int propertyID, int tenantID, double rentAmount, Term term) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
        this.term = term;
    }

    public int getContractID() {
        return contractID;
    }

    public int getPropertyID() {
        return propertyID;
    }

    public int getTenantID() {
        return tenantID;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public Term getTerm() {
        return term;
    }
}