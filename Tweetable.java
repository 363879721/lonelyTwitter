/*
 * Class Name : Tweetable
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
 * get message and date when tweeting
 * @author HL5
 * @version 1.0
 * @Tweet
 * @since 1.0
 */


/**
 * when tweeting a message get the message from the message
 * and public the date
 */
public interface Tweetable {
    public String getMessage();

    public  Date getDate();

}
