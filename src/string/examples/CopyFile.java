package string.examples;

import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {  
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("D:\\input.txt");
         out = new FileWriter("D:\\output.txt");
         
         int line;
         while ((line = in.read()) != -1) {
            out.write(line);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}