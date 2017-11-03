package ca.ualberta.cs.lonelytwitter;


import java.util.Date;
interface Tweetable {
    //remove modifier public since it is redundant for interface methods.
    String getMessage();

    Date getDate();

}
