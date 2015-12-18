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
public class Manager extends Employee{
    
    
    public Manager(String name, double aBonus)
    {
        super(name);
        bonus = aBonus;
    }
    
    public void setBonus(double bonus)
    {
        bonus = this.bonus;
    }
    
    public double getSalary(Manager m)
    {
        return super.getSalary()+bonus;
    }
    
    public String toString()
    {
    return getClass().getName()
            +"[name="+ super.name
            +", salary=" + super.salary
            +"]";
    }
    
    private double bonus;
}
