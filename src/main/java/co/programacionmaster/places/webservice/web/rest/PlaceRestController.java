package co.programacionmaster.places.webservice.web.rest;

import co.programacionmaster.places.webservice.model.PlaceResource;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/places")
public class PlaceRestController {

  @GetMapping
  public ResponseEntity<List<PlaceResource>> findAll() {
    var place1 = new PlaceResource(
        "44ceb2ee-0345-4bcc-99f4-fad5d467y1a3",
        "Restaurante A",
        -76.541067,
        3.404057
    );

    var place2 = new PlaceResource(
        "44ceb2ee-0345-4bcc-99f4-fad5d467y1a1",
        "Restaurante B",
        -76.544254,
        3.402472
    );
    return ResponseEntity.ok(List.of(place1, place2));
  }

  @GetMapping("/{id}")
  public ResponseEntity<PlaceResource> findById(
      @PathVariable(value = "id") String id
  ) {
    return ResponseEntity.ok(
        new PlaceResource(
            id,
            "Restaurante A",
            -76.541067,
            3.404057
        )
    );
  }
}
