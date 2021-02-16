
public class ContactDTO { //data transfer Object
    private String firstName;
    private String lastName;
    private String address;
    private String contact;
    private String email;

    public ContactDTO() {
    }

    public ContactDTO(String firstName, String lastName, String address,String contact,String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contact = contact;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName= firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact){
        this.contact = contact;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact Details{" +
                "id='" + firstName + '\'' +
                ", name='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + contact +", email='"+email+
                '}';
    }
}

