package BS2;

import org.springframework.stereotype.Service;

@Service("PersonaServiceImp")
public class PersonaServiceImp implements PersonaService{

    Persona p = new Persona();

    public void createPersona(Persona persona) {
        this.p.setNombre(persona.getNombre());
        this.p.setPoblacion(persona.getPoblacion());
        this.p.setEdad(persona.getEdad());
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
