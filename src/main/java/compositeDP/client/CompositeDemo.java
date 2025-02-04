package compositeDP.client;

import compositeDP.component.Department;
import compositeDP.leaf.FinancialDepartment;
import compositeDP.composite.HeadDepartment;
import compositeDP.leaf.SalesDepartment;

public class CompositeDemo {

    public static void main(String args[]) {

        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");
        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");
        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.printDepartmentName();
    }

}
