package pac;
public class ContractBuilder {
    private int contractID;
    private int propertyID;
    private int tenantID;
    private double rentAmount;
    private Term term;

    public ContractBuilder setContractID(int contractID) {
        this.contractID = contractID;
        return this;
    }

    public ContractBuilder setPropertyID(int propertyID) {
        this.propertyID = propertyID;
        return this;
    }

    public ContractBuilder setTenantID(int tenantID) {
        this.tenantID = tenantID;
        return this;
    }

    public ContractBuilder setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
        return this;
    }

    public ContractBuilder setTerm(Term term) {
        this.term = term;
        return this;
    }

    public Contract build() {
        return new Contract(contractID, propertyID, tenantID, rentAmount, term);
    }
}