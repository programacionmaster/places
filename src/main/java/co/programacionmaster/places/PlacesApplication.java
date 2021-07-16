package co.programacionmaster.places;

import co.programacionmaster.places.webservice.web.rest.PlaceRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {
    PlaceRestController.class
})
public class PlacesApplication {

  public static void main(String[] args) {
    SpringApplication.run(PlacesApplication.class, args);
  }
}