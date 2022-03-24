package src;
public class Job {
    String customerEmail;
    String name;
    String surname;
    String postCode;
    String registration_Number;
    String jobID;
    String bookInDate;
    String mechanicID;

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setRegistration_Number(String registration_Number) {
        this.registration_Number = registration_Number;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public void setBookInDate(String bookInDate) {
        this.bookInDate = bookInDate;
    }

    public void setMechanicID(String mechanicID) {
        this.mechanicID = mechanicID;
    }

    Job(String customerEmail,
        String name, String surname, String postCode, String registration_Number, String jobID, String bookInDate, String mechanicID) {
        this.customerEmail = customerEmail;
        this.name = name;
        this.surname = surname;
        this.postCode = postCode;
        this.registration_Number = registration_Number;
        this.jobID = jobID;
        this.bookInDate = bookInDate;
        this.mechanicID = mechanicID;

    }
}
