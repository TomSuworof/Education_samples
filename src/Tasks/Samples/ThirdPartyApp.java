package Tasks.Samples;

/*
 * D:\Programs\OpenOffice\program\soffice.exe
 *
 * C:\Program Files\Microsoft\Edge\Application\msedge.exe
 */

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class ThirdPartyApp {
    public static void main(String[] args) throws IOException, AWTException {
        String browserPath = "msedge.exe";
        String ya = "https://ya.ru";
        Runtime.getRuntime().exec("cmd.exe /c start " + browserPath + " " + ya);
        Robot robot = new Robot();
        robot.delay(4000); // cause I can not understand, when press
        robot.keyPress(KeyEvent.VK_F11); // full-screen mode
        robot.keyRelease(KeyEvent.VK_F11);
    }
}
