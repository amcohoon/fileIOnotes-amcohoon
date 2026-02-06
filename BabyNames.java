import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
   This program displays the most common baby names given an input file.
*/
public class BabyNames
{
   // the percentage at which to stop processing names
   public static final int LIMIT = 50;

   /**
      Processes the names that are read from the provided Scanner.
      @param in Scanner from which to read the baby names
   */
   private static void processNames(Scanner in)
   {
      int numBoys = in.nextInt();
      int numGirls = in.nextInt();
      RecordReader boys = new RecordReader(LIMIT, numBoys);
      RecordReader girls = new RecordReader(LIMIT, numGirls);
      
      // process and print records for boys and girls names
      //...
   }

   public static void main(String[] args) throws IOException
   {
      // prompt the user for a file name and call the processNames method
      //    with the Scanner for that file name
      //...
   }
}

