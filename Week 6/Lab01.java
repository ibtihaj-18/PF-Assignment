import java.io.*;

public class Lab01 {
    public static void main(String[] args) {
        String inputFile = "students.csv";
        String outputFile = "honor_students.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {

            // Read and write the header (Name,Age,Grade,GPA)
            String header = br.readLine();
            if (header != null) {
                pw.println(header);
            }

            // Process each row
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                
                // GPA is the 4th column (index 3)
                double gpa = Double.parseDouble(data[3]);

                // Filter condition: GPA >= 3.5
                if (gpa >= 3.5) {
                    pw.println(line);
                }
            }
            System.out.println("Filter complete! Check honor_students.csv");

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}