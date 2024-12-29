package com.example.crud.product;

import java.time.LocalDate;

public class Product {
    private Long id;
    private Float price;
    private LocalDate fecha;
    private int antiguedad;

    public Product() {
    }

    public Product(Long id, String name, Float price, LocalDate fecha, int antiguedad) {
        this.id = id;
        this.price = price;
        this.fecha = fecha;
        this.antiguedad = antiguedad;
    }

    public Product(String name, Float price, LocalDate fecha, int antiguedad) {
        this.price = price;
        this.fecha = fecha;
        this.antiguedad = antiguedad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
