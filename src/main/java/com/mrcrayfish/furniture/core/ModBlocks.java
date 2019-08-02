package com.mrcrayfish.furniture.core;

import com.mrcrayfish.furniture.FurnitureMod;
import com.mrcrayfish.furniture.Reference;
import com.mrcrayfish.furniture.block.*;
import com.mrcrayfish.furniture.util.BlockNames;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.PushReaction;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: MrCrayfish
 */
@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
    public static final Material WOOD = new Material(MaterialColor.WOOD, false, false, false, false, true, true, false, PushReaction.NORMAL);
    public static final Material STONE = new Material(MaterialColor.STONE, false, false, false, false, false, true, false, PushReaction.NORMAL);
    public static final Material WOOL = new Material(MaterialColor.STONE, false, false, false, false, false, true, false, PushReaction.NORMAL);

    private static final List<Block> BLOCKS = new ArrayList<>();
    private static final List<Item> ITEMS = new ArrayList<>();

    @ObjectHolder(value = BlockNames.TABLE_OAK)
    public static final Block TABLE_OAK = null;

    @ObjectHolder(value = BlockNames.TABLE_SPRUCE)
    public static final Block TABLE_SPRUCE = null;

    @ObjectHolder(value = BlockNames.TABLE_BIRCH)
    public static final Block TABLE_BIRCH = null;

    @ObjectHolder(value = BlockNames.TABLE_JUNGLE)
    public static final Block TABLE_JUNGLE = null;

    @ObjectHolder(value = BlockNames.TABLE_ACACIA)
    public static final Block TABLE_ACACIA = null;

    @ObjectHolder(value = BlockNames.TABLE_DARK_OAK)
    public static final Block TABLE_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.TABLE_STONE)
    public static final Block TABLE_STONE = null;

    @ObjectHolder(value = BlockNames.TABLE_GRANITE)
    public static final Block TABLE_GRANITE = null;

    @ObjectHolder(value = BlockNames.TABLE_DIORITE)
    public static final Block TABLE_DIORITE = null;

    @ObjectHolder(value = BlockNames.TABLE_ANDESITE)
    public static final Block TABLE_ANDESITE = null;

    @ObjectHolder(value = BlockNames.TABLE_STRIPPED_OAK)
    public static final Block TABLE_STRIPPED_OAK = null;

    @ObjectHolder(value = BlockNames.TABLE_STRIPPED_SPRUCE)
    public static final Block TABLE_STRIPPED_SPRUCE = null;

    @ObjectHolder(value = BlockNames.TABLE_STRIPPED_BIRCH)
    public static final Block TABLE_STRIPPED_BIRCH = null;

    @ObjectHolder(value = BlockNames.TABLE_STRIPPED_JUNGLE)
    public static final Block TABLE_STRIPPED_JUNGLE = null;

    @ObjectHolder(value = BlockNames.TABLE_STRIPPED_ACACIA)
    public static final Block TABLE_STRIPPED_ACACIA = null;

    @ObjectHolder(value = BlockNames.TABLE_STRIPPED_DARK_OAK)
    public static final Block TABLE_STRIPPED_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.CHAIR_OAK)
    public static final Block CHAIR_OAK = null;

    @ObjectHolder(value = BlockNames.CHAIR_SPRUCE)
    public static final Block CHAIR_SPRUCE = null;

    @ObjectHolder(value = BlockNames.CHAIR_BIRCH)
    public static final Block CHAIR_BIRCH = null;

    @ObjectHolder(value = BlockNames.CHAIR_JUNGLE)
    public static final Block CHAIR_JUNGLE = null;

    @ObjectHolder(value = BlockNames.CHAIR_ACACIA)
    public static final Block CHAIR_ACACIA = null;

    @ObjectHolder(value = BlockNames.CHAIR_DARK_OAK)
    public static final Block CHAIR_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.CHAIR_STONE)
    public static final Block CHAIR_STONE = null;

    @ObjectHolder(value = BlockNames.CHAIR_GRANITE)
    public static final Block CHAIR_GRANITE = null;

    @ObjectHolder(value = BlockNames.CHAIR_DIORITE)
    public static final Block CHAIR_DIORITE = null;

    @ObjectHolder(value = BlockNames.CHAIR_ANDESITE)
    public static final Block CHAIR_ANDESITE = null;

    @ObjectHolder(value = BlockNames.CHAIR_STRIPPED_OAK)
    public static final Block CHAIR_STRIPPED_OAK = null;

    @ObjectHolder(value = BlockNames.CHAIR_STRIPPED_SPRUCE)
    public static final Block CHAIR_STRIPPED_SPRUCE = null;

    @ObjectHolder(value = BlockNames.CHAIR_STRIPPED_BIRCH)
    public static final Block CHAIR_STRIPPED_BIRCH = null;

    @ObjectHolder(value = BlockNames.CHAIR_STRIPPED_JUNGLE)
    public static final Block CHAIR_STRIPPED_JUNGLE = null;

    @ObjectHolder(value = BlockNames.CHAIR_STRIPPED_ACACIA)
    public static final Block CHAIR_STRIPPED_ACACIA = null;

    @ObjectHolder(value = BlockNames.CHAIR_STRIPPED_DARK_OAK)
    public static final Block CHAIR_STRIPPED_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_OAK)
    public static final Block COFFEE_TABLE_OAK = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_SPRUCE)
    public static final Block COFFEE_TABLE_SPRUCE = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_BIRCH)
    public static final Block COFFEE_TABLE_BIRCH = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_JUNGLE)
    public static final Block COFFEE_TABLE_JUNGLE = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_ACACIA)
    public static final Block COFFEE_TABLE_ACACIA = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_DARK_OAK)
    public static final Block COFFEE_TABLE_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_STONE)
    public static final Block COFFEE_TABLE_STONE = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_GRANITE)
    public static final Block COFFEE_TABLE_GRANITE = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_DIORITE)
    public static final Block COFFEE_TABLE_DIORITE = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_ANDESITE)
    public static final Block COFFEE_TABLE_ANDESITE = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_STRIPPED_OAK)
    public static final Block COFFEE_TABLE_STRIPPED_OAK = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_STRIPPED_SPRUCE)
    public static final Block COFFEE_TABLE_STRIPPED_SPRUCE = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_STRIPPED_BIRCH)
    public static final Block COFFEE_TABLE_STRIPPED_BIRCH = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_STRIPPED_JUNGLE)
    public static final Block COFFEE_TABLE_STRIPPED_JUNGLE = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_STRIPPED_ACACIA)
    public static final Block COFFEE_TABLE_STRIPPED_ACACIA = null;

    @ObjectHolder(value = BlockNames.COFFEE_TABLE_STRIPPED_DARK_OAK)
    public static final Block COFFEE_TABLE_STRIPPED_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.CABINET_OAK)
    public static final Block CABINET_OAK = null;

    @ObjectHolder(value = BlockNames.CABINET_SPRUCE)
    public static final Block CABINET_SPRUCE = null;

    @ObjectHolder(value = BlockNames.CABINET_BIRCH)
    public static final Block CABINET_BIRCH = null;

    @ObjectHolder(value = BlockNames.CABINET_JUNGLE)
    public static final Block CABINET_JUNGLE = null;

    @ObjectHolder(value = BlockNames.CABINET_ACACIA)
    public static final Block CABINET_ACACIA = null;

    @ObjectHolder(value = BlockNames.CABINET_DARK_OAK)
    public static final Block CABINET_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.CABINET_STONE)
    public static final Block CABINET_STONE = null;

    @ObjectHolder(value = BlockNames.CABINET_GRANITE)
    public static final Block CABINET_GRANITE = null;

    @ObjectHolder(value = BlockNames.CABINET_DIORITE)
    public static final Block CABINET_DIORITE = null;

    @ObjectHolder(value = BlockNames.CABINET_ANDESITE)
    public static final Block CABINET_ANDESITE = null;

    @ObjectHolder(value = BlockNames.CABINET_STRIPPED_OAK)
    public static final Block CABINET_STRIPPED_OAK = null;

    @ObjectHolder(value = BlockNames.CABINET_STRIPPED_SPRUCE)
    public static final Block CABINET_STRIPPED_SPRUCE = null;

    @ObjectHolder(value = BlockNames.CABINET_STRIPPED_BIRCH)
    public static final Block CABINET_STRIPPED_BIRCH = null;

    @ObjectHolder(value = BlockNames.CABINET_STRIPPED_JUNGLE)
    public static final Block CABINET_STRIPPED_JUNGLE = null;

    @ObjectHolder(value = BlockNames.CABINET_STRIPPED_ACACIA)
    public static final Block CABINET_STRIPPED_ACACIA = null;

    @ObjectHolder(value = BlockNames.CABINET_STRIPPED_DARK_OAK)
    public static final Block CABINET_STRIPPED_DARK_OAK = null;
    
    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_OAK)
    public static final Block BEDSIDE_CABINET_OAK = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_SPRUCE)
    public static final Block BEDSIDE_CABINET_SPRUCE = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_BIRCH)
    public static final Block BEDSIDE_CABINET_BIRCH = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_JUNGLE)
    public static final Block BEDSIDE_CABINET_JUNGLE = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_ACACIA)
    public static final Block BEDSIDE_CABINET_ACACIA = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_DARK_OAK)
    public static final Block BEDSIDE_CABINET_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_STONE)
    public static final Block BEDSIDE_CABINET_STONE = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_GRANITE)
    public static final Block BEDSIDE_CABINET_GRANITE = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_DIORITE)
    public static final Block BEDSIDE_CABINET_DIORITE = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_ANDESITE)
    public static final Block BEDSIDE_CABINET_ANDESITE = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_STRIPPED_OAK)
    public static final Block BEDSIDE_CABINET_STRIPPED_OAK = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_STRIPPED_SPRUCE)
    public static final Block BEDSIDE_CABINET_STRIPPED_SPRUCE = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_STRIPPED_BIRCH)
    public static final Block BEDSIDE_CABINET_STRIPPED_BIRCH = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_STRIPPED_JUNGLE)
    public static final Block BEDSIDE_CABINET_STRIPPED_JUNGLE = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_STRIPPED_ACACIA)
    public static final Block BEDSIDE_CABINET_STRIPPED_ACACIA = null;

    @ObjectHolder(value = BlockNames.BEDSIDE_CABINET_STRIPPED_DARK_OAK)
    public static final Block BEDSIDE_CABINET_STRIPPED_DARK_OAK = null;
    
    @ObjectHolder(value = BlockNames.DESK_OAK)
    public static final Block DESK_OAK = null;

    @ObjectHolder(value = BlockNames.DESK_SPRUCE)
    public static final Block DESK_SPRUCE = null;

    @ObjectHolder(value = BlockNames.DESK_BIRCH)
    public static final Block DESK_BIRCH = null;

    @ObjectHolder(value = BlockNames.DESK_JUNGLE)
    public static final Block DESK_JUNGLE = null;

    @ObjectHolder(value = BlockNames.DESK_ACACIA)
    public static final Block DESK_ACACIA = null;

    @ObjectHolder(value = BlockNames.DESK_DARK_OAK)
    public static final Block DESK_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.DESK_STONE)
    public static final Block DESK_STONE = null;

    @ObjectHolder(value = BlockNames.DESK_GRANITE)
    public static final Block DESK_GRANITE = null;

    @ObjectHolder(value = BlockNames.DESK_DIORITE)
    public static final Block DESK_DIORITE = null;

    @ObjectHolder(value = BlockNames.DESK_ANDESITE)
    public static final Block DESK_ANDESITE = null;

    @ObjectHolder(value = BlockNames.DESK_STRIPPED_OAK)
    public static final Block DESK_STRIPPED_OAK = null;

    @ObjectHolder(value = BlockNames.DESK_STRIPPED_SPRUCE)
    public static final Block DESK_STRIPPED_SPRUCE = null;

    @ObjectHolder(value = BlockNames.DESK_STRIPPED_BIRCH)
    public static final Block DESK_STRIPPED_BIRCH = null;

    @ObjectHolder(value = BlockNames.DESK_STRIPPED_JUNGLE)
    public static final Block DESK_STRIPPED_JUNGLE = null;

    @ObjectHolder(value = BlockNames.DESK_STRIPPED_ACACIA)
    public static final Block DESK_STRIPPED_ACACIA = null;

    @ObjectHolder(value = BlockNames.DESK_STRIPPED_DARK_OAK)
    public static final Block DESK_STRIPPED_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_OAK)
    public static final Block DESK_CABINET_OAK = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_SPRUCE)
    public static final Block DESK_CABINET_SPRUCE = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_BIRCH)
    public static final Block DESK_CABINET_BIRCH = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_JUNGLE)
    public static final Block DESK_CABINET_JUNGLE = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_ACACIA)
    public static final Block DESK_CABINET_ACACIA = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_DARK_OAK)
    public static final Block DESK_CABINET_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_STONE)
    public static final Block DESK_CABINET_STONE = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_GRANITE)
    public static final Block DESK_CABINET_GRANITE = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_DIORITE)
    public static final Block DESK_CABINET_DIORITE = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_ANDESITE)
    public static final Block DESK_CABINET_ANDESITE = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_STRIPPED_OAK)
    public static final Block DESK_CABINET_STRIPPED_OAK = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_STRIPPED_SPRUCE)
    public static final Block DESK_CABINET_STRIPPED_SPRUCE = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_STRIPPED_BIRCH)
    public static final Block DESK_CABINET_STRIPPED_BIRCH = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_STRIPPED_JUNGLE)
    public static final Block DESK_CABINET_STRIPPED_JUNGLE = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_STRIPPED_ACACIA)
    public static final Block DESK_CABINET_STRIPPED_ACACIA = null;

    @ObjectHolder(value = BlockNames.DESK_CABINET_STRIPPED_DARK_OAK)
    public static final Block DESK_CABINET_STRIPPED_DARK_OAK = null;

    @ObjectHolder(value = BlockNames.SOFA_WHITE)
    public static final Block SOFA_WHITE = null;

    @ObjectHolder(value = BlockNames.SOFA_ORANGE)
    public static final Block SOFA_ORANGE = null;

    @ObjectHolder(value = BlockNames.SOFA_MAGENTA)
    public static final Block SOFA_MAGENTA = null;

    @ObjectHolder(value = BlockNames.SOFA_LIGHT_BLUE)
    public static final Block SOFA_LIGHT_BLUE = null;

    @ObjectHolder(value = BlockNames.SOFA_YELLOW)
    public static final Block SOFA_YELLOW = null;

    @ObjectHolder(value = BlockNames.SOFA_LIME)
    public static final Block SOFA_LIME = null;

    @ObjectHolder(value = BlockNames.SOFA_PINK)
    public static final Block SOFA_PINK = null;

    @ObjectHolder(value = BlockNames.SOFA_GRAY)
    public static final Block SOFA_GRAY = null;

    @ObjectHolder(value = BlockNames.SOFA_LIGHT_GRAY)
    public static final Block SOFA_LIGHT_GRAY = null;

    @ObjectHolder(value = BlockNames.SOFA_CYAN)
    public static final Block SOFA_CYAN = null;

    @ObjectHolder(value = BlockNames.SOFA_PURPLE)
    public static final Block SOFA_PURPLE = null;

    @ObjectHolder(value = BlockNames.SOFA_BLUE)
    public static final Block SOFA_BLUE = null;

    @ObjectHolder(value = BlockNames.SOFA_BROWN)
    public static final Block SOFA_BROWN = null;

    @ObjectHolder(value = BlockNames.SOFA_GREEN)
    public static final Block SOFA_GREEN = null;

    @ObjectHolder(value = BlockNames.SOFA_RED)
    public static final Block SOFA_RED = null;

    @ObjectHolder(value = BlockNames.SOFA_BLACK)
    public static final Block SOFA_BLACK = null;

    @ObjectHolder(value = BlockNames.SOFA_RAINBOW)
    public static final Block SOFA_RAINBOW = null;

    static
    {
        register(BlockNames.TABLE_OAK, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_SPRUCE, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_BIRCH, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_JUNGLE, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_ACACIA, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_DARK_OAK, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_STONE, new TableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.TABLE_GRANITE, new TableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.TABLE_DIORITE, new TableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.TABLE_ANDESITE, new TableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.TABLE_STRIPPED_OAK, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_STRIPPED_SPRUCE, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_STRIPPED_BIRCH, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_STRIPPED_JUNGLE, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_STRIPPED_ACACIA, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.TABLE_STRIPPED_DARK_OAK, new TableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_OAK, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_SPRUCE, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_BIRCH, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_JUNGLE, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_ACACIA, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_DARK_OAK, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_STONE, new ChairBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.CHAIR_GRANITE, new ChairBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.CHAIR_DIORITE, new ChairBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.CHAIR_ANDESITE, new ChairBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.CHAIR_STRIPPED_OAK, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_STRIPPED_SPRUCE, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_STRIPPED_BIRCH, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_STRIPPED_JUNGLE, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_STRIPPED_ACACIA, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CHAIR_STRIPPED_DARK_OAK, new ChairBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_OAK, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_SPRUCE, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_BIRCH, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_JUNGLE, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_ACACIA, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_DARK_OAK, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_STONE, new CoffeeTableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.COFFEE_TABLE_GRANITE, new CoffeeTableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.COFFEE_TABLE_DIORITE, new CoffeeTableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.COFFEE_TABLE_ANDESITE, new CoffeeTableBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.COFFEE_TABLE_STRIPPED_OAK, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_STRIPPED_SPRUCE, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_STRIPPED_BIRCH, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_STRIPPED_JUNGLE, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_STRIPPED_ACACIA, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.COFFEE_TABLE_STRIPPED_DARK_OAK, new CoffeeTableBlock(Block.Properties.create(WOOD).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_OAK, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_SPRUCE, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_BIRCH, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_JUNGLE, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_ACACIA, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_DARK_OAK, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_STONE, new CabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.CABINET_GRANITE, new CabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.CABINET_DIORITE, new CabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.CABINET_ANDESITE, new CabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.CABINET_STRIPPED_OAK, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_STRIPPED_SPRUCE, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_STRIPPED_BIRCH, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_STRIPPED_JUNGLE, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_STRIPPED_ACACIA, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.CABINET_STRIPPED_DARK_OAK, new CabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_OAK, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_SPRUCE, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_BIRCH, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_JUNGLE, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_ACACIA, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_DARK_OAK, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_STONE, new BedsideCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.BEDSIDE_CABINET_GRANITE, new BedsideCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.BEDSIDE_CABINET_DIORITE, new BedsideCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.BEDSIDE_CABINET_ANDESITE, new BedsideCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE)));
        register(BlockNames.BEDSIDE_CABINET_STRIPPED_OAK, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_STRIPPED_SPRUCE, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_STRIPPED_BIRCH, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_STRIPPED_JUNGLE, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_STRIPPED_ACACIA, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.BEDSIDE_CABINET_STRIPPED_DARK_OAK, new BedsideCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD)));
        register(BlockNames.DESK_OAK, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.OAK));
        register(BlockNames.DESK_SPRUCE, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.BIRCH));
        register(BlockNames.DESK_BIRCH, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.SPRUCE));
        register(BlockNames.DESK_JUNGLE, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.JUNGLE));
        register(BlockNames.DESK_ACACIA, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.ACACIA));
        register(BlockNames.DESK_DARK_OAK, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.DARK_OAK));
        register(BlockNames.DESK_STONE, new DeskBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.STONE));
        register(BlockNames.DESK_GRANITE, new DeskBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.GRANITE));
        register(BlockNames.DESK_DIORITE, new DeskBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.DIORITE));
        register(BlockNames.DESK_ANDESITE, new DeskBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.ANDESITE));
        register(BlockNames.DESK_STRIPPED_OAK, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_OAK));
        register(BlockNames.DESK_STRIPPED_SPRUCE, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_BIRCH));
        register(BlockNames.DESK_STRIPPED_BIRCH, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_SPRUCE));
        register(BlockNames.DESK_STRIPPED_JUNGLE, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_JUNGLE));
        register(BlockNames.DESK_STRIPPED_ACACIA, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_ACACIA));
        register(BlockNames.DESK_STRIPPED_DARK_OAK, new DeskBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_DARK_OAK));
        register(BlockNames.DESK_CABINET_OAK, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.OAK));
        register(BlockNames.DESK_CABINET_SPRUCE, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.BIRCH));
        register(BlockNames.DESK_CABINET_BIRCH, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.SPRUCE));
        register(BlockNames.DESK_CABINET_JUNGLE, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.JUNGLE));
        register(BlockNames.DESK_CABINET_ACACIA, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.ACACIA));
        register(BlockNames.DESK_CABINET_DARK_OAK, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.DARK_OAK));
        register(BlockNames.DESK_CABINET_STONE, new DeskCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.STONE));
        register(BlockNames.DESK_CABINET_GRANITE, new DeskCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.GRANITE));
        register(BlockNames.DESK_CABINET_DIORITE, new DeskCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.DIORITE));
        register(BlockNames.DESK_CABINET_ANDESITE, new DeskCabinetBlock(Block.Properties.create(STONE).hardnessAndResistance(1.0F).sound(SoundType.STONE), DeskBlock.MaterialType.ANDESITE));
        register(BlockNames.DESK_CABINET_STRIPPED_OAK, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_OAK));
        register(BlockNames.DESK_CABINET_STRIPPED_SPRUCE, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_BIRCH));
        register(BlockNames.DESK_CABINET_STRIPPED_BIRCH, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_SPRUCE));
        register(BlockNames.DESK_CABINET_STRIPPED_JUNGLE, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_JUNGLE));
        register(BlockNames.DESK_CABINET_STRIPPED_ACACIA, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_ACACIA));
        register(BlockNames.DESK_CABINET_STRIPPED_DARK_OAK, new DeskCabinetBlock(Block.Properties.create(WOOD).hardnessAndResistance(1.0F).sound(SoundType.WOOD), DeskBlock.MaterialType.STRIPPED_DARK_OAK));
        register(BlockNames.SOFA_WHITE, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.SNOW).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_ORANGE, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.ADOBE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_MAGENTA, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.MAGENTA).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_LIGHT_BLUE, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.LIGHT_BLUE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_YELLOW, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.YELLOW).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_LIME, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.LIME).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_PINK, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.PINK).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_GRAY, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.GRAY).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_LIGHT_GRAY, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.LIGHT_GRAY).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_CYAN, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.CYAN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_PURPLE, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.PURPLE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_BLUE, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.BLUE).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_BROWN, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.BROWN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_GREEN, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.GREEN).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_RED, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.RED).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_BLACK, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.BLACK).hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
        register(BlockNames.SOFA_RAINBOW, new SofaBlock(Block.Properties.create(WOOL, MaterialColor.SNOW).hardnessAndResistance(0.5F).sound(SoundType.WOOD)), new Item.Properties());
    }

    private static void register(String name, Block block)
    {
        register(name, block, new Item.Properties().group(FurnitureMod.GROUP));
    }

    private static void register(String name, Block block, Item.Properties properties)
    {
        register(name, block, new BlockItem(block, properties));
    }

    private static void register(String name, Block block, BlockItem item)
    {
        block.setRegistryName(name);
        BLOCKS.add(block);
        if(block.getRegistryName() != null)
        {
            item.setRegistryName(name);
            ITEMS.add(item);
        }
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        BLOCKS.forEach(block -> event.getRegistry().register(block));
        BLOCKS.clear();
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        ITEMS.forEach(item -> event.getRegistry().register(item));
        ITEMS.clear();
    }
}