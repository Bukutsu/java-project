package cpe.eng.kps.ku.ac.th;

public abstract class  LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean available;
    

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getItemId() {
        return itemId;
    }
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LibraryItem(String title,String itemId){
        this.title = title;
        this.itemId = itemId;
    }
    
    public abstract double calculateLateFee(int daysLate){


        //return
    }

    public String toString(){
        return 
    }

}
