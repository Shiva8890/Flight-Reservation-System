public class Passenger {

    private Address address;
    private Contact contact;
    private static int idCounter;
    private int id;

    static {
        idCounter = 0;
    }


//  getter and setter
        public int getId(){return id;} public void setId(int id) {this.id = id;}

        public String getAddressDetails(){return address.street+","+address.city+","+address.state;}
        public void setAddressDetails(Address address) {this.address = address;}

        public String getContactDetails() {return contact.name +","+ contact.emailAddress +","+ contact.phone;} public void setContactDetails(Contact contact) {this.contact = contact;}

//  constructor
    Passenger(int id,String name, String emailAddress, String phone, String street, String city, String state ) {
        this.id = ++idCounter;
        this.address = new Address(street,city,state);
        this.contact = new Contact(name,emailAddress,phone);

    }

//  Methods
    public String getContact(String contact) {return contact;}

    public String getAddress(String address) {return address;}

    int getPassengerCount() {return idCounter;}

//  Contact Class
    private static class Contact {

        private String name;
        private String emailAddress;
        private String phone;

//  Constructor
        Contact(String phone, String emailAddress, String name) {
            this.phone = phone;
            this.emailAddress = emailAddress;
            this.name = name;
        }

//  getter and setter
        public String getName() {return name;}public void setName(String name) {this.name = name;}

        public String getEmailAddress() {return emailAddress;} public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}

        public String getPhone() {return phone;} public void setPhone(String phone) {this.phone = phone;}

    }
//  Address Class
    private static class Address {

       private String street;
       private String city;
       private String state;

//  Constructor
        Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

//      getter and setter
        public String getStreet() {return street;} public void setStreet(String street) {this.street = street;}

        public String getCity() {return city;} public void setCity(String city) {this.city = city;}

        public String getState() {return state;} public void setState(String state) {this.state = state;}

    }

}
