import java.io.IOException;

public class Demo
{
    public static void main(String[] args) throws IOException
    {
        Process process = Runtime.getRuntime().exec("notepad.exe"); // opens Notepad
    }
}