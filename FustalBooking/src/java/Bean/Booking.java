/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

/**
 *
 * @author User
 */
public class Booking implements FacilityManager{

    /**
     * @return the bookDate
     */
   Court court = new Court();
   Item item = new Item();
    private int bookingID;
    private String username;
    private String bookingStat;
    private int courtID;
    private String courtType;
    private String courtName;
    private double price;
    private String payStatus;
    private String bookDate;
    private int itemID;
    private String itemType;
    private String itemName;

    
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

    @Override
    public void createInstance(String facType){
    
      if (facType.equals("Court")) {
            court = new Court();
        } else if (facType.equals("Item")) {
            item = new Item();
        }
   
    }
    
    @Override
    public FacilityManager getInstance(){
    
           return instance;
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
     * @return the courtID
     */
    public int getCourtID() {
        return courtID;
    }

    public int getItemID() {
        return itemID;
    }

    /* @param itemID the itemID to set
     */
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    /**
     * @param courtID the courtID to set
     */
    public void setCourtID(int courtID) {
        this.courtID = courtID;
    }

    /**
     * @return the courtType
     */
    public String getCourtType() {
        return courtType;
    }

    /**
     * @return the itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * @param courtType the courtType to set
     */
    public void setCourtType(String courtType) {
        this.courtType = courtType;
    }

    /**
     * @param itemType the itemType to set
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     * @return the bookingStat
     */
    public String getBookingStat() {
        return bookingStat;
    }

    /**
     * @param bookingStat the bookingStat to set
     */
    public void setBookingStat(String bookingStat) {
        this.bookingStat = bookingStat;
    }

    /**
     * @return the courtName
     */
    public String getCourtName() {
        return courtName;
    }

    /**
     * @param courtName the courtName to set
     */
    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
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
}
