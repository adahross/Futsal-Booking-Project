/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author darsa
 */
public class BookingItem implements FacilityManager{
    
    
    Item item = new Item();
    private int bookingID;
    private String username;
    private String bookingStat;
    private double price;
    private String payStatus;
    private String bookDate;    

    @Override
    public void createInstance(String facType) { 
        if (facType.equals("Item")) {
            item = new Item();
        }
        throw new UnsupportedOperationException("Not supported yet."); 
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FacilityManager getInstance() {

        return instance;
    }
    
    public void setItem(Item item){
        this.item = item;
    }
    public Item getItem(){
        return item;
    }
    
      /**
     * @return the bookingID
     */
    public int getBookingID() {
        return bookingID;
    }

    /**
     * @param bookingID the bookingID to set
     */
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getBookDate() {
        return bookDate;
    }

    /**
     * @param bookDate the bookDate to set
     */
    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the courtId
     */
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    
    public void setBookingStat(String bookingStat)
    {
        this.bookingStat = bookingStat;
    }
     public String getBookingStat()
    {
        return bookingStat;
    }
}
