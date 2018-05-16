package string.examples;

import java.io.File;

public class Directory {
	 public static void main(String args[]) {
	      String dirname = "/tmp/user/java/bin";
	      File d = new File(dirname);
	      
	      // Create directory now.
	      d.mkdirs();
	   }

}
