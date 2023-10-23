package com.iob;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement (name = "empleados")
public class Empleados {
    @XmlElement (name = "empleado")
    private List<Empleado> empleados;

    public Empleados(List<Empleado> empleados, PrintStream out) {
        this.empleados = new ArrayList<>();
    }

    public Empleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empleados(){
        empleados = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "empleados=" + empleados +
                '}';
    }
}
