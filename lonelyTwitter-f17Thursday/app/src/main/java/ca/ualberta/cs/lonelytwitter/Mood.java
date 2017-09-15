package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by hl5 on 9/14/17.
 */

public abstract class Mood implements MoodReceive {
    private String setters;
    private String getters;
    private Date date;

    public Mood(String setters, String getters){
        this.setters = setters;
        this.getters = getters;
        this.date = new Date();
    }

    public Mood(String setters, String getters, Date date) {
        this.setters = setters;
        this.getters = getters;
        this.date = date;
    }

    public void setDate(Date date){this.date = date;}

    
}
