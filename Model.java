/*
 * Step 1. Filtering Non-Numbers.
 * Step 2. conver values to String.
 * Step 3. merge String.
 * Step 4. Insert into JLabel(jl2).
 */
package com.mycompany.isprime;

/**
 *
 * @author oliver
 */
public class Model
{        
    StringBuilder sbf = new StringBuilder();    
    int inputvalue = 0;
    String result = null;
    
    public String execution(String a)
    { 
        if (a.matches("[1-9]+"))//Regular expression
        {
            inputvalue = Integer.parseInt(a);
            for (int j = 2; j < 10; j++) 
            {
                if ((inputvalue % j) != 0) 
                {
                     result = sbf.append(j + ", ").toString(); 
                }
            }           
        } 
        return result;
    }
}
