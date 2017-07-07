package in.ac.amu.zhcet.data.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Department extends BaseIdEntity {
    private String departmentName;
}
