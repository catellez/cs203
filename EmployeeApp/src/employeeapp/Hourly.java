/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

/**
 *
 * @author catellez
 */
public class Hourly extends Employee{
   
    int hours;
    int hourlyRate;
    
    public Hourly(String name, int hours, int hourlyRate)
    {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
    
    public void setHours(int hours)
    {
        this.hours = hours;
    }
    
    public void setHourlyRate(int rate)
    {
        hourlyRate = rate;
    }
    
    public int getSalary(Hourly h)
    {
        return h.hourlyRate*h.hours;
    }
    
    public String toString()
    {
    return getClass().getName()
            +"[name="+ super.name
            +", salary=" + super.salary
            +"]";
    }
}
