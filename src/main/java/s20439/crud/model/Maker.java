package s20439.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Maker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String makerName;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
