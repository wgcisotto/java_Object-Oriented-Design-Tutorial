1. Abstraction

- Intent

Abstraction means hiding lower-level details and exposing only the essential and relevant details to the users.

- Real-World Example

A car abstracts the internal details and exposes the driver to only details that are relevant to the interaction of the driver with the car.
For example, when we have a phone call, we don't know the internal processing. In Java, we use the abstract class and interface to achieve abstraction.
We never buy a "device," but we always buy something more specific: iPhone, GSII, Nokia 3310, etc. Here, the iPhone, GSII, and N3310 are concrete things; the device is abstract.

- Implementation
In Java, abstraction is achieved by Interfaces and Abstract classes. We can achieve 100% abstraction using Interfaces.
Abstraction hiding internal details and showing functionality is known as abstraction.

Let's understand Abstraction with few examples.

Example 1: Employee, Contractor, and FullTimeEmployee Example

In this example, we create abstract Employee class and which contains abstract calculateSalary()method. Let the subclasses extend Employee class and implement calculateSalary() method.
Let's create Contractor and FullTimeEmployee classes as we know that the salary structure for contractor and full-time employees are different so let these classes to override and implement calculateSalary() method.

Step 1: Let's first create the superclass Employee. Note the usage of abstract keyword in the class definition. This marks the class to be abstract, which means it can not be instantiated directly. We define a method called calculateSalary() as an abstract method. This way you leave the implementation of this method to the inheritors of the Employee class.

Step 2: The Contractor class inherits all properties from its parent Employee but have to provide its own implementation to calculateSalary() method. In this case, we multiply the value of payment per hour with given working hours.

Step 3: The FullTimeEmployee also has its own implementation of calculateSalary() method. In this case, we just multiply by a constant 8 hours.

Example 2: Drawing Shapes Example

Consider the second example Shapes base type is “shape” and each shape has a color, size and so on. From this, specific types of shapes are derived(inherited)-circle, square, triangle and so on.
The area for these shapes are different so make the area() method abstract and let the subclasses to override and implement.

 Key Points about Abstract classes and Abstract methods

    An abstract class is a class that is declared with abstract keyword.
    An abstract method is a method that is declared without an implementation.
    An abstract class may or may not have all abstract methods. Some of them can be concrete methods
    A method defined abstract must always be redefined in the subclass, thus making overriding compulsory OR either make subclass itself abstract.
    Any class that contains one or more abstract methods must also be declared with abstract keyword.
    There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
    An abstract class can have parameterized constructors and default constructor is always present in an abstract class.


references:
http://www.javaguides.net/2018/08/abstraction-in-java-with-example.html
