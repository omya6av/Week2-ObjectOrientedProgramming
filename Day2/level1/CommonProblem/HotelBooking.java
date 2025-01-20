//Create HotelBooking  class
class HotelBooking  {

//Create data variables

 String guestName;
 String roomType;
 int nights;


//Parameterized Constructor
HotelBooking( String guestName, String roomType, int nights){
this.guestName = guestName;
this.roomType = roomType;
 this.nights = nights;

}

//Default Constructor
HotelBooking(){
guestName = "Om Yadav";
roomType = "single";
nights = 4;

}
//Copy Constructor
HotelBooking(HotelBooking a){
this.guestName = guestName;
this.roomType = roomType;
 this.nights = nights;
}
     
//Method to  display the details

public void display(){

       System.out.println("Guest Name :  "+guestName);
       System.out.println("Room Type :  "+roomType);
       System.out.println("Number of Nights :  "+nights);

      }
      }
     
      class BookingDetails
      {
          public static void main(String[] args) {

              // Create Circle objects
             HotelBooking booking1 = new HotelBooking("Ishaan", "Single" , 3);
             HotelBooking booking2  = new HotelBooking();
              HotelBooking booking3  = new HotelBooking(booking1);

              // Display the area and circumference of the circle.
              System.out.println("=== Booking 1 ===");
             booking1.display();
              System.out.println("=== Booking 2 ===");
            booking2.display();
            System.out.println("=== Booking 3 ===");
            booking3.display();
            

          }

      }