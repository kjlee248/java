/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Mocktest;

import org.junit.Test;

import mocktest.Library;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
