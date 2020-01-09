package section4;

public class Trainee {
    private static final String COHORT_CODE = "CHNAJ19004";
    private int employeeId;
    private String name;

    public Trainee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(Trainee[] emp) {
        for (Trainee trainee : emp) {
            System.out
                    .println(trainee.getEmployeeId() + " " + trainee.getName() + " " + COHORT_CODE);
        }

    }

}
