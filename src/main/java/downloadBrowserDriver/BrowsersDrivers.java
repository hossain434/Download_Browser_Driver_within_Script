package downloadBrowserDriver;

import org.arquillian.spacelift.Spacelift;
import org.arquillian.spacelift.task.archive.UnzipTool;
import org.arquillian.spacelift.task.net.DownloadTool;

public class BrowsersDrivers {

    private final static String CHROMEDRIVER_URL = "https://chromedriver.storage.googleapis.com/2.29/chromedriver_win32.zip";

    public static void setupChrome() {

        Spacelift.task(DownloadTool.class)
            .from(CHROMEDRIVER_URL)
            .to(System.getProperty("user.dir") + "/chrome.zip")
            .then(UnzipTool.class)
            .toDir(System.getProperty("user.dir") + "/chrome/")
            .execute()
            .await();

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chrome/chromedriver.exe");

    }
}