# Understanding CDI (Constructor Dependency Injection) and SDI (Setter Dependency Injection) in Spring

## Overview

In this example, we explore the concepts of Constructor Dependency Injection (CDI) and Setter Dependency Injection (SDI) in the context of a Spring application. We have three classes: `Vehicle`, `ToyotaEngine`, `Tyres`, and an interface `Engine`. The goal is to showcase how CDI and SDI work in the context of a Spring bean configuration.

## Classes and Interface

### 1. Vehicle

The `Vehicle` class represents a generic vehicle and has a dependency on the `Engine` interface, signifying the need for a standardized engine that adheres to Indian emission norms.

```java
public class Vehicle {
    private Engine engine;
    private Tyres tyres;

    // Constructor Injection
    public Vehicle(Engine engine, Tyres tyres) {
        this.engine = engine;
        this.tyres = tyres;
    }

    // Setter Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    // Other methods and properties...
}
```

### 2. ToyotaEngine

The `ToyotaEngine` class implements the `Engine` interface, providing a concrete implementation of an engine that complies with Indian emission norms.

```java
public class ToyotaEngine implements Engine {
    // Implementation of Engine interface
}
```

### 3. Tyres

The `Tyres` class represents the vehicle's tires and has properties like `name`, `place`, and `message`.

```java
public class Tyres {
    private String name;
    private String place;
    private String message;

    // Constructors, getters, and setters...
}
```

### 4. Engine (Interface)

The `Engine` interface defines the contract for an engine that the `Vehicle` class depends on.

```java
public interface Engine {
    // Interface methods...
}
```

## Bean Configuration (springContext.xml)

In the bean configuration file (`springContext.xml`), we define the beans and their dependencies.

```xml
<bean id="ToyotaBean" class="com.example.ToyotaEngine" />

<bean id="tyre1Bean" class="com.example.Tyres">
    <property name="name" value="MRF" />
    <property name="place" value="India" />
    <property name="message" value="Make in India" />
</bean>

<bean id="tyre2Bean" class="com.example.Tyres">
    <property name="name" value="TVS" />
    <property name="place" value="India" />
    <property name="message" value="Make in India" />
</bean>

<bean id="InjectwithConstructor" class="com.example.Vehicle">
    <constructor-arg name="engine" ref="ToyotaBean" />
    <constructor-arg name="tyres" ref="tyre1Bean" />
</bean>

<bean id="InjectwithSetter" class="com.example.Vehicle">
    <property name="engine" ref="ToyotaBean" />
    <property name="tyres" ref="tyre2Bean" />
</bean>
```

## Explanation

### Constructor Dependency Injection (CDI)

- `InjectwithConstructor` bean uses constructor injection.
- The `constructor-arg` element is used to specify constructor arguments.
- The `name` attribute correlates with the constructor argument name in the `Vehicle` class.
- The `ref` attribute points to the bean reference used for injection.

### Setter Dependency Injection (SDI)

- `InjectwithSetter` bean uses setter injection.
- The `property` element is used to set properties.
- The `name` attribute represents the property name in the `Vehicle` class.
- The `ref` attribute points to the bean reference used for injection.

### Tyres Bean Configuration

- Two separate beans (`tyre1Bean` and `tyre2Bean`) for the `Tyres` class showcase both setter and constructor injection.
- Literal values are provided for the properties in `tyre1Bean`.

## Conclusion

This example demonstrates how to configure Spring beans using CDI and SDI. It emphasizes the use of interfaces (`Engine`) and concrete implementations (`ToyotaEngine`) for achieving flexibility and adherence to standards. The XML configuration file (`springContext.xml`) serves as a central place for defining dependencies and injecting them into the `Vehicle` class. This design promotes modularity and testability in the Spring application.
