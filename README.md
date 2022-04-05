# Vehicle Management System with Inheritance in Java

This repository contains a Java project that demonstrates the concept of inheritance through a vehicle management system. The project includes classes for defining different types of vehicles, handling user input, and performing operations such as displaying and manipulating vehicle data.

## Features

- **Inheritance**: Demonstrates the concept of inheritance by extending a base class `TVehiculo` to derived classes `TAuto` and `TCamion`.
- **Vehicle Attributes**: Defines attributes for vehicles, including common attributes in the base class and specific attributes in derived classes.
- **User Interaction**: Handles user input to create and manage different types of vehicles.
- **Data Display**: Outputs the details of the vehicles managed by the system.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes methods for managing vehicle data.

```java
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TVehiculo> vehicles = new ArrayList<>();

        // Input for Car
        System.out.print("Enter car make: ");
        String carMake = scanner.nextLine();
        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter car year: ");
        int carYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter car type: ");
        String carType = scanner.nextLine();
        TAuto car = new TAuto(carMake, carModel, carYear, carType);
        vehicles.add(car);

        // Input for Truck
        System.out.print("Enter truck make: ");
        String truckMake = scanner.nextLine();
        System.out.print("Enter truck model: ");
        String truckModel = scanner.nextLine();
        System.out.print("Enter truck year: ");
        int truckYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter truck capacity: ");
        double truckCapacity = scanner.nextDouble();
        TCamion truck = new TCamion(truckMake, truckModel, truckYear, truckCapacity);
        vehicles.add(truck);

        // Display data
        System.out.println("List of vehicles:");
        for (TVehiculo vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
```

#### Vehicle Base Class

The `TVehiculo` class represents a generic vehicle with common attributes such as make, model, and year.

```java
 public class TVehiculo {
    private String make;
    private String model;
    private int year;

    public TVehiculo(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}
```

#### Car Class

The `TAuto` class extends `TVehiculo` and adds attributes specific to a car, such as type.

```java
public class TAuto extends TVehiculo {
    private String type;

    public TAuto(String make, String model, int year, String type) {
        super(make, model, year);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}
```

#### Truck Class

The `TCamion` class extends `TVehiculo` and adds attributes specific to a truck, such as capacity.

```java
public class TCamion extends TVehiculo {
    private double capacity;

    public TCamion(String make, String model, int year, double capacity) {
        super(make, model, year);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacity: " + capacity + " tons";
    }
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Principal`) to start the program.
3.  Follow the prompts to enter the details of cars and trucks.
4.  The program will display the list of vehicles with their details.

### Classes and Methods

-   `Principal`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `TVehiculo`: A base class representing a generic vehicle with attributes and methods for displaying details.
    -   `TVehiculo(String make, String model, int year)`: Constructor that initializes the vehicle's attributes.
    -   `toString()`: Method that returns the string representation of the vehicle's details.
-   `TAuto`: A derived class representing a car, extending `TVehiculo` and adding additional attributes.
    -   `TAuto(String make, String model, int year, String type)`: Constructor that initializes the car's attributes.
    -   `toString()`: Method that returns the string representation of the car's details, including inherited attributes.
-   `TCamion`: A derived class representing a truck, extending `TVehiculo` and adding additional attributes.
    -   `TCamion(String make, String model, int year, double capacity)`: Constructor that initializes the truck's attributes.
    -   `toString()`: Method that returns the string representation of the truck's details, including inherited attributes.