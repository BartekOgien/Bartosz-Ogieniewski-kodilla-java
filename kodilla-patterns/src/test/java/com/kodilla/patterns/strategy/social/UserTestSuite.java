package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User alex = new Millenials("Alex");
        User ann = new YGeneration("Ann");
        User anthony = new ZGeneration("Anthony");

        //When
        String alexSharePost = alex.sharePost();
        System.out.println(alex.getName() + alexSharePost);
        String annSharePost = ann.sharePost();
        System.out.println(ann.getName() + annSharePost);
        String anthonySharePost = anthony.sharePost();
        System.out.println(anthony.getName() + anthonySharePost);

        //Then
        Assert.assertEquals(" share post on Facebook", alexSharePost);
        Assert.assertEquals(" share post on Twitter", annSharePost);
        Assert.assertEquals(" share post on Snapchat", anthonySharePost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User alex = new Millenials("Alex");
        System.out.println(alex.getName() + alex.sharePost());

        //When
        alex.setSocialMedia(new TwitterPublisher());
        String alexSetSocialPublisher = alex.sharePost();
        System.out.println(alex.getName() + alexSetSocialPublisher);

        //Then
        Assert.assertEquals(" share post on Twitter", alexSetSocialPublisher);
    }
}
