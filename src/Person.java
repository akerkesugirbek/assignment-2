class Person implements Payable, Comparable<Person> {
    private static int nextId = 1;
    final private int id;
    private String name;
    private String surname;
    public Person() {
        this.id = generateId();
    }
    public Person(String name, String surname) {
        this.id = generateId();
        this.name = name;
        this.surname = surname;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
    public String getPosition() {
        return "Student";
    }
    @Override
    public double getPaymentAmount() {
        return 0.00;
    }
    @Override
    public int compareTo(Person otherPerson) {
        return Double.compare(this.getPaymentAmount(), otherPerson.getPaymentAmount());
    }
    private static int generateId() {
        return nextId++;
    }
}
