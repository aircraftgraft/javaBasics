package com.syntax.groupProject2;

public class Task5 {
    public static void main(String[] args) {
        RemoteWebDriver[] driver={new ChromeDriver(),new FireFoxDriver(),new Safari()};
        for(RemoteWebDriver d:driver) {
            d.open();
            d.close();
            d.getTitle();
            d.getScreenshot();
            d.navigate();
        }
    }
}

interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenshot {
    void getScreenshot();
}
interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}


class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opens ChromeDriver");
    }
    @Override
    public void close() {
        System.out.println("Closes ChromeDriver");
    }
    @Override
    public String getTitle() {
        return "Get title";
    }
    @Override
    public void navigate() {
        System.out.println("Navigates to Chrome Driver");
    }
    @Override
    public void getScreenshot() {
        System.out.println("Get a screenshot");
    }
}
class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opens FireFoxDriver");
    }

    @Override
    public void close() {
        System.out.println("Closes FireFoxDriver");
    }

    @Override
    public String getTitle() {
        return "Get title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigates to FireFoxDriver");
    }
}
class Safari implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opens Safari");
    }

    @Override
    public void close() {
        System.out.println("Closes Safari");
    }

    @Override
    public String getTitle() {
        return "Get title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Get a screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigates to Safari");
    }
}
