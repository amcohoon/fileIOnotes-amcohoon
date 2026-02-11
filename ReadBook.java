import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadBook
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = inputScanner.nextLine();
        File file = new File(fileName);
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine())
        {
            String currentLine = fileScanner.nextLine();
            lineCount++;
            charCount += currentLine.length();
            if (!(currentLine.trim().isEmpty())) 
            {
                String[] words = currentLine.trim().split("\\s+");
                wordCount += words.length;
            }
        }
        System.out.println("Number of Lines: "+lineCount);
        System.out.println("Number of Words: "+wordCount);
        System.out.println("Number of Characters: "+charCount);
    }
}