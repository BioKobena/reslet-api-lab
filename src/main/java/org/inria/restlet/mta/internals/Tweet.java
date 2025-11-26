package org.inria.restlet.mta.internals;

public class Tweet {
     /** Internal id of the user.*/
    private int id_;

    /** Name of the user.*/
    private String tweet;

    private User user_id;

    public Tweet(String tweet, User user_id){
        this.tweet = tweet;
        this.user_id = user_id;
    }

    public String getTweet(){
        return this.tweet;
    }

    // public void setTweet(String content, User user_id){
    //     this.tweet = content;
    // }
}
