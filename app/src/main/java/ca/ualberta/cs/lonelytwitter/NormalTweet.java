
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * represent when tweet is normal
 * @author HL5
 * @version 1.0
 * @Tweet
 * @since 1.0
 */

/**
 * set tweet to normal tweet
 * @param message set message into normal tweet
 * @param date set the date when change to normal tweet
 * @return isImportant change the value of boolean to false
 *
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
