class Parent {
    String parentProperty;

    Parent() {
        this.parentProperty = "I am from the parent class";
    }

    void parentMethod() {
        System.out.println("This is a method from the parent class");
    }
}

class Child extends Parent {
    String childProperty;

    Child() {
        super();  // Calling the constructor of the parent class
        this.childProperty = "I am from the child class";
    }

    void childMethod() {
        super.parentMethod();  // Calling the method of the parent class
        System.out.println("This is a method from the child class");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Child childObject = new Child();
        System.out.println(childObject.parentProperty);  // Accessing parent class property
        childObject.childMethod();  // Calling method from the child class
    }
}
