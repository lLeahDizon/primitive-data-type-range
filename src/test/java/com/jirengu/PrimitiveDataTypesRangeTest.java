package com.jirengu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimitiveDataTypesRangeTest {

    @Test
    public void testPrimitiveDataTypesRange() {
        // Act
        PrimitiveDataTypesRange.main(null);

        // Assert
        assertEquals(Byte.MAX_VALUE, PrimitiveDataTypesRange.MAX_BYTE);
        assertEquals(Byte.MIN_VALUE, PrimitiveDataTypesRange.MIN_BYTE);
        assertEquals(Short.MAX_VALUE, PrimitiveDataTypesRange.MAX_SHORT);
        assertEquals(Short.MIN_VALUE, PrimitiveDataTypesRange.MIN_SHORT);
        assertEquals(Integer.MAX_VALUE, PrimitiveDataTypesRange.MAX_INT);
        assertEquals(Integer.MIN_VALUE, PrimitiveDataTypesRange.MIN_INT);
        assertEquals(Long.MAX_VALUE, PrimitiveDataTypesRange.MAX_LONG);
        assertEquals(Long.MIN_VALUE, PrimitiveDataTypesRange.MIN_LONG);
        assertEquals(Float.MAX_VALUE, PrimitiveDataTypesRange.MAX_FLOAT);
        assertEquals(Float.MIN_VALUE, PrimitiveDataTypesRange.MIN_FLOAT);
        assertEquals(Double.MAX_VALUE, PrimitiveDataTypesRange.MAX_DOUBLE);
        assertEquals(Double.MIN_VALUE, PrimitiveDataTypesRange.MIN_DOUBLE);
        assertEquals(Character.MAX_VALUE, PrimitiveDataTypesRange.MAX_CHAR);
        assertEquals(Character.MIN_VALUE, PrimitiveDataTypesRange.MIN_CHAR);
    }

}
