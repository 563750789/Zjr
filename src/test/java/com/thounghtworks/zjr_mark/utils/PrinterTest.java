package com.thounghtworks.zjr_mark.utils;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void print() {
        System.setOut(new PrintStream(outContent));
        Printer.print("aaa");
        assertEquals("aaa" + System.lineSeparator(), outContent.toString());
    }
    
}