package com.ioniantropics.helloneoforge;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MyBlocks {
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HelloNeoForge.MODID);
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS
            .registerSimpleBlock(
                    "example_block",
                    BlockBehaviour.Properties.of().mapColor(MapColor.STONE)
            );
}
