package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

    String name ="Agni";
    boolean value = true;

    @Test
    public void checkEqual(){
//        if(name.equals("Agni")){
//            System.out.println("Name is equal");
//        }
//        else{
//            System.out.println("Name is NOT equal");
//        }
        Assert.assertEquals(name,"Agni");
        Assert.assertNotEquals(name,"Agni ");
        Assert.assertTrue(value,"This should not be true");
    }
}
