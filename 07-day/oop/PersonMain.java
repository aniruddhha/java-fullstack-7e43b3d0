class Person {
    String name;
    int age;

    // default 
    Person() {
       name = "abc";
       age = 10; 
    }

    //parameters
    Person(String nm, int ag) {
        name = nm;
        age = ag;
    }

    void determineDob() {
        
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person(); // Person() looks like method, but where is that ?
        p.determineDob();
    }
}
