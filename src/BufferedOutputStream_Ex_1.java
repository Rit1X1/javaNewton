import java.io.*;
public class BufferedOutputStream_Ex_1 {
    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String s ="welcome to the javaTPoint------";
        //No need to use Loops
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        fout.close();
        bout.close();
        System.out.println("Success.....");

    }
}
