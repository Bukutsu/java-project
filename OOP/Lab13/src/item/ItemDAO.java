package item;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemDAO implements DAO<Item>{


    @Override
    public void save(Item item) throws IOException {

        Writer writer = new FileWriter("D:/output/item.txt",true);
        writer.write(item.getItemInfo() + "\n");
        writer.close();
    }
    
    public ArrayList<Item> findALL() throws FileNotFoundException {
    	ArrayList<Item> items = new ArrayList<Item>();
    	
    	FileReader reader = new FileReader("D:/output/item.txt");
    	BufferedReader br = new BufferedReader(reader);
    	
    	String line;
    	
    	try {
			while( (line = br.readLine() ) != null) {
				int quantity;
				double price;
			    String[] splited = line.split(",");
			    price = Double.parseDouble(splited[1]);
			    quantity = Integer.parseInt(splited[2]);
			    
			    items.add(new Item(splited[0],price,quantity));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 	
    	
        return items;
    }


    @Override
    public void update(Item t, String[] params) {
        
        
    }

    @Override
    public void delete(Item t) {
        
        
    }

    @Override
    public Optional findByID(long id) {
        return null;
    }


}
