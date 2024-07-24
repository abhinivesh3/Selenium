package testNG;

import org.testng.annotations.*;

import javax.swing.plaf.PanelUI;

public class AnnotationsHierachy {

    @Test
    public void test2(){
        System.out.println("Im test2");
    }

    @Test
    public void test(){
        System.out.println("Im test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Im before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("Im after method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Im before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Im after class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Im before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Im after suite");
    }

}
