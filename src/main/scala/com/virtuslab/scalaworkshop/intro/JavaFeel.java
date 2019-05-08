package com.virtuslab.scalaworkshop.intro;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaFeel {
    static class Car {
        private String brand;
        private String model;
        private BigDecimal engine;
        private String clazz;

        public Car(String brand, String model, BigDecimal engine, String clazz) {
            this.brand = brand;
            this.model = model;
            this.engine = engine;
            this.clazz = clazz;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public BigDecimal getEngine() {
            return engine;
        }

        public void setEngine(BigDecimal engine) {
            this.engine = engine;
        }

        public String getClazz() {
            return clazz;
        }

        public void setClazz(String clazz) {
            this.clazz = clazz;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return Objects.equals(brand, car.brand) &&
                    Objects.equals(model, car.model) &&
                    Objects.equals(engine, car.engine) &&
                    Objects.equals(clazz, car.clazz);
        }

        @Override
        public int hashCode() {
            return Objects.hash(brand, model, engine, clazz);
        }

        @Override
        public String toString() {
            return "Car{" +
                    "brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", engine=" + engine +
                    ", clazz='" + clazz + '\'' +
                    '}';
        }
    }

    public static void main(String[] args)  {
        List<Car> cars = Arrays.asList(
                new Car("Fiat", "500", new BigDecimal("1.0"), "C"),
                new Car("Audi", "A4", new BigDecimal("1.6"), "C"),
                new Car("Ford", "Focus", new BigDecimal("1.8"), "C"),
                new Car("BMW", "1", new BigDecimal("2.0"), "C"),
                new Car("Ford", "Focus", new BigDecimal("1.8"), "C")
        );

        List<String> carsWithLargerEngine = cars.stream()
                .collect(Collectors.groupingBy(car -> car.clazz))
                .getOrDefault("C", Arrays.asList()).stream()
                .filter(car -> car.engine.compareTo(new BigDecimal("1.5")) > 0)
                .distinct()
                .map(car -> car.toString())
                .collect(Collectors.toList());

        System.out.println(
                String.format("Cars with larger engine: \n\t%s", String.join("\n\t", carsWithLargerEngine))
        );
    }
}
