public class Person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Varshitha";
        person.nationality = "Indian";
        person.dateOfBirth = " 31 - 08 - 2002 ";
        person.passport = new String[]{person.name, person.nationality, person.dateOfBirth};
        person.seatNumber = 27;
        System.out.println("\n"+ person.name + "\n"+ person.nationality + "\n"+ person.seatNumber + "\n"+ person.passport + "\n"+ person.dateOfBirth);
    }
}


