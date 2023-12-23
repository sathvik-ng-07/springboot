package com.vehicle.vehicle.vehicleparts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {

    Engine engine;
    Tyres tyre;

    public Tyres getTyre()
    {
        return tyre;
    }

    public void setTyre(Tyres tyre)
    {
        System.out.println("tyre instantiated via setter");
        this.tyre = tyre;
    }

    public Vehicle(Engine engine, Tyres tyre)
    {
        System.out.println("instantiated via constructor");
        this.engine = engine;
        this.tyre = tyre;
    }

    public Vehicle() {}
    public Engine getEngine()
    {

        return engine;
    }
    public void setEngine(Engine engine)
    {
        System.out.println("instantiated via setter");
        this.engine = engine;
    }

    @Override
    public String toString()
    {
        return engine + " " + tyre;
    }


}

