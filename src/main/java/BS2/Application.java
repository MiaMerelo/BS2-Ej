package BS2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    CiudadService getCiudadesService(){
        return new CiudadServiceImp();
    }

    @Bean(name = "bean1")
    PersonaService getPersonaService1(){
        PersonaService ps = new PersonaServiceImp();
        ps.createPersona(new Persona("Ana", "Finisterre", 18));
        return ps;
    }
    @Bean(name = "bean2")
    PersonaService getPersonaService2(){
        PersonaService ps = new PersonaServiceImp();
        ps.createPersona(new Persona("Belén", "Sevilla", 24));
        return ps;
    }
    @Bean(name = "bean3")
    PersonaService getPersonaService3(){
        PersonaService ps = new PersonaServiceImp();
        ps.createPersona(new Persona("Carmen", "Trinidad", 32));
        return ps;
    }
}
