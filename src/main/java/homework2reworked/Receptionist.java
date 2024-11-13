package homework2reworked;

class Receptionist extends Person {
    private int receptionistId;

    public Receptionist(String name, int age, String gender, int receptionistId) {
        super(name, age, gender);
        this.receptionistId = receptionistId;
    }

    public int getReceptionistId() {
        return receptionistId;
    }

    public void setReceptionistId(int receptionistId) {
        this.receptionistId = receptionistId;
    }

    @Override
    public String personDescription() {
        return "Receptionist " + receptionistId + name;
    }
}
