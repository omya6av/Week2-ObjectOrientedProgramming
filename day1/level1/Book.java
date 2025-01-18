// create a book class
class Book{

    String title;
    String author;
    double price;
	
    // book constructor
    Book(String title, String author, double price){
        this.title = title;
		this.author =author; 
		this.price = price; 
    }
	
    // display the book details.
    public void display(){
        System.out.println("Title of the book is : "+ title + ", \nAuthor of book is: " + author + " \nand price is: " + price);
    }

}
class Main{
    public static void main(String[] args){

        // create a object of Book
        Book book1 = new Book("The power of yoga", "Yamini Muthanna", 1100 );

        book1.display();
    }
}