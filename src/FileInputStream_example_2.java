import java.io.FileInputStream;

public class FileInputStream_example_2 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("D:\\testout.txt");

        }catch(Exception e){ System.out.println(e);}
    }
}
