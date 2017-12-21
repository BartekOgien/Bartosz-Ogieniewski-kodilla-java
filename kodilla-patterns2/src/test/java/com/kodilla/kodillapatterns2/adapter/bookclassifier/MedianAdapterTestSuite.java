package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Title1", 2000, "1"));
        bookSet.add(new Book("Author2", "Title2", 2003, "2"));
        bookSet.add(new Book("Author3", "Title3", 2001, "3"));
        bookSet.add(new Book("Author4", "Title4", 1998, "4"));
        bookSet.add(new Book("Author5", "Title5", 1990, "5"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(median);
        Assert.assertEquals(median, 2000);
    }
}
