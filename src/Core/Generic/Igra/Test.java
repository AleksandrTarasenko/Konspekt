package Core.Generic.Igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Petr", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Aleksandr", 39);
        Employee employee2 = new Employee("Roman", 45);

        Team<Schoolar> schoolarteam = new Team<>("Drakoni");
        Team<Student>  studentTeam= new Team<>("Vpered");
        Team<Employee> employeeTeam = new Team<>("rabotyagi");
        // в команду школьников можно добавить и студентов и работников
        // если в классе Team в методе addNewParticipant указан (Participant participant)
        // есть вариант создать три разных класса для каждых возрастов, однако это лишние строки кода
        // достаточно в классе Team добавить Core.Generic <T>
        //изменить в строке private List<Participant> participants = new ArrayList<>();
        //<Participant> на <T>
        //в строке public void addNewParticipant (Participant participant) изменить Participant на T
        // у переменной participant нет метода getName()); по этому кастим её до Participant ((Participant)participant).getName());
        // и Изменить текущую строку на Team<Schoolar> schoolarteam = new Team<>("Drakoni");

        schoolarteam.addNewParticipant(schoolar1);
        schoolarteam.addNewParticipant(schoolar2);
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
        //На данном этапе можно создать команду с типом String  и добавить ей название, что не правильно
        //Пример:
        // Team<String> anotherTeam =new Team<>("Fantaziya");
        // anotherTeam.addNewParticipant("hello");
        //Что бы исключить возможность добавлять что попало необходимо
        // в класс public class Team <T> добавить <T extends Participant>
        //при этом можно избавиться от кастинга в строке System.out.println("V komandu " + name + "bil dobavlen uchasnik" + ((Participant)participant).getName());
        //((Participant)participant).getName()) до participant.getName());
        Team<Schoolar> schoolarteam2 = new Team<>("Fribsy");
        Schoolar schoolar3 = new Schoolar("Vlad", 11);
        Schoolar schoolar4 = new Schoolar("Simona", 10);
        schoolarteam2.addNewParticipant(schoolar3);
        schoolarteam2.addNewParticipant(schoolar4);
        schoolarteam.playWith(schoolarteam2);
        // Здесь есть проблема, schoolarteam (Школьники) могут играть как со студентами так и с работниками
        //schoolarteam.playWith(studentTeam);
        //Что бы исправить, изменим метод playWith добавив <T>, т.е playWith (Team <T> team)
        //тогда команды будут играть только со своим типом
    }

}
