import java.util.Scanner;

public class Gaji {
    static int masaKerja;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        masaKerja = input.nextInt();
        int jamLembur = input.nextInt();

        System.out.print(TestReflection.class.getDeclaredMethods().length);
        
    }
    
}
