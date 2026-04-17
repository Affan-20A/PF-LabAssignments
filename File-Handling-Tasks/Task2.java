/*TASK 2
Calculate Average from CSV
Problem: Read a CSV file with product prices and calculate the average price.*/

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("C:\\Users\\pc\\Desktop\\Affan VS Java\\Trying to learn file handling\\product_prices.csv");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);
        String[] rows = fileContent.split("\n");
        PrintWriter writer = new PrintWriter("C:\\Users\\pc\\Desktop\\Affan VS Java\\Trying to learn file handling\\average_price.csv");
        writer.print("Average Price: ");

        double totalPrice = 0;
        int noOfProducts = 0;
        for(int i=1 ; i<rows.length ; i++) {
            String row = rows[i];
            String[] columns = row.split(",");
            double price = Double.parseDouble(columns[1]);
            totalPrice = totalPrice + price;
            noOfProducts++;
        }
        double average = totalPrice/noOfProducts;
        writer.print(average + " PKR" + "\nNo of Products: " + noOfProducts);
        writer.close();
    }
}