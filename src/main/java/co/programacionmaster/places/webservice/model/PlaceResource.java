package co.programacionmaster.places.webservice.model;

import org.springframework.lang.NonNull;

public class PlaceResource {

  @NonNull
  private String id;

  @NonNull
  private String name;

  @NonNull
  private Double longitude;

  @NonNull
  private Double latitude;

  public PlaceResource(
      @NonNull String id,
      @NonNull String name,
      @NonNull Double longitude,
      @NonNull Double latitude
  ) {
    this.id = id;
    this.name = name;
    this.longitude = longitude;
    this.latitude = latitude;
  }

  @NonNull
  public String getId() {
    return id;
  }

  @NonNull
  public String getName() {
    return name;
  }

  @NonNull
  public Double getLongitude() {
    return longitude;
  }

  @NonNull
  public Double getLatitude() {
    return latitude;
  }
}
