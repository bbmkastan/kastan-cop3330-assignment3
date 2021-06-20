package ex43.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Bao Kastan
 */

import java.io.IOException;
import java.util.Scanner;

public class App {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        App app = new App();
        // makeWebsiteGenerator instance
        WebsiteGenerator website = new WebsiteGenerator();
        // get user Input
        String siteName = app.getString("Site name: ");
        String authorName = app.getString("Author name: ");
        String js = app.getString("Do you want a folder for JavaScript? ");
        String css = app.getString("Do you want a folder for CSS? ");

        app.generateWebsite(website, siteName, authorName, js, css);
    }

    private void generateWebsite(WebsiteGenerator website, String siteName, String authorName, String js, String css) throws IOException {
        if (website.makeWebsiteFolder(siteName, "src/main/java/ex43/base/")) {
            // outPut made website folder
            System.out.println("Created ./website/" + siteName);
        }
        // make HTML file
        if (website.makeHTMLFile(siteName,"src/main/java/ex43/base/", authorName)) {
            // outPut made website folder
            System.out.println("Created ./website/" + siteName + "/index.html");
        }
        // outPut made HTML folder
        // if yes make JS folder
        if (js.equals("y") || js.equals("Y")) {
            if (website.makeJSFolder(siteName, "src/main/java/ex43/base/")) {
                // outPut made website folder
                System.out.println("Created ./website/" + siteName + "/js/");
            }
        }
        // outPut made JS folder
        // if yes make CSS folder
        if (css.equals("y") || css.equals("Y")) {
            if (website.makeCSSFolder(siteName, "src/main/java/ex43/base/")) {
                // outPut made website folder
                System.out.println("Created ./website/" + siteName + "/css/");
            }
        }
    }


    private String getString(String s) {
        System.out.println(s);
        return in.nextLine();
    }
}
