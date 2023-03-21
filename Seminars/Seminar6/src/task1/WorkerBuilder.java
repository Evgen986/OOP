package task1;

public interface WorkerBuilder {
    public WorkerBuilderRoman fixName();
    public WorkerBuilderRoman fixSalary();
    public WorkerBuilderRoman fixVacation();
    public WorkerBuilderRoman fixCabinet();
    public WorkerBuilderRoman fixPhoneNumber();
    public WorkerBuilderRoman build();

}
