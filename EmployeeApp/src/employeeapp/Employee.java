/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.util.Comparator;

/**
 *
 * @author catellez
 */
public class Employee {
  
    
    public Employee(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setSalary(double s)
    {
        salary = s;
    }
    
    public String toString()
    {
    return getClass().getName()
            +"[name="+ name
            +", salary=" + salary
            +"]";
    }
      
    public static Comparator<Employee> createComparatorByName(final boolean increasing){
       return new
           Comparator<Employee>(){
               public int compare(Employee e, Employee m){
                   if (increasing){
                       
                   return e.getName().compareTo(m.getName());
                   }
                   else{
                       return e.getName().compareTo(m.getName());
                   }
               }

           
           
           };
   }
     String name;
     double salary;
     
}
