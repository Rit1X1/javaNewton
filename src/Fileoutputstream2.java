import java.io.FileOutputStream;

public class Fileoutputstream2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
            String s = "Welcome to the JavaPoint";
            //converting an array to Byte Array;
            byte b[] = s.getBytes();

            fout.write(b);
            fout.close();
            System.out.println("Success.....");

        }catch(Exception e){System.out.println(e);}
    }
}
