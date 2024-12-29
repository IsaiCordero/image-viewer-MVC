package software.ulpgc.imageviewer.control;

import software.ulpgc.imageviewer.view.ImageDisplay;

public class NextCommand implements Command {
    private ImageDisplay display;

    public NextCommand(ImageDisplay display) {
        this.display = display;
    }

    @Override
    public void execute() {
        display.show(display.image().next());
    }
}
