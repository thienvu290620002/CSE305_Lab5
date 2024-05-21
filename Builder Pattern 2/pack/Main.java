package pack;
public class Main {
    public static void main(String[] args) {
        // Create a normal document
        NormalDocument normalDoc = new NormalDocument("RentalApplication", "This is a rental application...");
        normalDoc.save(); // Saves as .txt file

        // Create a confidential document
        ConfidentialDocument confidentialDoc = new ConfidentialDocument("LeaseAgreement", "This is a lease agreement...");
        confidentialDoc.save(); // Encrypts and saves as .zip file
    }
}
