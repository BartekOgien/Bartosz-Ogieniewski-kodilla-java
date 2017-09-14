package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfUsers = forum.getUserList().stream()
                                                                     .filter(f -> f.getSex()=='M')
                                                                      .filter(f -> f.getDateOfBirth().getYear()<1997)
                                                                      .filter(f -> f.getNumberOfPosts()>0)
                                                                        .collect(Collectors.toMap(f -> f.getUserID(), f -> f));

        resultMapOfUsers.entrySet().stream()
                                     .map(e -> "User ID: " + e.getKey() + " // "+e.getValue())
                                     .forEach(System.out::println);

    }
}
