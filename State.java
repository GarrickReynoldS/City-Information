/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reynolds.lab4;

/**
 *
 * @author garri
 */
public class State extends Government {

    
    
  private OrderedFOA<City> cityList;
  
   
    
        
    public State(String name)
    {
         super(name);
         cityList = new OrderedFOA<>();
    }

    /**
     * @return the cityList
     */
    public  OrderedFOA<City> getCityList() {
        return cityList;
    }
    
    
    
}
