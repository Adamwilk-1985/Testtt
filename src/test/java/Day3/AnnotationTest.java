package Day3;
import org.testng.annotations.*;

public class AnnotationTest {

    @BeforeClass
    public void executeBeforeClass(){
        System.out.println("To się wykona przed wszystkim");
    }

    @BeforeMethod
    public void executeBeforeMethod(){
        System.out.println("To się wykona przed każdym testem");
    }

    @Test
    public void myFirstTest(){
        System.out.println("To jest mój pierwszy test");
    }

    @Test
    public void mySecondTest(){
        System.out.println("To jest mój drugi test");
    }

    @AfterMethod
    public void executeAfterMethod(){
        System.out.println("To się wykona po każdym teście");
    }

    @AfterClass
    public void executeAfterClass(){
        System.out.println("To się wykona po wszystkim");
    }
}
