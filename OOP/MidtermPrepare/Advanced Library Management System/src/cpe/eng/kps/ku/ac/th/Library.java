package cpe.eng.kps.ku.ac.th;
import java.util.ArrayList;

public class Library {
    ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem addingItem){
        for(LibraryItem item : items){
            if(item.getItemId().equals(addingItem.getItemId())){
                System.out.println("This item is aready added");
                return;
            }
        }
        items.add(addingItem);
    }

    public void removeItem(String itemId){
        for(LibraryItem item : items){
            if(item.getItemId().equals(itemId)){
                items.remove(item);
                return;
            }
        }
    }

    public LibraryItem findItem(String itemId){
        for(LibraryItem item : items){
            if(item.getItemId().equals(itemId)){
                return item;
            }
        }
        return null;
    }

    public boolean borrowItem(String itemId){
        for(LibraryItem item : items){
            if(findItem(item.getItemId()) != null){
               if(item.isAvailable()){
                    item.setAvailable(false);
                    return true;
               }
            }           
        }
        return false;
    }

    public boolean returnItem(String itemId){
        for(LibraryItem item : items){
            if(findItem(item.getItemId()) != null){
               if(!item.isAvailable()){
                    item.setAvailable(true);
                    return true;
               }
            }           
        }
        return false;
    }


}
