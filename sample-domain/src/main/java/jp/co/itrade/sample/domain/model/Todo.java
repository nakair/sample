package jp.co.itrade.sample.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
    @Id
    @GeneratedValue
    private Long todoId;
    private String todoTitle;
    private boolean finished = false;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Version
    private Long version;
}
