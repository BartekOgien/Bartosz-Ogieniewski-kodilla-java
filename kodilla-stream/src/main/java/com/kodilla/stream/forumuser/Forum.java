package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1, "Ziuta", 'F', 1985, 10, 15, 14));
        forumUserList.add(new ForumUser(2, "Ziut", 'M', 2000, 3, 25, 0));
        forumUserList.add(new ForumUser(3, "Morda", 'F', 2005, 5, 4, 6));
        forumUserList.add(new ForumUser(4, "Lump", 'M', 1998, 12, 7, 14));
        forumUserList.add(new ForumUser(5, "Gitara", 'F', 2003, 6, 23, 0));
        forumUserList.add(new ForumUser(6, "Osmany", 'M', 1981, 3, 18, 3));
        forumUserList.add(new ForumUser(7, "Lumpek", 'M', 1997, 11, 7, 14));
        forumUserList.add(new ForumUser(8, "Git", 'M', 2003, 6, 26, 0));
        forumUserList.add(new ForumUser(9, "Intel", 'M', 1987, 3, 18, 1));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
