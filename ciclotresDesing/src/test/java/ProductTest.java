/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import logica.Product;
import logica.TypeProduct;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author FamiliaPC
 */
public class ProductTest {
    
    @Test
   void getIVA(){
       Product jabon = new Product("123","Jabon Rey",2_500.0,2,(byte)5,TypeProduct.VIVERES);
       
       assertEquals(300, jabon.getIVA());
   }
    
}
