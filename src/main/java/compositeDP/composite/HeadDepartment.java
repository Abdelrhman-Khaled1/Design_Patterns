package compositeDP.composite;

import compositeDP.component.Department;

import java.util.ArrayList;
import java.util.List;


/*
* defines behavior for components having children.
* stores child components.
* implements child-related operations in the Component interface.
 */
public class HeadDepartment implements Department {

    private Integer id;
    private String name;
    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

}
