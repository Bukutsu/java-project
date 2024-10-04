package item;

import java.io.*;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;
import java.util.Optional;

public class ItemDAO implements DAO<Item>{
    final private static String fileName = "item.txt";

    @Override
    public void save(Item item) throws IOException {
        Writer writer = new FileWriter("output/item.txt");
        writer.write(item.getItemInfo());
        writer.close();
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

    @Override
    public List findALL() {
        return null;
    }
}
