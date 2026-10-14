

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class RestaurantTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RestaurantTest
{
    // Restaurant PipiPizza 
    // sitzplaetze = 0
    // Error
    // Default sitzplaetze = 1
    @Test
    public void sitzplaetze_test_toolow()
    {
        Restaurant italian;
        
        italian = new Restaurant("PipiPizza", 0, false);
        // Error
        italian.printRestaurant();
        assertEquals(1, italian.getSitzplaetze());
        
    }

    // Restaurant KeKü 
    // sitzplaetze = 10
    // OK
    @Test
    public void sitzplaetze_test_ok()
    {
        Restaurant kekue;
        
        kekue = new Restaurant("KeKue3000", 10, false);
    
        kekue.printRestaurant();
        assertEquals(10, kekue.getSitzplaetze());
        
    }
    
    // Restaurant Asia 
    // sitzplaetze = 9999
    // Error
    // Default sitzplaetze = 1
    @Test
    public void sitzplaetze_test_toohigh()
    {
        Restaurant asia;
        
        asia = new Restaurant("Asia9999", 9999, false);
    
        asia.printRestaurant();
        assertEquals(1, asia.getSitzplaetze());
        
    }
    
    //Restaurant vegetarisch
    //vegetarisch = true
    //vegetarisch = false
    //manual print test
    @Test
    public void vegetarisch_print_true()
    {
        Restaurant mikue;
        Restaurant kakue;
        
        mikue = new Restaurant("MiKue", 100, true);
        kakue = new Restaurant("KaKue", 100, false);
        mikue.printRestaurant();
        //Restaurant: MiKue - 100 Sitzplätze - vegetarisch
        kakue.printRestaurant();
        //Restaurant: KaKue - 100 Sitzplätze - nicht vegetarisch
    }
}