
public class RegularTicket extends Ticket {

    private String specialServices;
    private Flight flight;

// getter and setter
    public String getSpecialServices() {return specialServices;} public void setSpecialServices(String specialServices) {this.specialServices = specialServices;}

// Constructor

    RegularTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,float price, boolean cancelled , Flight flight, Passenger passenger ){
        super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNo,price,cancelled );
        this.specialServices= null;
    }

//  Methods
       public void updateSpecialServices(String services){
        this.setSpecialServices(services);

       }
}
