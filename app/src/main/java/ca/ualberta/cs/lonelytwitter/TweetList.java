package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by michael on 2017-10-12.
 */

public class TweetList {

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

    public Tweet getTweet(int index){

        Collections.sort(tweets,new Comparator<Tweet>() {
            public int compare(Tweet t1, Tweet t2){
                return t1.getDate().compareTo(t2.getDate());
            }

        });

        return tweets.get(index);
    }

    public int getCount(){

        return tweets.size();

    }
}
