import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

class salesStatement {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = ("objects.csv");

        List<ProductPrice> readFromFile (String fileName){
            try (
                    var fileReader = new FileReader(fileName);
                    var reader = new BufferedReader(fileReader);
            ) {
                String nextLine = null;
                int lines = 0;
                while ((nextLine = reader.readLine()) != null) {
                    System.out.println(nextLine);
                    lines++;
                }
                System.out.println("Ilość wierszy w pliku: " + lines);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<ProductPrice> calculations (String fileName){
            while (nameProduct != null) {
                String nameProduct = new String(readFileName.getName);
                BigDecimal priceWithoutVat = new BigDecimal(readFileName.getNettoPrice);
                BigDecimal priceWithVat = priceWithoutVat.multiply(readFileName.getVat);
                BigDecimal priceGross = priceWithoutVat.add(priceWithVat);

            }
        }
    }
}