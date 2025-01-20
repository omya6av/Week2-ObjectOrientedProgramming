//Create Book class
class Book {

//Create data variables

   String title;
   String author;
   int price;
   boolean availability;


   //Parameterized  Constructor
   Book(String title, String author, int price, boolean availability) {
       this.title = title;
       this.author = author;
       this.price = price;
       this.availability = availability;
   }

//Method to borrow a book.

   public void isAvailable() {

       if (availability == true) {
           System.out.println("The book " + title + " is borrowed.");
           availability = false;
       } else {
           System.out.println("The book " + title + " is not available right now.");
       }
   }
}
      class BookBorrow {
          public static void main(String[] args) {

              // Create Circle objects
              Book book1 = new Book("Millionare", "Adam", 2450, true);
                Book book2 = new Book ("ABC","xyx",2333,false);
              //Borrow book
              book1.isAvailable();
              book2.isAvailable();

          }
      }