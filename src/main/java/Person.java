import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    private String name;
    private String sex;
    private Date dateBirth;
    private Subdivision subdivision;
    private String salary;
}
