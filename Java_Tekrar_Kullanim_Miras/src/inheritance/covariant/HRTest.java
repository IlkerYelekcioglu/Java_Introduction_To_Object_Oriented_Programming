package inheritance.covariant;

import factories.factory3.Employee;
import factories.factory3.Manager;
public class HRTest {
    public static void main(String[] args) {
        HR hr = new HR();
        Employee employee1 = hr.getAnEmployee();

        HRForManagers hrForManagers = new HRForManagers();
        Employee employee2 = hrForManagers.getAnEmployee();
        employee2.work();

        Manager manager = hrForManagers.getAnEmployee();
        manager.manage();

    }
}
