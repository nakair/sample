package jp.co.itrade.sample.domain.repository;

import jp.co.itrade.sample.domain.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
