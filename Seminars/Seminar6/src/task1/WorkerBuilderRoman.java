package task1;

public class WorkerBuilderRoman {
    private static WorkerBuilderRoman instance = null;
    Worker obj;

    private WorkerBuilderRoman() {

    }

    public static WorkerBuilderRoman getInstance() {
        if (instance == null)
            instance = new WorkerBuilderRoman();
        instance.obj = new Worker();

        return instance;
    }

    public WorkerBuilderRoman setName(String name) {
        obj.setName(name);
        return this;
    }



    public WorkerBuilderRoman salary(int salary) {
        obj.setSalary(salary);
        return this;
    }

    public WorkerBuilderRoman phoneNumber(int phoneNumber) {
        obj.setPhoneNumber(phoneNumber);
        return this;
    }
    public WorkerBuilderRoman pabinet(byte cabinet) {
        obj.setCabinet(cabinet);
        return this;
    }



    public Worker build(){
        return obj;
    }

    @Override
    public String toString() {
        return "task1.WorkerBuilder{" +
                "obj=" + obj +
                '}';
    }
}