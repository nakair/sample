package jp.co.itrade.sample.domain.service;

import jp.co.itrade.sample.domain.model.Todo;
import jp.co.itrade.sample.domain.repository.TodoRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Named
@Transactional
public class TodoServiceImpl implements TodoService {

    @Inject
    private TodoRepository todoRepository;

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo create(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo findOne(Long todoId) {
        return todoRepository.findOne(todoId);
    }

    @Override
    public Todo update(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public void delete(Long todoId) {
        todoRepository.delete(todoId);
    }
}
