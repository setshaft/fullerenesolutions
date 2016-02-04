package controllers;

import models.Area;
import play.data.Form;
import play.mvc.Result;
import play.mvc.Controller;
import views.html.areas.*;
import play.mvc.BodyParser;                     
import play.libs.Json;
import play.libs.Json.*;    
import org.json.JSONObject;
import org.json.JSONException;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

import java.util.List;
public class Areas extends Controller {

  private static final Form<Area> areaForm = Form.form(Area.class);

  public static Result list() {
    List<Area> areas = Area.findAll();
    return ok(list.render(areas));
  }

  public static Result newArea() {
    return ok(details.render(areaForm));
  }

  public static Result details(String name) {
    final Area area = Area.findByName(name);
    if (area == null) {
      return notFound(String.format("Area %s does not exist.", name));
    }

    Form<Area> filledForm = areaForm.fill(area);
    return ok(details.render(filledForm));
  }
  
  @BodyParser.Of(play.mvc.BodyParser.Json.class)
  public static Result jsondetails(String name) {
    final Area area = Area.findByName(name);
    return ok(Json.toJson(area));

  }

  @BodyParser.Of(play.mvc.BodyParser.Json.class)
  public static Result jsonDetailsAllAreas() {
   List<Area> areas = Area.findAll();
   return ok(Json.toJson(areas));

 }
@BodyParser.Of(play.mvc.BodyParser.Json.class)
  public static Result totalAreas() {
   List<Area> areas = Area.findAll();
   int areasSize= areas.size();
   String areaSizeString=new Integer(areasSize).toString();
   return ok(areaSizeString);

 }
 public static Result save() {
  Form<Area> boundForm = areaForm.bindFromRequest();
  if(boundForm.hasErrors()) {
    flash("error", "Please correct the form below.");
    return badRequest(details.render(boundForm));
  }

  Area area = boundForm.get();
  area.save();

  return redirect(routes.Areas.list());
}

public static Result delete(String name) {
  final Area area = Area.findByName(name);
  if(area == null) {
    return notFound(String.format("Area %s does not exists.", name));
  }
  Area.remove(area);
  return redirect(routes.Areas.list());
}
}
