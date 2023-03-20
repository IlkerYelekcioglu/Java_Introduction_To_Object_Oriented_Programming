package inheritance.covariant;

import factories.factory3.Employee;
import  factories.factory3.Manager;
public class HRForManagers extends HR{
    public Manager getAnEmployee(){

        return new Manager(2, "Ayse", 3, "Production", "Production");
    }
}
