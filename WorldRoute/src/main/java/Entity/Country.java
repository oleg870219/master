package entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

/**
 * Created by oform on 4/10/2017.
 */

@Component
public class Country {

    @JsonProperty("id")
    Long id = 1l;

    @JsonProperty("name")
    String name = "Ukraine";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
