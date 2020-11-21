import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    private int id;
    private String name;
    private String gender;
    private String birtDate;
    private Division division;
    private String salary;

    public Person(FlatPerson flatPerson, int divisionId) {
        this.id = Integer.parseInt(flatPerson.getId());
        this.name = flatPerson.getName();
        this.gender = flatPerson.getGender();
        this.birtDate = flatPerson.getBirtDate();
        this.division = new Division(divisionId, flatPerson.getDivisionName());
        this.salary = flatPerson.getSalary();
    }
}
