package pac;
public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Contract contract = client.requestCreateRental(new ContractBuilder()
            .setContractID(1)
            .setPropertyID(2)
            .setTenantID(3)
            .setRentAmount(100.0)
            .setTerm(Term.LongTerm)
        );

        System.out.println("Contract ID: " + contract.getContractID());
        System.out.println("Property ID: " + contract.getPropertyID());
        System.out.println("Tenant ID: " + contract.getTenantID());
        System.out.println("Rent Amount: " + contract.getRentAmount());
        System.out.println("Term: " + contract.getTerm());
    }
}