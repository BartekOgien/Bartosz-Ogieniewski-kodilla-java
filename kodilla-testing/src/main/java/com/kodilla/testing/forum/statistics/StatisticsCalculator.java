package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int forumUsers;
    int postsNumber;
    int commentsNumber;
    double averagePostsperUser;
    double averageCommentsPerUser;
    double averageCommentsperPost;

    public void calculateAdvStatistics(Statistics statistics) {
        forumUsers = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        averagePostsperUser = (double)postsNumber / forumUsers;
        averageCommentsPerUser = (double)commentsNumber / forumUsers;
        averageCommentsperPost = (double)commentsNumber / postsNumber;
    }

    public void showStatistics() {
        System.out.println("Numbers of users: " + forumUsers);
        System.out.println("Numbers of posts: " + postsNumber);
        System.out.println("Numbers of comments: " + commentsNumber);
        System.out.println("Average numbers of posts per user: " + averagePostsperUser);
        System.out.println("Numbers of comments per user: " + averageCommentsPerUser);
        System.out.println("Numbers of comments per post: " + averageCommentsperPost);
    }
}


