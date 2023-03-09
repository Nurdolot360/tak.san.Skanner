import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextByte();
        int bb = scanner.nextByte();
        int aa =0;
        while (aa<=4) {
            aa++;
            if (aa<=bb)
                System.out.print( aa+ss+"\t\t");
            ss++;
        }
    }
}