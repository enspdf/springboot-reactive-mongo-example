package me.shackox.reactive.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by SHACKOX on 1/01/18.
 */

@EqualsAndHashCode
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Employee {
    @Id
    private String id;
    private String name;
    private Long salary;
}
