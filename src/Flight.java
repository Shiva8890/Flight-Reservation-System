public class Flight {

        private String flightNumber;
        private int capacity;
        private int bookedSeats;
        private String airline;


//  Constructor
        Flight(String flightNumber, int capacity, int bookedSeats, String airline){
           this.flightNumber = flightNumber;
           this.capacity = capacity;
           this.bookedSeats = bookedSeats;
           this.airline = airline;
    }

//  getter setter
        public String getFlightNumber() {return flightNumber;} public void setFlightNumber(String flightNumber) {this.flightNumber = flightNumber;}

        public int getCapacity() {return capacity;} public void setCapacity(int capacity) {this.capacity = capacity;}

        public int getBookedSeats() {return bookedSeats;} public void setBookedSeats(int bookedSeats) {this.bookedSeats = bookedSeats;}

        public String getAirline() {return airline;} public void setAirline(String airline) {this.airline = airline;}

//  Methods
        public String getFlightDetails(){

        return flightNumber +","+capacity+","+bookedSeats+","+airline;
        }
        public boolean checkAvailability(){

        return this.bookedSeats<300;
        }
        public void incrementBookingCounter(){
           bookedSeats++;
        }

}
