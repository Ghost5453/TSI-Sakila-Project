package ApiComponents.Sakila.Project;

import javax.persistence.*;

@Entity
@Table(name="actor")
public class Actor {
    //region Attributes
    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actorID;

    @Column(name="first_name")
    private String actorFirstName;

    @Column(name="last_name")
    private String actorLastName;
    //endregion


    //region Constructors
    public Actor(int myActorID, String myFirstName, String myLastName)
    {
        this.actorID = myActorID;
        this.actorFirstName = myFirstName;
        this.actorLastName = myLastName;
    }

    public Actor()
    {

    }
    //endregion

    //region Methods

    public void setAll(int myID, String myFirstName, String myLastName)
    {
        actorID = myID;
        actorFirstName = myFirstName;
        actorLastName = myLastName;
    }

    //region Getters
    public String getFirstName()
    {
        return actorFirstName;
    }

    public String getActorLastName()
    {
        return actorLastName;
    }

    public int getID()
    {
        return actorID;
    }
    //endregion

    //region Setters
    public void setID(int myID)
    {
        actorID = myID;
    }

    public void setActorLastName(String myLastName)
    {
        actorLastName = myLastName;
    }

    public void setFirstName(String myFirstName)
    {
        actorFirstName = myFirstName;
    }
    //endregion

    //endregion

}
