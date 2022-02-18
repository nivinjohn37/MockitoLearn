package com.mockitolearnone.business;

import com.mockitolearnone.data.api.TodoService;
import com.mockitolearnone.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TodoBusinessImplStubTest {
    @Test
    public void testRetrieveTodosRelatedToSpring() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);
        List<String> filteredTodos = todoBusiness.retrieveTodosRelatedToSpring("Test");
        assertEquals(3,filteredTodos.size());
    }

    @Test
    public void isUsersPresentTest() {
        TodoService todoServiceStub = new TodoServiceStub();
        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoServiceStub);
        int filteredTodosSize = todoBusiness.isUsersPresent(new String[] {"Test One","Test Two"});
        assertEquals(2,filteredTodosSize);
    }
}

