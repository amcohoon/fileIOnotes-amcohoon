import java.net.URL;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
public class WebPage
{
    public static void main(String[] args) throws IOException
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the web page URL: ");
        String urlString = console.nextLine();
        System.out.print("Enter the output file name: ");
        String fileName = console.nextLine();
        URL webPage = new URL(urlString);
        Scanner webInput = new Scanner(webPage.openStream());
        PrintWriter output = new PrintWriter(fileName);
        while (webInput.hasNextLine())
        {
            String line = webInput.nextLine();
            output.println(line);
        }
        System.out.println("Web page written to " + fileName);
    }
}