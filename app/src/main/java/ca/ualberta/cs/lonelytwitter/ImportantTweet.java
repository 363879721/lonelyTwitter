/*
 * Class Name : ImportantTweet
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
 *
 *
 * Represents where if tweet is important
 * @author HL5
 * @version 1.0
 * @Tweet
 * @since 1.0
 */


/**
 *
 * set a tweet into important tweet
 * @param message set message into important message
 * @param date set date when change to important date
 *
 * @return isImportant change the value of boolean to true
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;

    }
}
