package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library1");
        IntStream.range(1, 11).forEach(b ->library.getBooks().add(new Book("Title" + b, "Author" + b, LocalDate.of(2000+b, 1+b, 11))));
        Book book11 = new Book("Title11", "Author11", LocalDate.of(1999, 12, 1));
        library.getBooks().add(book11);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book11);

        //Then
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(10, clonedLibrary.getBooks().size());
        Assert.assertEquals(11, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
