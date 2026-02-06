import java.util.Scanner;

/**
   This class processes baby name records.
*/
public class RecordReader
{
   private double total; // the current percentage of total names processed
   private double limit; // the percentage at which to stop processing
   private int numNamed; // the total number of named children

   /**
      Constructs a RecordReader with a zero total.
      @param aLimit the percentage at which to stop processing
      @param totalNamed the total number of named children
   */
   public RecordReader(double aLimit, int totalNamed)
   {
      //...
   }

   /**
      Takes a number which may have commas in it and converts it to an int.
      @param numberAsString the string number to convert
      @return the integer value of numberAsString
   */
   public static int convertWithCommas(String numberAsString)
   {
      //...
      
      return 0;
   }

   /**
      Reads an input record, converts the count for the name to an int,
      adds to the total names processed, and prints the name if the 
      current total is less than the limit.
      @param in the input stream
   */
   public void process(Scanner in)
   {
      //...
   }

   /**
      Checks whether there are more inputs to process.
      @return true if the limit has not yet been reached
   */
   public boolean hasMore()
   {
      return this.total < this.limit;
   }
}
