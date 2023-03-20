package inheritance.access.protect;

import inheritance.access.protect.aPackage.Parent2;

public class Child extends Parent2 {
    public void printInfo() {
        System.out.println("Child Info");
        System.out.println("x: " + x);
//		System.out.println("y: " + y);
        System.out.println("t: " + t);
//		System.out.println("z: " + z);

        f();
//		g();
        u();
//		v();
    }

    public void printParentClassInfo1(Parent1 pc) {
        System.out.println("pc.x: " + pc.x);
        System.out.println("pc.y: " + pc.y);
        System.out.println("pc.t: " + pc.t);
//		System.out.println("pc.z: " + pc.z);

        System.out.println("Parent1.sx: " + Parent1.sx);
        System.out.println("Parent1.sy: " + Parent1.sy);
        System.out.println("Parent1.st: " + Parent1.st);
//		System.out.println("Parent1.sz: " + Parent1.sz);

        pc.f();
        pc.g();
        pc.u();
//		pc.v();

        Parent1.sf();
        Parent1.sg();
        Parent1.su();
//		Parent1.sv();
    }

    public void printParentClassInfo2(Parent2 pc) {
        System.out.println("pc.x: " + pc.x);
        /*
		System.out.println("pc.y: " + pc.y);
		System.out.println("pc.z: " + pc1z);
*/
        System.out.println("Parent2.sx: " + Parent2.sx);
        /*
		System.out.println("Parent2.sy: " + Parent2.sy);
		System.out.println("Parent2.st: " + Parent2.st);
		System.out.println("Parent2.sz: " + Parent2.sz);
         */
        pc.f();
        /*
		pc.g();
		pc.u();
		pc.v();
        */
        Parent2.sf();
        /*
		Parent2.sg();
		Parent2.su();
		Parent2.sv();

         */
    }
}
