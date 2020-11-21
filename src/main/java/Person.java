import lombok.*;

import java.io.Serializable;


@ToString
public class Person implements Serializable {
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String gender;
    @Getter
    @Setter
    private String BirtDate;
    private Division Division;
    @Getter
    @Setter
    private String Salary;

    public Person () {
        this.Division = new Division(1);
    }

}
