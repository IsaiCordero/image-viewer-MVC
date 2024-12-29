package software.ulpgc.imageviewer.model;

public interface Image {
    <T> T bitmap();
    Image next();
    Image prev();
}
