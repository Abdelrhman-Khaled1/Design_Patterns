package compositeDP.leaf;


import compositeDP.component.Department;

/*
 * represents leaf objects in the composition. A leaf has no children.
 * defines behavior for primitive objects in the composition
 */
public class SalesDepartment implements Department {
    private Integer id;
    private String name;

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
