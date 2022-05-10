package net.hugoroyic.moredecorations.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hugoroyic.moredecorations.MoreDecorations;
import net.hugoroyic.moredecorations.block.custom.ModStairsBlock;
import net.minecraft.block.AbstractBlock.Settings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", new SlabBlock(Settings.copy(Blocks.WHITE_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", new SlabBlock(Settings.copy(Blocks.ORANGE_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", new SlabBlock(Settings.copy(Blocks.MAGENTA_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", new SlabBlock(Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", new SlabBlock(Settings.copy(Blocks.YELLOW_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", new SlabBlock(Settings.copy(Blocks.LIME_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", new SlabBlock(Settings.copy(Blocks.PINK_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", new SlabBlock(Settings.copy(Blocks.GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", new SlabBlock(Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", new SlabBlock(Settings.copy(Blocks.CYAN_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", new SlabBlock(Settings.copy(Blocks.PURPLE_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", new SlabBlock(Settings.copy(Blocks.BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", new SlabBlock(Settings.copy(Blocks.BROWN_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", new SlabBlock(Settings.copy(Blocks.GREEN_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", new SlabBlock(Settings.copy(Blocks.RED_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", new SlabBlock(Settings.copy(Blocks.BLACK_CONCRETE)), ItemGroup.BUILDING_BLOCKS);

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs", new ModStairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), Settings.copy(Blocks.WHITE_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs", new ModStairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), Settings.copy(Blocks.ORANGE_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs", new ModStairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), Settings.copy(Blocks.MAGENTA_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs", new ModStairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs", new ModStairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), Settings.copy(Blocks.YELLOW_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs", new ModStairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), Settings.copy(Blocks.LIME_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs", new ModStairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), Settings.copy(Blocks.PINK_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs", new ModStairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), Settings.copy(Blocks.GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs", new ModStairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs", new ModStairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), Settings.copy(Blocks.CYAN_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs", new ModStairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), Settings.copy(Blocks.PURPLE_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs", new ModStairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), Settings.copy(Blocks.BLUE_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs", new ModStairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), Settings.copy(Blocks.BROWN_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs", new ModStairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), Settings.copy(Blocks.GREEN_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs", new ModStairsBlock(Blocks.RED_CONCRETE.getDefaultState(), Settings.copy(Blocks.RED_CONCRETE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs", new ModStairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), Settings.copy(Blocks.BLACK_CONCRETE)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MoreDecorations.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(MoreDecorations.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MoreDecorations.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MoreDecorations.LOGGER.info("Registering ModBlocks for " + MoreDecorations.MOD_ID);
    }
}
