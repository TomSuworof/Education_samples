package Tasks.Samples;

/*
 * D:\Programs\OpenOffice\program\soffice.exe
 *
 * C:\Program Files\Microsoft\Edge\Application\msedge.exe
 */

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThirdPartyApp {
    public static void main(String[] args) throws AWTException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Type your command: ");
            String request = reader.readLine();
            switch (request) {
                case "yandex":
                    openYandexFullScreen();
                    break;
                case "powershell":
                    openGitAndPush(false);
                    break;
                case "git":
                    openGitAndPush(true);
                    break;
                default:
                    System.out.println("I do not know this operation");
                    break;
            }
        } catch (IOException ioe) {
            System.err.println("Something went wrong");
        }
    }

    static void openYandexFullScreen() throws IOException, AWTException {
        String browserPath = "msedge.exe";
        String ya = "https://ya.ru";
        Runtime.getRuntime().exec("cmd.exe /c start " + browserPath + " " + ya);
        Robot robot = new Robot();
        robot.delay(4000); // cause I can not understand, when press
        robot.keyPress(KeyEvent.VK_F11); // full-screen mode
        robot.keyRelease(KeyEvent.VK_F11);
    }

    static void openGitAndPush(boolean git) throws IOException {
        String mode = "";
        if (git) {
            mode = "git push origin master";
        }
        // cmd does not want to change directory. so I suppose, powerShell will be better
        Runtime.getRuntime().exec("cmd.exe /c start powershell.exe " + mode);
        // current directory was already typed
        // type -> git push origin master (if we want)
        // profit

    }
}
