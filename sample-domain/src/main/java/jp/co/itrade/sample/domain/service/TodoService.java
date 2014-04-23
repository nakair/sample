package jp.co.itrade.sample.domain.service;

import jp.co.itrade.sample.domain.model.Todo;

import java.util.List;

public interface TodoService {

    default List<Todo> findAll() {
        throw new UnsupportedOperationException();
    }

    default Todo create(Todo todo) {
        throw new UnsupportedOperationException();
    }

    default Todo findOne(Long todoId) {
        throw new UnsupportedOperationException();
    }

    default Todo update(Todo todo) {
        throw new UnsupportedOperationException();
    }

    default void delete(Long todoId) {
        throw new UnsupportedOperationException();
    }
}
