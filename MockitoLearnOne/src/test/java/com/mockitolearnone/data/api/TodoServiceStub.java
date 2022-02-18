package com.mockitolearnone.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Test One", "Test Two", "Test Three");
    }
}
