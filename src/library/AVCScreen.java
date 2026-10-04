package library;

import arc.Core;
import arc.graphics.g2d.*;
import arc.graphics.Color;

public class AVCScreen {
    public void drawGray() {
        Draw.color(Color.gray.cpy().a(0.5f));
            Fill.crect(Core.camera.position.x - Core.camera.width/2f,
            Core.camera.position.y - Core.camera.height/2f,
            Core.camera.width,
            Core.camera.height);
        Draw.color();
    }
    public void drawWhite() {
        Draw.color(Color.white.cpy().a(0.5f));
            Fill.crect(Core.camera.position.x - Core.camera.width/2f,
            Core.camera.position.y - Core.camera.height/2f,
            Core.camera.width,
            Core.camera.height);
        Draw.color();
    }
    public void drawRed() {
        Draw.color(Color.red.cpy().a(0.5f));
            Fill.crect(Core.camera.position.x - Core.camera.width/2f,
            Core.camera.position.y - Core.camera.height/2f,
            Core.camera.width,
            Core.camera.height);
        Draw.color();
    }
}
