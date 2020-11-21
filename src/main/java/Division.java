import lombok.*;

@Getter
@Setter
@ToString
public class Division {
    private int id;
    private String name;

    public Division(int id) {
        this.id = id;
    }
}
