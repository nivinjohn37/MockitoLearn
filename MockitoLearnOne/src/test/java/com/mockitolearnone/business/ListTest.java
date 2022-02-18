package com.mockitolearnone.business;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void mockListSizeMethod() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(listMock.size(), 2);
    }

    @Test
    public void mockListSizeMethodMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(listMock.size(), 2);
        assertEquals(listMock.size(), 3);
    }

    @Test
    public void mockListSizeMethodGet1() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("test");
        assertEquals("test", listMock.get(0));
        assertNull(listMock.get(1));
    }

    @Test
    public void mockListSizeMethodGet2() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("test");
        assertEquals("test", listMock.get(0));
        assertEquals("test", listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void mockListSizeMethodException() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Some Error"));
        listMock.get(0);

    }
}
