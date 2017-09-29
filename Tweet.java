/*
 * Class Name : Tweet
 *
 * Version: Version 1.0
 *
 * Date : September 28 2017
 *
 * Copyright(c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute or modify under the Code of Student Behavior under the University of alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author HL5
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;


    /**
     * Constructs Tweet objects
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }


    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }



    public void setDate(Date date){
        this.date = date;
    }


    public Date getDate() {
        return date;
    }

    public String getMessage(){
        return message;
    }

    public abstract Boolean isImportant();


    /**
     *
     * sets tweet messages
     * @param message Tweet message
     * @throws TweetTooLongException
     *
     *
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <=140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;

    }
}
