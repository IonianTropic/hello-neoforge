package com.ioniantropics.helloneoforge;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemsRegister {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HelloNeoForge.MODID);

    public static final DeferredItem<BlockItem> RUBY_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(
        "ruby_block",
        BlocksRegister.RUBY_BLOCK
    );

    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem(
        "ruby",
        new Item.Properties()
    );
}
