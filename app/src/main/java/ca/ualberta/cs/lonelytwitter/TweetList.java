package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by michael on 2017-10-12.
 */
//change the class to private since all the call will be in the package.

class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void addTweet(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }else{
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet){

        return tweets.contains(tweet);

    }

    public void delete(Tweet tweet){

        tweets.remove(tweet);
    }

    public Tweet getTweet(){

        Collections.sort(tweets,new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2){
                return t1.getDate().compareTo(t2.getDate());
            }

        });
        // change the parameter to 0 since it is always 0
        return tweets.get(0);
    }

    public int getCount(){

        return tweets.size();

    }
}
