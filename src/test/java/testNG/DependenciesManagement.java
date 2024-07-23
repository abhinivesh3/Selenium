package testNG;

import org.testng.annotations.Test;

import java.util.PrimitiveIterator;

public class DependenciesManagement {

    @Test(enabled = true)
    public void highSchool(){
        System.out.println("High School");
    }

    @Test(dependsOnMethods = "highSchool",enabled = false)
    public void higherSecondary(){
        System.out.println("Higher Secondary School");
    }

    @Test(dependsOnMethods = "higherSecondary")
    public void engineering(){
        System.out.println("College");
    }
}
