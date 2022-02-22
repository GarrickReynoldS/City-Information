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
public class City extends Government {
    
    private int zipcode, timezone;
    private double latitude, longitude;
    private int yesDaylight;

    
    public City(int zipcode, String cityName, double latitude, 
            double longitude, int timezone, int yesDaylight) {
        
        super(cityName);
        this.zipcode = zipcode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timezone = timezone;
        this.yesDaylight = yesDaylight;
    }

    /**
     * @return the zipCode
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     * @return the timezone
     */
     public String getTimezone() {

        if (timezone == -4 && yesDaylight > 0) {
            return "ADT";
        } else if (timezone == -4) {
            return "AST";
        } else if (timezone == -5 && yesDaylight > 0) {
            return "EDT";
        } else if (timezone == -5) {
            return "EST";
        } else if (timezone == -6 && yesDaylight > 0) {
            return "CDT";
        } else if (timezone == -6) {
            return "CST";
        } else if (timezone == -7 && yesDaylight > 0) {
            return "MDT";
        } else if (timezone == -7) {
            return "MST";
        } else if (timezone == -8 && yesDaylight > 0) {
            return "PDT";
        } else if (timezone == -8) {
            return "PST";
        } else if (timezone == -9 && yesDaylight > 0) {
            return "AKDT";
        } else if (timezone == -9) {
            return "AKST";
        } else if (timezone == -10) {
            return "HDT";
        } else {
            return "HST";
        }

    }

    
    
    
}
