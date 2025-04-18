package net.zhadden1989.satisfactorymod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.zhadden1989.satisfactorymod.SatisfactoryMod;
import net.zhadden1989.satisfactorymod.block.custom.Crafting_StationBlock;
import net.zhadden1989.satisfactorymod.items.Moditems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SatisfactoryMod.MOD_ID);

// place blocks below here ---------------------------------------------------------------------------------------------

    public static final DeferredBlock<Block> CRAFTING_STATION = registerBlock("crafting_station",
            () -> new Crafting_StationBlock(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));

    public static final DeferredBlock<Block> EQUIPMENT_WORKSHOP = registerBlock("equipment_workshop",
            () -> new Block(BlockBehaviour.Properties.of().strength(4f).noOcclusion()));



// place blocks above here ---------------------------------------------------------------------------------------------

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
