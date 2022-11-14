package model;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Car {
private String brend;
private  String type;
private String color;


    public Car(String brend, String type, String color) {
        this.brend = brend;
        this.type = type;
        this.color = color;
    }




    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
