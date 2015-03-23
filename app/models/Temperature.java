package models;

import java.util.*;
import play.modules.mongodb.jackson.MongoDB;
import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.ObjectId;
import org.codehaus.jackson.annotate.JsonProperty;
import net.vz.mongodb.jackson.DBQuery;

import javax.persistence.*;

public class Temperature{
    
  @Id
  @ObjectId
  public String id;

  public String data;
  
  public int hour;
  
  public double temperature;

  private static JacksonDBCollection<Temperature, String> coll = MongoDB.getCollection("temperatures", Temperature.class, String.class);

  public Temperature(){

  }

  public Temperature(String data, int hour, double temperature) {
    this.data = data;
    this.hour = hour;
    this.temperature = temperature;
  }

  public static List<Temperature> all() {
    return Temperature.coll.find().toArray();
  }

  public static void create(Temperature temperature) {
	  Temperature.coll.save(temperature);
  }

  public static void create(String data, int hour, double temperature){
      create(new Temperature(data,hour,temperature));
  }

  public static void delete(String id) {
	  Temperature temperature = Temperature.coll.findOneById(id);
    if (temperature != null)
    	Temperature.coll.remove(temperature);
  }

  public static void removeAll(){
	  Temperature.coll.drop();
  }
  
  public static List<Temperature> where(String key, String value){
	  return Temperature.coll.find(DBQuery.is(key, value)).toArray();
  }
}
