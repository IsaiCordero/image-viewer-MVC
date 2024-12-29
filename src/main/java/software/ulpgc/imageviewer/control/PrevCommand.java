package software.ulpgc.imageviewer.control;

import software.ulpgc.imageviewer.view.ImageDisplay;

public class PrevCommand implements Command {
    private ImageDisplay display;

    public PrevCommand(ImageDisplay display) {
        this.display = display;
    }

    @Override
    public void execute() {
        display.show(display.image().prev());
    }
}
