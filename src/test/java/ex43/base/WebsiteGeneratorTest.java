package ex43.base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteGeneratorTest {

    @AfterAll
    public static void tearDown() throws Exception {
        File file = new File("src/test/java/ex43/base/Hello/index.html");
        if(file.exists()){
            file.delete();
        }

        File folderJS = new File("src/test/java/ex43/base/Hello/js");
        if(folderJS.exists()){
            folderJS.delete();
        }

        File folderCSS = new File("src/test/java/ex43/base/Hello/css");
        if(folderCSS.exists()){
            folderCSS.delete();
        }

        File folder = new File("src/test/java/ex43/base/Hello");
        if(folder.exists()){
            folder.delete();
        }
    }

    @Test
    void makeWebsiteFolder() {
        WebsiteGenerator website = new WebsiteGenerator();
        assertTrue(website.makeWebsiteFolder("Hello", "src/test/java/ex43/base/"));
    }

    @Test
    void makeHTMLFile() throws IOException {
        WebsiteGenerator website = new WebsiteGenerator();
        assertTrue(website.makeHTMLFile("Hello", "src/test/java/ex43/base/", "Bao"));
    }

    @Test
    void makeJSFolder() {
        WebsiteGenerator website = new WebsiteGenerator();
        assertTrue(website.makeJSFolder("Hello", "src/test/java/ex43/base/"));
    }

    @Test
    void makeCSSFolder() {
        WebsiteGenerator website = new WebsiteGenerator();
        assertTrue(website.makeCSSFolder("Hello", "src/test/java/ex43/base/"));
    }

}