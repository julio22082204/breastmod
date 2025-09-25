package com.breastmod;

import com.breastmod.common.ModBlocks;
import com.breastmod.common.ModBlockEntities;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BreastMod.MODID)
public class BreastMod {
    public static final String MODID = "breastmod";

    public BreastMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.BLOCKS.register(bus);
        ModBlockEntities.BLOCK_ENTITIES.register(bus);
    }
}
