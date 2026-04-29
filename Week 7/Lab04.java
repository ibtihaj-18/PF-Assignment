import java.io.*;

public class Lab04 {
    public static void main(String[] args) {
        String jsonFile = "order.json";
        String yamlFile = "order.yaml";

        // Generate JSON
        try (PrintWriter out = new PrintWriter(new FileWriter(jsonFile))) {
            out.println("{");
            out.println("  \"order_id\": 1001,");
            out.println("  \"customer\": { \"name\": \"Alice Johnson\", \"email\": \"alice@email.com\" },");
            out.println("  \"items\": [");
            out.println("    { \"product\": \"Laptop\", \"qty\": 2, \"price\": 1200 },");
            out.println("    { \"product\": \"Mouse\", \"qty\": 1, \"price\": 25 }");
            out.println("  ],");
            out.println("  \"total\": 2425,");
            out.println("  \"status\": \"Shipped\"");
            out.println("}");
        } catch (IOException e) { e.printStackTrace(); }

        // Generate YAML
        try (PrintWriter out = new PrintWriter(new FileWriter(yamlFile))) {
            out.println("order:");
            out.println("  id: 1001");
            out.println("  customer:");
            out.println("    name: Alice Johnson");
            out.println("  items:");
            out.println("    - product: Laptop\n      qty: 2\n      price: 1200");
            out.println("    - product: Mouse\n      qty: 1\n      price: 25");
            out.println("  status: Shipped");
        } catch (IOException e) { e.printStackTrace(); }

        System.out.println("Success! Order #1001 files generated in JSON and YAML.");
    }
}