package packaging.packageB;

import Java_Siniflarin_Organizasyonu.packaging.packageX.*;
import Java_Siniflarin_Organizasyonu.packaging.packageX.ClassX;
import Java_Siniflarin_Organizasyonu.packaging.packageX.ClassZ;
public class ClassB {
    ClassX x;
    ClassZ z;

    public ClassB(ClassX x) {
        this.x = x;
    }

    public ClassB(ClassX x, ClassZ z) {
        super();
        this.x = x;
        this.z = z;
    }
}

class ClassC {
    ClassX x;
    ClassZ z;
}

class ClassD {
    ClassX x;
    ClassZ z;
}

