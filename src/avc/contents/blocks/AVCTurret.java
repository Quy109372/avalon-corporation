package avc.contents.blocks;

import library.AVCLine;

import mindustry.content.Items;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.effect.ParticleEffect;
import mindustry.entities.effect.WaveEffect;
import mindustry.type.ItemStack;
import arc.graphics.Color;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.blocks.defense.turrets.PowerTurret;
import arc.Core;
public class AVCTurret{
    public static Block 
    waveGun, test;
        public static void load(){
            test = new PowerTurret("test") {{
                requirements(Category.turret, ItemStack.with(Items.silicon,1));
                health =999999999;
                size = 1;
                armor = 999999999;
                hasPower= true;
                consumesPower= true;
                consumePower(1f);
                shootType = new BasicBulletType(1,1){{
                    shootEffect = Fx.shootSmall;
                    despawnEffect = AVCLine.drawLine;
                }};
                
            }};
            waveGun = new PowerTurret("waveGun"){{
                requirements(Category.turret, ItemStack.with(Items.silicon, 100));
                hasPower = true;
                consumesPower = true;
                health = 10800;
                size = 2;
                armor = 3;
                inaccuracy = 1f;
                shootCone = 360f;
                rotateSpeed = 5f;
                range = 200;
                shootSound =  Core.audio.newSound(Core.files.internal("sounds/shootSound1")); //AI generated, yea idk how to use this shoot sound shih
                consumePower(5f);
                shootType = new BasicBulletType(15f, 2400f){{
                    sprite = "bullet1";
                    shrinkX = 0.1f;
                    shrinkY = 0.1f;
                    lifetime = 60f;
                    statusChance = 100;
                    status = StatusEffects.melting;
                    width = 22;
                    height = 32;
                    buildingDamageMultiplier = 0.1f;
                    despawnEffect = new WaveEffect(){{
                        lifetime = 2f;
                        sizeFrom = 2f;
                        sizeTo = 4f;
                        colorFrom = Color.valueOf("ff3a3aff");
                        colorTo = Color.valueOf("8f3a3aff");
                    }};
                    hitEffect = new ParticleEffect(){{
                        particles = 1;
                        region = "bigstar";
                        lifetime = 60f;
                        sizeFrom = 32;
                        sizeTo = 0;
                        line = false;
                        cone = 45f;
                        colorFrom = Color.valueOf("ff3a3aff");
                        colorTo = Color.valueOf("8f3a3aff");

                    }};
                    frontColor = Color.valueOf("ff3a3aff");
                    backColor = Color.valueOf("ffffffff");
                }};
            }};

}}