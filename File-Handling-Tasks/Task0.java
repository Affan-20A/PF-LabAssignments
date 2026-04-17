/*Task-00
Add two columns Total and Average to a set of data containting subject marks*/

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
public class Task0 {
    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("C:\\Users\\pc\\Desktop\\Affan VS Java\\Trying to learn file handling\\subject_marks.csv");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);
        String[] rows = fileContent.split("\\r?\\n");
        String headers = rows[0];
        headers += ",Total,Average";
        PrintWriter writer = new PrintWriter("C:\\Users\\pc\\Desktop\\Affan VS Java\\Trying to learn file handling\\total_average_subject.csv");
        writer.println(headers);
        for (int i=1; i<rows.length ; i++) {
            String row = rows[i];
            String[] columns = row.split(",");
            int pfMarks = Integer.parseInt(columns[2]);
            int ictMarks = Integer.parseInt(columns[3]);
            int mathsMarks = Integer.parseInt(columns[4]);
            int englishMarks = Integer.parseInt(columns[5]);
            int totalMarks = pfMarks + ictMarks + mathsMarks + englishMarks;
            double average = totalMarks/4;
            row += "," + totalMarks + ',' + average;
            writer.println(row);
        }
        writer.close();
    }
}