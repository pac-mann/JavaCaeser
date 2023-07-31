package ke.co.safaricom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Data data = new Data();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Process: ");
        int process = scanner.nextInt();

        System.out.print("Enter Message: ");
        String message = scanner.next();

        System.out.print("Enter Key: ");
        int key = scanner.nextInt();

        data.setMessage(message);
        data.setKey(key);
        data.setProcess(process);

        String output = Process.run(data);
        System.out.println(output);
    }
}