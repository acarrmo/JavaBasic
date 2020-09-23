import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int num=9999;
        
        if (num > 0 && num <= 9999)
        {
        if (num < 10)
        {
            System.out.println("El número tiene un dígito");
        }
        
        if (num >= 10 && num < 99)
        {
            System.out.println("El número tiene dos dígitos");
        }
        
        if (num >= 100 && num < 999)
        {
            System.out.println("El número tiene tres dígitos");
        }
        
        if (num >= 1000 && num <= 9999)
        {
            System.out.println("El número tiene cuatro dígitos");
        }
        
        }
        
        else
        {
            System.out.println("Introduce un valor positivo entre 1 y 9999");
        }
    }
}
