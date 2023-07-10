package OOP;

public class Modifiers {
    public static void main(String[] args) {
        //! FOR CLASSES (Access Modifiers)
        //* PUBLIC -- accessible by any other class
        //* DEFAULT -- only accessible by classes in the same package

        //! FOR ATTRIBUTES, METHODS AND CONSTRUCTORS (Access Modifiers)
        //* PUBLIC -- accessible by any other class
        //* PRIVATE -- code is only accessible within the declared class
        //* DEFAULT -- code is only accessible in the same package
        //* PROTECTED -- code is accessible in the same package and subclasses

        //! FOR CLASSES (Non-Access Modifiers)
        //* FINAL -- class cannot be inherited by other classes
        //* ABSTRACT -- class cannot be inherited by other classes

        //! FOR ATTRIBUTES AND METHODS (Non-Access Modifiers)
        //* FINAL -- attributes and methods cannot be overridden/modified
        //* STATIC -- attributes and methods belongs to the class, rather than an object
        //* ABSTRACT -- class cannot be inherited by other classes
        //* TRANSIENT -- attributes and methods are skipped when serializing the object containing them
        //* SYNCHRONIZED -- methods can only be accessed by one thread at a time
        //* VOLATILE -- value of an attribute is not cached thread-locally, and is always read from the "main memory"


    }
}
