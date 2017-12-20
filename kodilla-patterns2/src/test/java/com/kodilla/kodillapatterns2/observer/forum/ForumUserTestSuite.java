package com.kodilla.kodillapatterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser sanEscobar = new ForumUser("San Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(sanEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi everyone");
        javaHelpForum.addPost("Could you help me with loop");
        javaToolsForum.addPost("Hello");
        javaHelpForum.addPost("Bla bla");
        javaToolsForum.addPost("He is a troll!");
        //Then
        Assert.assertEquals(3, johnSmith.getUpdateCount());
        Assert.assertEquals(2, sanEscobar.getUpdateCount());
        Assert.assertEquals(5, jessiePinkman.getUpdateCount());
    }
}
