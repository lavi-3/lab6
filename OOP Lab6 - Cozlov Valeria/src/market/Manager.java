package market;

public class Manager extends Employee{
    public Manager(boolean works, int salary, int experience) {
        super(works, salary, experience);
    }

    @Override
    public boolean isWorks() {
        return super.isWorks();
    }

    @Override
    public void setWorks(boolean works) {
        super.setWorks(works);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }
}
