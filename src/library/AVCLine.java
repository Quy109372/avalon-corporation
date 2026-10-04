package library;

import mindustry.graphics.Drawf;
import arc.Core;
import arc.graphics.Color;

import java.util.Random;

public class AVCLine {
    Random r = new Random();
    float randWidth1, randHeight1, randWidth2, randHeight2;

    public AVCLine(){
        randWidth1 = r.nextFloat(Core.camera.width + 100);
        randHeight1 = r.nextFloat(Core.camera.height + 100);
        randWidth2 = r.nextFloat(Core.camera.width + 100);
        randHeight2 = r.nextFloat(Core.camera.height + 100);
    }

    public void drawLine(){
        Drawf.line(Color.white, randWidth1, randHeight1, randWidth2, randHeight2);
    }
}

