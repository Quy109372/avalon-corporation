package avc.contents.blocks;

import mindustry.content.Items;
import mindustry.type.ItemStack;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.PowerTurret;

public class AVCTurret{
    public static Block 
    waveGun;
        public static void load(){
            waveGun = new PowerTurret("waveGun"){{
                requirements(Category.turret, ItemStack.with(Items.silicon, 100));
                health = 10800;
                size = 2;
                armor = 3;

            }};
}}