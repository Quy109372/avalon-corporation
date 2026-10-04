package avc.contents.blocks;

import mindustry.type.Item;
import mindustry.content.Items;
import mindustry.content.ItemStack;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.PowerTurret;

public class AVCTurret{
    public static Block 
    waveGun;
        public static void load(){
            waveGun = new PowerTurret("waveGun"){{
                requirements(Category.turret,ItemStack(Items.silicon, 100));
            }};
        }

}