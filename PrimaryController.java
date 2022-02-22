package reynolds.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class PrimaryController {
    
    @FXML
    private Label readLbl, zipLbl, tzLbl, numOfZip;
    @FXML
    private ComboBox<State> stateCombo = new ComboBox<State>();
    @FXML
    private ComboBox<City> cityCombo = new ComboBox<City>();
    
    @FXML
    private int count, count2, count3, zipCount = 0;
    
  
    OrderedFOA<State> stateList = new OrderedFOA<State>();

   
    
    @FXML
    private void readHandler() throws FileNotFoundException {
       
        System.out.println("Reading");

        String str;          // a string that will hold the current line of text data
        int count = 0;
        File file = new File("CityData4.csv");  // create a new file reader 
        Scanner fileReader = new Scanner(file); //
        fileReader.nextLine(); // skipping over the first line of data 

        while (fileReader.hasNextLine()) {
            str = fileReader.nextLine(); // holds the first useful line in a string 
            String[] values = str.split(","); // splitting the string into an array to hold the data
            City newCity = new City(Integer.parseInt(values[0]), values[1],
                    Double.parseDouble(values[3]), Double.parseDouble(values[4]),
                    Integer.parseInt(values[5]), Integer.parseInt(values[6])); // creating a new object
            State newState = new State(values[2]);
            System.out.println(newCity);
            System.out.println(newState);
            
            //State stateObject = stateList.findOrAdd(newState);
           // stateObject.getCityList().findOrAdd(newCity);
            
            
            zipCount++;
            count++;
        }
        if ( stateList != null )
            cityRead();
        
        
        Iterator<State> stateIter = stateList.iterator();
        while (stateIter.hasNext())
        {
            //System.out.println(stateIter.next());
            stateCombo.getItems().add(stateIter.next());
            
        }
        
        
        
    }

    @FXML
    public void citySelected() {
        
        zipLbl.setText(Integer.toString(cityCombo.getValue().getZipcode()));
        tzLbl.setText(cityCombo.getValue().getTimezone());

    }

    @FXML
    public void stateSelected() {
        cityCombo.getItems().clear();  
       Iterator<City> cityIter =  stateCombo.getValue().getCityList().iterator();
       while (cityIter.hasNext())
       {
           cityCombo.getItems().add(cityIter.next());
       }
        
        
        
        
            
            

    }

    @FXML
    private void cityRead() {
        readLbl.setText("The cities have ben read!");
    }
    
    @FXML 
    private void zipCount()
    {
        numOfZip.setText(zipCount + "Zip Codes");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
