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
        return new PersonaServiceImp("Ana", "Finisterre", 18);
    }
    @Bean(name = "bean2")
    PersonaService getPersonaService2(){
        return new PersonaServiceImp("Belén", "Sevilla", 24);
    }
    @Bean(name = "bean3")
    PersonaService getPersonaService3(){
        return new PersonaServiceImp("Carmen", "Trinidad", 32);
    }
}
