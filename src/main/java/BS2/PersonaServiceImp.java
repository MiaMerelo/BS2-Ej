package BS2;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImp implements PersonaService{

    Persona p = new Persona();

    public PersonaServiceImp(String nombre, String poblacion, int edad){
        p = new Persona(nombre, poblacion, edad);
    }

    public void setNombre(String nombre) {
        p.setNombre(nombre);
    }

    public void setPoblacion(String poblacion) {
        p.setPoblacion(poblacion);
    }

    public void setEdad(int edad) {
        p.setEdad(edad);
    }

    public String getNombre() {
        return p.getNombre();
    }

    public String getPoblacion() {
        return p.getPoblacion();
    }

    public int getEdad() {
        return p.getEdad();
    }
}
