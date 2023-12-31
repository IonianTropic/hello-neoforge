package com.ioniantropics.helloneoforge;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlocksRegister {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HelloNeoForge.MODID);

    public static final DeferredBlock<Block> RUBY_BLOCK = BLOCKS.registerSimpleBlock(
        "ruby_block",
        BlockBehaviour.Properties.of()
            .mapColor(MapColor.STONE)
            .strength(1.25f)
            .requiresCorrectToolForDrops()
    );
}
