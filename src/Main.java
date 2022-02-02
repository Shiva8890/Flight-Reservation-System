import java.awt.*;
import java.util.Scanner;

public class Main {


    public static void  printTicketDetails( Ticket  ticket){

        System.out.println(ticket.getPnr());

    }

    public static void main(String[] args) {

           Flight flight1 = new Flight("31232",300,40,"indigo");
           Flight flight2 = new Flight("31232",300,40,"indigo");

           Passenger passenger1 = new Passenger(1,"Shiva","sharma@123","8890324321","Baba Colony","Delhi","New Delhi");
           Passenger passenger2 = new Passenger(2,"Goldy","Goldy@123","9890328921","Raja park","jaipur","Rajasthan");

           RegularTicket regularTicket = new RegularTicket("3214","Delhi","Goa","11:00 AM","1:30 PM","B12",2780.80f,false,flight1,passenger1);

           TouristTicket touristTicket = new TouristTicket("3421","Jaipur","New Delhi","10:00 AM","11:30 AM","C10",2430.30f,false,flight2,passenger2);

             printTicketDetails(regularTicket);
             printTicketDetails(touristTicket);


    }

}


