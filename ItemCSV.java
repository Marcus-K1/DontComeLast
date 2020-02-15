import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ItemCSV {
    private String filename = "";
    private ArrayList<FoodItem> itemNames = new ArrayList<>();

    public ItemCSV(String filename) {
        this.filename = filename;
    }

    private void parseCSV() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (IOException e) {
            
        } finally {
            try {
                reader.close();
            } catch (IOException ie) {
                System.out.println("Error occurred while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
    }
}