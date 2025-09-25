package com.breastmod.common;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks("breastmod");

    public static final DeferredBlock<BreastBlock> LEFT_BREAST = BLOCKS.register("left_breast",
            () -> new BreastBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(1.0f).noOcclusion()));

    public static final DeferredBlock<BreastBlock> RIGHT_BREAST = BLOCKS.register("right_breast",
            () -> new BreastBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).strength(1.0f).noOcclusion()));
}
