import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JavaFile_1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            String s= "welcome to javapoint";
            byte b[] = s.getBytes();


            fout.write(65);
            fout.close();
            System.out.println("success....");

        }catch(Exception e){System.out.println(e);}
    }
}
