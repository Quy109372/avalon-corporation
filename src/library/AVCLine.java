package library;

import mindustry.entities.Effect;
import mindustry.graphics.Drawf;
import arc.Core;
import arc.graphics.Color;

import java.util.Random;

public class AVCLine {
    private static final Random r = new Random();

    public static Effect drawLine = new Effect(20, e -> {
        float randWidth1 = r.nextFloat(Core.camera.width + 100);
        float randHeight1 = r.nextFloat(Core.camera.height + 100);
        float randWidth2 = r.nextFloat(Core.camera.width + 100);
        float randHeight2 = r.nextFloat(Core.camera.height + 100);

        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
    });
}

