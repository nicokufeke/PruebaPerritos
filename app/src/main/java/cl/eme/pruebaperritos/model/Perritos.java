package cl.eme.pruebaperritos.model;

import java.util.List;

public class Perritos {

    private String id;
    private String imageSrc;
    private String name;
    private List<String> breeds;

    @Override
    public String toString() {
        return "Perritos{" +
                "id='" + id + '\'' +
                ", imageSrc='" + imageSrc + '\'' +
                ", name='" + name + '\'' +
                ", breeds=" + breeds +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<String> breeds) {
        this.breeds = breeds;
    }
}
