package org.example;

import org.junit.Test;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit tests for the CSVparser class
 */
public class CSVparserTest {
    @Test
    public void isCorrectFilePathTestTrue() {
        String filePath = "C:/Users/Sofi/Desktop/foreign_names_1.csv";
        CVSparser reader = new CVSparser();
        assertTrue(reader.isCorrectFilePath(filePath));
    }

    @Test
    public void isCorrectFilePathTestFalse() {
        String filePath = "C:/Users/Sofi/Desktop/foreign_names_1.cs";
        CVSparser reader = new CVSparser();
        assertFalse(reader.isCorrectFilePath(filePath));
    }

    @Test
    public void parseCSVTest() throws IOException {
        String filePath = "C:/Users/Sofi/Desktop/foreign_names_1.csv";
        CVSparser reader = new CVSparser();
        assertEquals(25899, reader.parseCSV(filePath).size());
    }
    @Test
    public void parseCSVTest2() throws IOException {
        String filePath = "C:/Users/Sofi/Desktop/foreign_names_1.csv";
        List<Person> personsResult = new ArrayList();
        CVSparser reader = new CVSparser();
        personsResult = reader.parseCSV(filePath);
        assertEquals("Aahan", personsResult.get(1).getName());
    }

    @Test
    public void parseCSVTest3() throws IOException {
        String filePath = "C:/Users/Sofi/Desktop/foreign_names_1.csv";
        List<Person> personsResult = new ArrayList();
        CVSparser reader = new CVSparser();
        personsResult = reader.parseCSV(filePath);
        assertEquals("Male", personsResult.get(14998).getSex());
    }
}