package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = "Apple")
    public void Apple(){
        System.out.println("Apple testing");
    }

    @Test(groups = "Apple")
    public void Apple1(){
        System.out.println("Apple testing");
    }

    @Test(groups = "Moto")
    public void Moto(){
        System.out.println("Moto testing");
    }

    @Test(groups = "Moto")
    public void Moto1(){
        System.out.println("MOTO testing");
    }

    @Test(groups = "Vivo")
    public void Vivo(){
        System.out.println("Vivo testing");
    }

    @Test(groups = "Vivo1")
    public void Vivo1(){
        System.out.println("Vivo testing");
    }

    @Test(groups = "Lenovo")
    public void Lenovo(){
        System.out.println("Lenovo testing");
    }

    @Test(groups = "Lenovo")
    public void Lenovo1(){
        System.out.println("Lenovo testing");
    }
}
