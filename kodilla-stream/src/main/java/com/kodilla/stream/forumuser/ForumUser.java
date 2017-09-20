package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userID;
    private final String forumUser;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int userID, final String forumUser, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        this.userID = userID;
        this.forumUser = forumUser;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public String toString() {
        return "ForumUser: " + forumUser+" / sex:" + sex + " / date of birth:"+dateOfBirth + " / number of posts:" + numberOfPosts;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }
}
