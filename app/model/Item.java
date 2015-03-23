package model;

import javax.persistence.Id;
import javax.persistence.Version;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

public class Item extends Model {
    @SuppressWarnings("unused")
    @Id
    private Object id;

    @SuppressWarnings("unused")
    @Version
    private Object version;

    @Required
    public String name;

    public String description;
}