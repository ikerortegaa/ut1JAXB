package com.iob;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class escribeJAXB
{
    public static void main( String[] args )
    {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1,"Pepe Pérez",2000));
        empleados.add(new Empleado(2,"Jesús Gil",1000));
        empleados.add(new Empleado(3,"Sergio Ramos",1500));

        Empleados emps = new Empleados(empleados);

        // cargar empleados a la lista
        try {
            JAXBContext contexto = JAXBContext.newInstance(
                    emps.getClass() );
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE);
            marshaller.marshal(emps, System.out);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


    }
}
