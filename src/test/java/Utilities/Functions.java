package Utilities;

import Base.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Functions {
    public static void takescreenshot(String testname) throws IOException {
        File myfile = ((TakesScreenshot) BasePage.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(myfile, new File (System.getProperty("user.dir")+"\\HTMLReport\\"+testname+"_fail.png"));

    }
    public static boolean isElementPresent(By locator){
        try{
            BasePage.driver.findElement(locator).isDisplayed();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public static String getCurrentDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy hh:mm");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = formatter.format(new Date());
        return date;
    }
////    public static boolean isSelectedOption(By locator){
//        try {
//            BasePage.driver.findElement(locator).isSelected();
//            return true;
//        }
//        catch (Exception e) {
//            return false;
//        }
//    }



}
