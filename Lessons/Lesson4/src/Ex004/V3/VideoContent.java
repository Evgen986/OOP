package Ex004.V3;

public class VideoContent extends Content {
    public VideoContent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "VideoContent{" +
                "name='" + name + '\'' +
                '}';
    }
}
