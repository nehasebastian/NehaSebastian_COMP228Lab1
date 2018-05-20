package exercise1;

import javax.swing.*;

public class PatientTest {
    public static void main(String[] args) {

        String patientid = JOptionPane.showInputDialog("Patient ID");
        String firstName = JOptionPane.showInputDialog("First Name?");
        String lastName = JOptionPane.showInputDialog("Last Name");
        String address = JOptionPane.showInputDialog("Address");
        String city = JOptionPane.showInputDialog("City");
        String province = JOptionPane.showInputDialog("Province");
        String postalcode = JOptionPane.showInputDialog("PostalCode");
        Patient myPatient = new Patient(Integer.parseInt(patientid),firstName,lastName,address,city,province,postalcode);

        JOptionPane.showMessageDialog(null,myPatient.getPatientInfo());

    }
}
