package com.breastmod.common;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.createBlockEntities("breastmod");

    public static final var BREAST_BE = BLOCK_ENTITIES.register("breast_block_entity",
            () -> BlockEntityType.Builder.of(BreastBlockEntity::new,
                    ModBlocks.LEFT_BREAST.get(), ModBlocks.RIGHT_BREAST.get()).build(null));
}
