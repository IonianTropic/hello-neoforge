package com.ioniantropics.helloneoforge;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CreativeModeTabsRegister {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HelloNeoForge.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register(
        "example_tab", () -> CreativeModeTab.builder()
            .title(Component.translatable(HelloNeoForge.MOD_NAME))
            .withTabsBefore(net.minecraft.world.item.CreativeModeTabs.COMBAT)
            .icon(() -> ItemsRegister.RUBY.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemsRegister.RUBY.get());
                output.accept(ItemsRegister.RUBY_BLOCK_ITEM.get());
            })
            .build()
    );

    static public void addCreative(BuildCreativeModeTabContentsEvent event) {
//        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
//            event.accept(MyItems.EXAMPLE_BLOCK_ITEM);
//        }
    }
}
