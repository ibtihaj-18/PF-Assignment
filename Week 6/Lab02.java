import java.io.*;

public class Lab02 {
    public static void main(String[] args) {
        String inputFile = "products.csv";
        String line;
        double totalPrice = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            // Skip the header row (Product,Price)
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                
                // Price is the 2nd column (index 1)
                double price = Double.parseDouble(data[1]);
                
                totalPrice += price;
                count++;
            }

            if (count > 0) {
                double average = totalPrice / count;
                System.out.println("Average Price: " + average + " PKR");
                System.out.println("Number of Products: " + count);
            } else {
                System.out.println("No data found in file.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}