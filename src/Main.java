import java.util.*;
import java.io.*;
// import java.lang.Exception;

public class Main {

    public static void main(String args[]){
        int nodes = 5;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the file name you want to generate\n");
        String fileName = scan.nextLine();

        System.out.println("Hello, please enter the number of lines of data inputs you want\n");
        int dataInputs = scan.nextInt();

        Random rand = new Random();

        try{
            PrintWriter writer = new PrintWriter(fileName);

            int count = 0;
            for (int z = 0; count < dataInputs; z++){
                for (int y = 0; y < 5; y++) {
                    if (count >= dataInputs)
                        break;
                    writer.print(y + 10);
                    writer.printf("%04d\r\n", rand.nextInt(1024));
                    count++;
                }
            }

            writer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not Found");
        }
    }
}
