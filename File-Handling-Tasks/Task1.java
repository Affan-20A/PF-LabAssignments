/*TASK 1:
Filter and Write CSV
Problem: Read student data and create a new CSV file containing only students with GPA >= 3.5*/

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task1 {
    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("C:\\Users\\pc\\Desktop\\Affan VS Java\\Trying to learn file handling\\students.csv");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);
        String[] rows = fileContent.split("\n");
        PrintWriter writer = new PrintWriter("C:\\Users\\pc\\Desktop\\Affan VS Java\\Trying to learn file handling\\honor_students.csv");
        writer.println(rows[0]);

        for (int i=1; i<rows.length; i++) {
            String row = rows[i];
            String[] columns = row.split(",");
            double gpa = Double.parseDouble(columns[3]);
            if (gpa >= 3.5) {
                writer.println(row);
            }
        }
        writer.close();
    }
}