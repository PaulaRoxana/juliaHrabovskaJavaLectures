package practice.nested.inner_nested_classes;


class Car {
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

    // inner class
    class Engine {
        String engineType;

        void setEngine() {
            // Accessing the carType property of Car
            if (Car.this.carType.equals("4WD")) {
                // Invoking method getCarName() of Car
                if (Car.this.getCarName().equals("Chrysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            } else {
                this.engineType = "Bigger";
            }
        }

        String getEngineType() {
            return this.engineType;
        }
    }
}

public class ForCar {
    public static void main(String[] args) {

// create an object of the outer class Car
        Car car1 = new Car("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Car car2 = new Car("Chrysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    }
}

/* Key Points to Remember
1)Java treats the inner class as a regular member of a class.
They are just like methods and variables declared inside a class.
2)Since inner classes are members of the outer class, you can apply any access
modifiers like private, protected to your inner class which is not possible in normal classes.
3)Since the nested class is a member of its enclosing outer class, you can use the
dot (.) notation to access the nested class and its members.
4)Using the nested class will make your code more readable and provide better encapsulation.
5)Non-static nested classes (inner classes) have access to other members of the outer/enclosing class,
even if they are declared private.*/