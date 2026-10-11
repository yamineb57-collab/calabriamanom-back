package Domain;

import Utils.TypePlat;
import org.springframework.stereotype.Component;

@Component
public class Plat {

    private Long id;
    private String name;
    private String description;
    private String imageURL;
    private TypePlat type;

    public Plat(Long id, String name, String description, String imageURL, TypePlat type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public TypePlat getType() {
        return type;
    }

    public void setType(TypePlat type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
