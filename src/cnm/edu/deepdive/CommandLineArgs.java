package cnm.edu.deepdive;

import java.util.Arrays;

public class CommandLineArgs {

  public static void main(String[] args) {
    for (String arg : args) {
      System.out.println(arg);
    }

    System.out.println(Arrays.toString(args));

  }

}
