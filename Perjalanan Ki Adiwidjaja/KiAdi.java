import java.util.Scanner;

public class KiAdi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int position_x = scanner.nextInt();
        int position_y = scanner.nextInt();

        scanner.nextLine();

        char[] moves = scanner.nextLine().toCharArray();

        for (char move : moves) {
            switch (move) {
                case 'u': position_x--;break;
                case 's':position_x++;break;
                case 't':position_y--;break;
                case 'b':position_y++;break;
            }
        }

        System.out.println(position_x + " " + position_y);;
    }
} 
