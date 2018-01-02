package me.shackox.reactive.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by SHACKOX on 1/01/18.
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeEvent {
    private Employee employee;
    private Date date;
}
