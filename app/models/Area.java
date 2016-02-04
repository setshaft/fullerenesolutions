package models;


import play.data.validation.Constraints;

import java.util.ArrayList;
import java.util.List;

public class Area {

  private static List<Area> areas;

  static {
    areas = new ArrayList<Area>();
    areas.add(new Area("Hyderabad", "Hot","4","11111111","2222222"));
    areas.add(new Area("Kolkata", "Hot","4","11111111","2222222"));
    areas.add(new Area("Bangalore", "Cool","4","11111111","2222222"));
    areas.add(new Area("Chennai", "Hot","4","11111111","2222222"));
  }

  @Constraints.Required
  public String name;
  @Constraints.Required
  public String category;
  public String rating;
  public String latitude;
  public String longitude;

  public Area() {
  }

  public Area(String name, String category, String rating, String latitude, String longitude) {
    this.name = name;
    this.category = category;
    this.rating = rating;
    this.latitude=latitude;
    this.longitude=longitude;
  }

  public String toString() {
    return String.format("%s - %s", name, category);
  }

  public static List<Area> findAll() {
    return new ArrayList<Area>(areas);
  }

  public static Area findByName(String name) {
    for (Area candidate : areas) {
      if (candidate.name.equals(name)) {
        return candidate;
      }
    }
    return null;
  }

  public static List<Area> addByName(String term) {
    final List<Area> results = new ArrayList<Area>();
    for (Area candidate : areas) {
      if (candidate.name.toLowerCase().contains(term.toLowerCase())) {
        results.add(candidate);
      }
    }

    return results;
  }

  public static boolean remove(Area area) {
    return areas.remove(area);
  }

  public void save() {
    areas.remove(findByName(this.name));
    areas.add(this);
  }

}
