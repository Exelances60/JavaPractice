import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   /*     try {
          int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);

        } catch (Exception e) {
            System.out.println("An error occurred"+" "+e);

        }*/
      /*  BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("D:\\KodProjeleri\\Java\\ExpectionHandler\\src\\sayilar.txt"));
            String firstLine = reader.readLine();
            System.out.println(firstLine);
        } catch (Exception e) {
            System.out.println("An error occurred" + " " + e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("Reader is closed");
                }
            } catch (Exception e) {
                System.out.println("An error occurred" + " " + e);
            }
        }*/
        File file = new File("D:\\KodProjeleri\\Java\\ExpectionHandler\\src\\sayilar.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("An error occurred" + " " + e);
        } finally {
            try {
                if (scanner != null) {
                    scanner.close();
                    System.out.println("Scanner is closed");
                }
            } catch (Exception e) {
                System.out.println("An error occurred" + " " + e);
            }
        }


    }
}