package net.zhadden1989.satisfactorymod.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zhadden1989.satisfactorymod.SatisfactoryMod;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SatisfactoryMod.MOD_ID);

// place items below here ----------------------------------------------------------------------------------------------

    public static final DeferredItem<Item> BUILD_GUN = ITEMS.register("build_gun",
            () -> new Item(new Item.Properties())); //equipment workbench t0p0

// place items above here ----------------------------------------------------------------------------------------------
    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
    }

}
