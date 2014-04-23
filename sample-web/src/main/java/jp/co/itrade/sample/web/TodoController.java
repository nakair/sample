package jp.co.itrade.sample.web;

import jp.co.itrade.sample.domain.model.Todo;
import jp.co.itrade.sample.domain.service.TodoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("api/todos")
public class TodoController {

    @Inject
    private TodoService todoService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Todo> getTodos() {
        List<Todo> todos = todoService.findAll();
        return todos;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Todo> postTodos(@RequestBody Todo todo) {
        Todo created = todoService.create(todo);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @RequestMapping(value = "{todoId}", method = RequestMethod.GET)
    public Todo getTodo(@PathVariable("todoId") Long todoId) {
        Todo todo = todoService.findOne(todoId);
        return todo;
    }

    @RequestMapping(value = "{todoId}", method = RequestMethod.PUT)
    public Todo putTodo(@PathVariable("todoId") Long todoId, @RequestBody Todo todo) {
        Todo target = todoService.findOne(todoId);
        BeanUtils.copyProperties(todo, target, "createdAt");
        Todo updated = todoService.update(target);
        return updated;
    }

    @RequestMapping(value = "{todoId}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> putTodo(@PathVariable("todoId") Long todoId) {
        todoService.delete(todoId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
