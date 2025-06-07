package Java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// from version 7. Now we don't need to use finally block for close streams. Java
// does it for us when we write links in try parameters
// from version 9. We can write link before try block and write link's names in try parameters
public class TryCatchStreams {
    public static void main(String[] args) {
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(System.in));

        try (bufferedReader1; bufferedReader2; bufferedReader3) {
            bufferedReader1.readLine();
            bufferedReader2.readLine();
            bufferedReader3.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
