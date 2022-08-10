package demo.test;

import static org.junit.Assert.*;  
 
import org.junit.Test;

import demo.logic.Calculation;  
  
public class TestLogic {  
  
    @Test  
    public void testFindMax(){  
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.findMax(new int[]{-1,-2,-3,-4}));  
    }  
}  