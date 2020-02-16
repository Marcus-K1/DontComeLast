import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ItemCSV {
    private String filename = "";
    private ArrayList<FoodItem> itemNames = new ArrayList<>();

    public ItemCSV(String filename) {
        this.filename = filename;
        parseCSV();
    }

    private void parseCSV() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            
            // Read line to skip header.
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                
                String restrictions = row.length < 5 ? "All" : row[4];

                FoodItem item = new FoodItem(row[0], Double.parseDouble(row[2]), row[1], row[3], restrictions);
                itemNames.add(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException ie) {
                System.out.println("Error occurred while closing the BufferedReader");
                ie.printStackTrace();
            }
        }
    }

    public FoodItem getFoodItem(int index) {
        return new FoodItem(itemNames.get(index));
    }

    public static void main(String[] args) {
        ItemCSV test = new ItemCSV("items.csv");
        System.out.println(test.getFoodItem(0).toString());
    }
}