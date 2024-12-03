package siteDownloader;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.net.*;
import java.sql.*;

import static java.nio.file.Files.createDirectory;

public class UrlDownloader {

    //method to implement the evaluation of the validation of the url:
    public static String urlValidate(String sampleUrl) {

        String realUrl = "^(https?://)((([a-zA-Z0-9_-]+\\.)+[a-zA-Z]{2,})|localhost|([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]" +
                "{1,3}\\.[0-9]{1,3}))(:[0-9]{1,5})?(/[^\\s]*)?$";
        return "The provided url address is valid?: " + Pattern.matches(realUrl, sampleUrl);
    }

    //method to extract (get) the domain portion from the entire url and creation of the site container using the domain
    // name
    public static String toGetDom(String sampleUrl) throws MalformedURLException {
        URL myUrl = new URL(sampleUrl);
        String urlHost = myUrl.getHost();
        return urlHost;
    }
    public static String homepg(String sampleUrl, File siteFolder){
        return "Hello";
    }

    public static void main(String[] args) {
        Scanner myScanObj = new Scanner(System.in);
        String sampleUrl;
        System.out.println("Please enter the url: \n");
        sampleUrl = myScanObj.next();
        try {
            String domain = toGetDom(sampleUrl);
            System.out.println("Domain of my url: " + domain);
        } catch (MalformedURLException m) {
            System.out.println("Fake url structure" + m.getMessage());
        }
    }
}
