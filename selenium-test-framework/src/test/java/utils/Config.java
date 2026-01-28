package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties properties;
    private static final String CONFIG_FILE = "src/test/resources/config.properties";

    static {
        loadProperties();
    }

    private static void loadProperties() {
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream(CONFIG_FILE);
            properties.load(file);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config file: " + CONFIG_FILE, e);
        }
    }

    public static String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public static String getBrowser() {
        return System.getProperty("browser", properties.getProperty("browser"));
    }

    public static boolean isHeadless() {
        String headless = System.getProperty("headless", properties.getProperty("headless"));
        return Boolean.parseBoolean(headless);
    }

    public static int getTimeoutSeconds() {
        return Integer.parseInt(properties.getProperty("timeoutSeconds"));
    }

    public static String getScreenshotPath() {
        return properties.getProperty("screenshotPath");
    }
}
