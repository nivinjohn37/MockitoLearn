package com.mockitolearnone.business;

import com.mockitolearnone.data.api.TodoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTest {
    @Test
    public void testRetrieveTodosRelatedToSpringUsingMock() {
        TodoService todoServiceMock = mock(TodoService.class);
        List<String> resultTodos =  Arrays.asList("Test One", "Test Two", "Test Three");
        when(todoServiceMock.retrieveTodos("Test")).thenReturn(resultTodos);
        //TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceMock);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Test");
        assertEquals(3,filteredTodos.size());
    }
}

