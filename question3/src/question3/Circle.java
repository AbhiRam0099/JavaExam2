/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Abhilash Ramavaram
 */

public class Circle {
    private String area;
    private String state;

    /** Constructor for circle
     * 
     * @param region
     * @param state 
     */
    public Circle(String area, String state) {
        this.area = area;
        this.state = state;
    }

    /** getter method for region
     * 
     * @return region
     */
    public String getArea() {
        return area;
    }

    /** setter method for region
     * 
     * @param region 
     */
    public void setArea(String area) {
        this.area = area;
    }

    /** getter method for state
     * 
     * @return state
     */
    public String getState() {
        return state;
    }

    /** setter method for state
     * 
     * @param state 
     */
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return  "Area=" + area + ", state=" + state ;
    }    
}

