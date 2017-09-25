public class Person {
    private String name;
    public Person (String name) {
        this.name = name;
    }
    public Person() {}
    public Person(Person person) {
        this.name = person.name;
    }
    // IN ORDER TO CREATE A NEW OBJECT WITH THE SAME PROPERTIES AND VALUES BUT NOT THE SAME MEMORY LOCATION.
    //MAKES 2 SEPARATE OBJECTS, SINCE WERE PASSING IT A PERSON OBJECT INSTEAD OF A STRING

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ben");
        System.out.println(person.getName());
        person.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
        // WE HAVE 2 VARIABLES POINTING AT THE SAME MEMORY LOCATION!!! ESSENTIALLY MADE A COPY OF THE OBJECT!!
        Person person1 = new Person("John");
        Person person2 = new Person(person1);
        // WERE CREATING A NEW OBJECT BASED OFF THE VALUES OF THE OLD OBJECT, BUT WERE NOT REFRENCING THE SAME OBJECT, INSTEAD WERE CREATING A NEW ONE THAT SHARES THE SAME PROPERTIES
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person1);
        System.out.println(person2);
       // WE HAVE 2 VARIABLES POINTING AT THE SAME MEMORY LOCATION WHEN WE SET THE VARIABLE EQUAL TO THE OTHER ONE INSTEAD OF CREATING A NEW OBJECT!!! NO LONGER THE CASE SINCE WE MADE LINE 27!!
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello there " + this.name);
    }
}
