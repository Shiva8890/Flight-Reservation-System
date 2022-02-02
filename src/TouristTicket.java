public class TouristTicket extends Ticket {

     private String hotelAddress;
     private String selectedTouristLocation;
     Flight flight;

//  getter and setter
       public String getHotelAddress(){return hotelAddress;} public void setHotelAddress(String hotelAddress) {this.hotelAddress = hotelAddress;}

       public String getSelectedTouristLocation() {return selectedTouristLocation;} public void setSelectedTouristLocation(String selectedTouristLocation) {this.selectedTouristLocation = selectedTouristLocation;}

//  Constructor
  TouristTicket(String pnr,String from,String to,String departureDateTime,String arrivalDateTime,String seatNo,float price, boolean cancelled , Flight flight, Passenger passenger ){
    super(pnr,from,to,flight,departureDateTime,arrivalDateTime,passenger,seatNo,price,cancelled );

           this.hotelAddress = null;
           this.selectedTouristLocation = null;
    }

//   Methods
     public String getTouristLocation(){
        return selectedTouristLocation;
     }
     public void removeTouristLocation(String location){
              List<String> myList = new ArrayList<>(Arrays.asList(selectedTouristLocation));
              myList.remove(location);
              selectedTouristLocation = myList.toArray(new String[0]);
     }
     public void addTouristLocation(String location){
           List<String> myList = new arrayList<>(Arrays.asList(selectedTouristLocation));
           myList.add(location);
         selectedTouristLocation = myList.toArray(new String[0]);

     }

}
