package exercise1;

public class Patient {
    private int patientid;
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String province;
    private String postalcode;

    public Patient(int patientid, String firstname, String lastname,String address, String city,
                   String province, String postalcode) {
        this.patientid = patientid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalcode = postalcode;
    }

    public Patient() {
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int id) {
        this.patientid = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getPatientInfo() {
        return String.format("PatientId: %d%n"
                +"FirstName: %s%n"
                +"LastName: %s%n"
                +"Address: %s%n"
                +"City: %s%n"
                +"Province: %s%n"
                +"PostalCode: %s%n",
                this.getPatientid(),
                this.getFirstname(),
                this.getLastname(),
                this.getAddress(),
                this.getCity(),
                this.getProvince(),
                this.getPostalcode()

        );
    }

}