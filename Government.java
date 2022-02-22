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
public class Government implements Comparable<Government> {

    private String name;

    public Government(String n) {
        this.name = n;
    }

    public String toString() {
        return name;
    }

    
    public int compareTo(Government other) {
        if (name.compareTo(other.name) < 0) {
            return -1;
        } else if (name.compareTo(other.name) > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}

