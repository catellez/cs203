
package greeter;

/**
 A class for producing a simple greeting
 */
public class Greeter {

    /**constructs a greeter object that can greet a person or entity
     * @param aName, the name of the person or entity that should be addressed 
     * in the greeting
     */
    
    public Greeter(String aName){
        name = aName;
    }
    
    /**
     * Greet with a "Hello" message
     * @return a message containing "Hello" and the name of the person or entity
     */
    
    public String sayHello(){
        return "Hello, " + name + "!";
    }
    
    /**
     * sets the name of the person or entity to be greeted
     * @param newName, the name to be set as the person greeted
     */
    public void setName(String newName){
        name = newName;
    }
    
    public String getName(Greeter greeter){
        return this.name;
    }
    
    /**
     * swaps the name of two greeter objects
     * @param other refers to the greeter object whose name is being swapped
     * with the name of the greeter being called on
     */
    public void swapNames(Greeter other){
        String thisName = this.getName(this);
        String otherName = other.getName(other);
        this.setName(otherName);
        other.setName(thisName);
        
    }
    
    private String name;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Greeter first = new Greeter("Name");
        Greeter second = new Greeter("qwerty");
        first.setName("asdf");
        String firstGreeting = first.sayHello();
        System.out.println(firstGreeting);
        String secondGreeting = second.sayHello();
        System.out.println(secondGreeting);
        first.swapNames(second);
        String swappedFirst = first.sayHello();
        System.out.println(swappedFirst);
        String swappedSecond = second.sayHello();
        System.out.println(swappedSecond);
        
    }
    
}
