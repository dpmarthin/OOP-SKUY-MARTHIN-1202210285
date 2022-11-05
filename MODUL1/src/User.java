public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    public String user;
    public String name;
    public int phoneNumber;

    public void setUser (String user) {
        this.user = user;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setPhoneNumber (int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void RegisteUser (String user) {
        System.out.println("Register Sukses");
        System.out.println("Name : " + name);
        System.out.println("Phone Number : " + phoneNumber);
    }
    
}
