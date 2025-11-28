/*
Annotations are metadata.
They do not change how your code runs, but they provide information to:
    Compiler
    JVM
    Tools (Spring, Hibernate, JUnit, Lombok, etc.)
 */

import java.util.ArrayList;
import java.util.List;

class base{
    void type(){
        System.out.println("Not Available");
    }
}
class body extends base{
//  Here, @Override tells the compiler:“This method must override a parent method.”
    @Override
    void type(){
        System.out.println("Concrete Base");
    }

    @Deprecated // Marks a method/class as outdated.
    void material(){
        System.out.println("Concrete");
    }

    @SuppressWarnings("unchecked")
    void test() {
        List list = new ArrayList(); // Normally gives warning
    }
}

//Types of Annotations in Java
/*
Java provides three main types:
    A. Marker Annotations
        Annotations with no elements.
        Examples:
            @Override
            @Deprecated
            @SuppressWarnings

    B. Single-Value Annotations
        Contain only one element.

    C. Multi-Value (Full) Annotations
        Contain multiple elements.
 */
public class O71_Annotation {
    public static void main(String[] args) {
        body b = new body();
        b.material();
    }

}


/*
4. Meta-Annotations (VERY IMPORTANT)

Meta-annotations define how annotations behave.

✔ 1) @Retention

Defines when the annotation is available.

@Retention(RetentionPolicy.RUNTIME)


Types:

SOURCE → available only in source code

CLASS → in .class file (default)

RUNTIME → available via reflection (used by Spring, Hibernate)

✔ 2) @Target

Defines where annotation can be used.

@Target(ElementType.METHOD)


Targets include:

METHOD

FIELD

CONSTRUCTOR

PARAMETER

TYPE (class/interface)

✔ 3) @Inherited

Subclasses inherit annotations.

@Inherited
@interface MyAnno {}

@MyAnno
class A {}

class B extends A {}  // B also has MyAnno

✔ 4) @Documented

Indicates annotation should appear in Javadoc.
 */