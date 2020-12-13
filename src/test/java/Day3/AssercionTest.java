package Day3;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AssercionTest {

    @Test
    public void thisCanPass() throws FileNotFoundException {

        Assert.assertEquals(1,1);
        String expectedText = "asd";
        Assert.assertEquals("asd",expectedText);
        Assert.assertTrue(true);

//        String content = new Scanner(new File("src/main/resources/secret2.txt")).useDelimiter("\\Z").next();
//        System.out.println(content);

    }



}
