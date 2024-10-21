package Management_Exc;

import javax.management.MalformedObjectNameException;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param manager the manager to give the salary
     * @param employee the employee to receive the raise
     * @param salary the salary increase to be given
     * @throws ClassCastException when manager or employee is not a manager or employee
     * @throws IllegalArgumentException when salary is invalid
     * @throws NoSuchElementException when given manager or employee does not exist in the list of persons
     */


    public static void giveRaise(List<Person> persons, String manager, String employee, double salary)  {
        Manager manager1= findManager(persons, manager);
        Employee employee1= findEmployee(persons, employee);
        try{
            manager1.giveRaise(employee1,salary);
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Raise must be non-negative");
        }
    }

    /**
     * TODO this implementation
     * @param persons the list of persons
     * @param developer the developer to be assigned
     * @param manager the manager assigned to the dev
     * @throws ClassCastException when manager or developer is not a manager or employee
     * @throws NoSuchElementException when given manager or developer does not exist in the list of persons
     * @throws IllegalStateException when developer already has a manager
     */
    public static void assignPM(List<Person> persons, String developer, String manager) {
        Developer developer1= findDeveloper(persons, developer);
        Manager manager1= findManager(persons, manager);
        try{
            developer1.setProjectManager(manager1);
        }catch (IllegalStateException e){
            throw new IllegalStateException(e.getMessage());
        }
    }

    /**
     * * TODO this implementation
     * * @param persons the list of persons
     * * @param customer the customer to speak to the employee
     * * @param employee the employee to be spoken to
     * * @return the dialogue of the customer to the employee
     * * @throws ClassCastException when given customer or employee is not what they are
     * * @throws NoSuchElementException when given customer or employee is not in the list of persons
     */
    public static String customerSpeak(List<Person> persons, String customer, String employee) {
        Customer customer1 = findCustomer(persons, customer);
        Employee employee1 = findEmployee(persons, employee);

        return customer1.speak(employee1);
    }


    public static Person findPerson(List<Person> persons, String name){
        for(Person person : persons){
            if(person.getName().equals(name)){
                return person;
            }
        }
        throw new NoSuchElementException(name+ " does not exist");
    }
    public static Manager findManager(List<Person> persons, String name){
        Person person = findPerson(persons, name);
        if(person instanceof Manager){
            return (Manager) person;
        }else{
            throw new ClassCastException(name + " is not a manager");
        }
    }

    public static Developer findDeveloper(List<Person> persons, String name){
        Person person = findPerson(persons, name);
        if(person instanceof Developer){
            return (Developer) person;
        }else{
            throw new ClassCastException(name + " is not a developer");
        }
    }
    public static Employee findEmployee(List<Person> persons, String name){
        Person person = findPerson(persons, name);
        if(person instanceof Employee){
            return (Employee) person;
        }else{
            throw new ClassCastException(name + " is not an employee");
        }
    }
    public static Customer findCustomer(List<Person> persons, String name){
        Person person = findPerson(persons, name);
        if(person instanceof Customer){
            return (Customer) person;
        }else{
            throw new ClassCastException(name + " is not a customer");
        }
    }

}


