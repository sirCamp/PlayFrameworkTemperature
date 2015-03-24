package models;

import java.util.*;

import play.modules.mongodb.jackson.MongoDB;

import net.vz.mongodb.jackson.JacksonDBCollection;
import net.vz.mongodb.jackson.Id;
import net.vz.mongodb.jackson.ObjectId;

import org.codehaus.jackson.annotate.JsonProperty;

import net.vz.mongodb.jackson.DBQuery;

import javax.persistence.*;

public class Failure{
    
  @Id
  @ObjectId
  public String id;

  public String data;
  
  public long timestamp;
  
  public String message;

  private static JacksonDBCollection<Failure, String> coll = MongoDB.getCollection("failures", Failure.class, String.class);

  public Failure(){

  }

  public Failure(String data, long timestamp, String message) {
    this.data = data;
    this.timestamp = timestamp;
    this.message = message;
  }

  public static List<Failure> all() {
    return Failure.coll.find().toArray();
  }

  public static void create(Failure Failure) {
	  Failure.coll.save(Failure);
  }

  public static void create(String data, long timestamp, String message){
      create(new Failure(data,timestamp,message));
  }

  public static void delete(String id) {
	  Failure failure = Failure.coll.findOneById(id);
    if (failure != null)
    	Failure.coll.remove(failure);
  }

  public static void removeAll(){
	  Failure.coll.drop();
  }
  
  public static List<Failure> where(String key, String value){
	  return Failure.coll.find(DBQuery.is(key, value)).toArray();
  }
}
