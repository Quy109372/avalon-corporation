package avc.contents;

import arc.graphics.Color;
import mindustry.content.Planets;
import mindustry.type.Item;

public class AVCItem {
    public static Item
    fireSteel;
    public static void load(){
        fireSteel = new Item("fire steel", Color.valueOf("FF3A3AFF")) {{
            charge = 2;
            flammability = 0.85f;
            shownPlanets.add(Planets.serpulo);
        }};
}}