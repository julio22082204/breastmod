package com.breastmod.common;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BreastBlockEntity extends BlockEntity {
    public BreastBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.BREAST_BE.get(), pos, state);
    }
}
