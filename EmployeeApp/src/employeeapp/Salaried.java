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
public class Salaried extends Employee{
    
    Employee e;
    double overTimeHours;
    double overTimeRate;
    
    public Salaried(String name, double overTimeHours, double overTimeRate)
    {
        super(name);
        this.overTimeHours = overTimeHours;
        this.overTimeRate = overTimeRate;
    }
    
    public void setOverTimeHours(int hours)
    {
        overTimeHours = hours;
    }
    
    public void setOverTimeRate(int rate)
    {
        overTimeRate = rate;
    }
    
    public double getSalary(Salaried s)
    {
        return super.getSalary()+(s.overTimeHours*s.overTimeRate);
    }
           
    public String toString()
    {
    return getClass().getName()
            +"[name="+ super.name
            +", salary=" + super.salary
            +"]";
    }
    
}
