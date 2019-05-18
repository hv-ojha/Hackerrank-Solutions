
class MyBook extends Book
{
// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    int price;
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    MyBook(String tit, String auth, int pri)
    {
        super(tit, auth);
        this.price=pri;
    }
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    void display()
    {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
// End class
}
