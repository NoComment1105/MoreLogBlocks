/*
 * Copyright (c) 2021 NoComment1105 <nocomment1105@outlook.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.nocomment1105.morelogblocks.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.nocomment1105.morelogblocks.MoreLogBlocks.MOD_ID;

/**
 * Contains all the Items of MoreLogBlocs
 */
public class ItemRegistry {
    /*
    Follows Stair Slab Stair Slab format
     */
    public static final Item OAK_LOG_STAIRS = new BlockItem(BlockRegistry.OAK_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item OAK_LOG_SLAB = new BlockItem(BlockRegistry.OAK_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item SPRUCE_LOG_STAIRS =  new BlockItem(BlockRegistry.SPRUCE_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item SPRUCE_LOG_SLAB = new BlockItem(BlockRegistry.SPRUCE_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item BIRCH_LOG_STAIRS = new BlockItem(BlockRegistry.BIRCH_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item BIRCH_LOG_SLAB = new BlockItem(BlockRegistry.BIRCH_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item JUNGLE_LOG_STAIRS = new BlockItem(BlockRegistry.JUNGLE_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item JUNGLE_LOG_SLAB = new BlockItem(BlockRegistry.JUNGLE_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item ACACIA_LOG_STAIRS = new BlockItem(BlockRegistry.ACACIA_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item ACACIA_LOG_SLAB = new BlockItem(BlockRegistry.ACACIA_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DARK_OAK_LOG_STAIRS = new BlockItem(BlockRegistry.DARK_OAK_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DARK_OAK_LOG_SLAB = new BlockItem(BlockRegistry.DARK_OAK_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item CRIMSON_STEM_STAIRS = new BlockItem(BlockRegistry.CRIMSON_STEM_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item CRIMSON_STEM_SLAB = new BlockItem(BlockRegistry.CRIMSON_STEM_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item WARPED_STEM_STAIRS = new BlockItem(BlockRegistry.WARPED_STEM_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item WARPED_STEM_SLAB = new BlockItem(BlockRegistry.WARPED_STEM_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    // Wood

    public static final Item OAK_WOOD_STAIRS = new BlockItem(BlockRegistry.OAK_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item OAK_WOOD_SLAB = new BlockItem(BlockRegistry.OAK_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item SPRUCE_WOOD_STAIRS =  new BlockItem(BlockRegistry.SPRUCE_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item SPRUCE_WOOD_SLAB = new BlockItem(BlockRegistry.SPRUCE_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item BIRCH_WOOD_STAIRS = new BlockItem(BlockRegistry.BIRCH_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item BIRCH_WOOD_SLAB = new BlockItem(BlockRegistry.BIRCH_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item JUNGLE_WOOD_STAIRS = new BlockItem(BlockRegistry.JUNGLE_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item JUNGLE_WOOD_SLAB = new BlockItem(BlockRegistry.JUNGLE_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item ACACIA_WOOD_STAIRS = new BlockItem(BlockRegistry.ACACIA_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item ACACIA_WOOD_SLAB = new BlockItem(BlockRegistry.ACACIA_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DARK_OAK_WOOD_STAIRS = new BlockItem(BlockRegistry.DARK_OAK_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item DARK_OAK_WOOD_SLAB = new BlockItem(BlockRegistry.DARK_OAK_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item CRIMSON_HYPHAE_STAIRS = new BlockItem(BlockRegistry.CRIMSON_HYPHAE_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item CRIMSON_HYPHAE_SLAB = new BlockItem(BlockRegistry.CRIMSON_HYPHAE_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item WARPED_HYPHAE_STAIRS = new BlockItem(BlockRegistry.WARPED_HYPHAE_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item WARPED_HYPHAE_SLAB = new BlockItem(BlockRegistry.WARPED_HYPHAE_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Item STRIPPED_OAK_LOG_STAIRS = new BlockItem(BlockRegistry.STRIPPED_OAK_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_OAK_LOG_SLAB = new BlockItem(BlockRegistry.STRIPPED_OAK_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_SPRUCE_LOG_STAIRS =  new BlockItem(BlockRegistry.STRIPPED_SPRUCE_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_SPRUCE_LOG_SLAB = new BlockItem(BlockRegistry.STRIPPED_SPRUCE_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_BIRCH_LOG_STAIRS = new BlockItem(BlockRegistry.STRIPPED_BIRCH_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_BIRCH_LOG_SLAB = new BlockItem(BlockRegistry.STRIPPED_BIRCH_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_JUNGLE_LOG_STAIRS = new BlockItem(BlockRegistry.STRIPPED_JUNGLE_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_JUNGLE_LOG_SLAB = new BlockItem(BlockRegistry.STRIPPED_JUNGLE_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_ACACIA_LOG_STAIRS = new BlockItem(BlockRegistry.STRIPPED_ACACIA_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_ACACIA_LOG_SLAB = new BlockItem(BlockRegistry.STRIPPED_ACACIA_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_DARK_OAK_LOG_STAIRS = new BlockItem(BlockRegistry.STRIPPED_DARK_OAK_LOG_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_DARK_OAK_LOG_SLAB = new BlockItem(BlockRegistry.STRIPPED_DARK_OAK_LOG_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_CRIMSON_STEM_STAIRS = new BlockItem(BlockRegistry.STRIPPED_CRIMSON_STEM_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_CRIMSON_STEM_SLAB = new BlockItem(BlockRegistry.STRIPPED_CRIMSON_STEM_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_WARPED_STEM_STAIRS = new BlockItem(BlockRegistry.STRIPPED_WARPED_STEM_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_WARPED_STEM_SLAB = new BlockItem(BlockRegistry.STRIPPED_WARPED_STEM_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    // Wood

    public static final Item STRIPPED_OAK_WOOD_STAIRS = new BlockItem(BlockRegistry.STRIPPED_OAK_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_OAK_WOOD_SLAB = new BlockItem(BlockRegistry.STRIPPED_OAK_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_SPRUCE_WOOD_STAIRS =  new BlockItem(BlockRegistry.STRIPPED_SPRUCE_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_SPRUCE_WOOD_SLAB = new BlockItem(BlockRegistry.STRIPPED_SPRUCE_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_BIRCH_WOOD_STAIRS = new BlockItem(BlockRegistry.STRIPPED_BIRCH_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_BIRCH_WOOD_SLAB = new BlockItem(BlockRegistry.STRIPPED_BIRCH_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_JUNGLE_WOOD_STAIRS = new BlockItem(BlockRegistry.STRIPPED_JUNGLE_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_JUNGLE_WOOD_SLAB = new BlockItem(BlockRegistry.STRIPPED_JUNGLE_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_ACACIA_WOOD_STAIRS = new BlockItem(BlockRegistry.STRIPPED_ACACIA_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_ACACIA_WOOD_SLAB = new BlockItem(BlockRegistry.STRIPPED_ACACIA_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_DARK_OAK_WOOD_STAIRS = new BlockItem(BlockRegistry.STRIPPED_DARK_OAK_WOOD_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_DARK_OAK_WOOD_SLAB = new BlockItem(BlockRegistry.STRIPPED_DARK_OAK_WOOD_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_CRIMSON_HYPHAE_STAIRS = new BlockItem(BlockRegistry.STRIPPED_CRIMSON_HYPHAE_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_CRIMSON_HYPHAE_SLAB = new BlockItem(BlockRegistry.STRIPPED_CRIMSON_HYPHAE_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_WARPED_HYPHAE_STAIRS = new BlockItem(BlockRegistry.STRIPPED_WARPED_HYPHAE_STAIRS,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item STRIPPED_WARPED_HYPHAE_SLAB = new BlockItem(BlockRegistry.STRIPPED_WARPED_HYPHAE_SLAB,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_log_stairs"), OAK_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_log_slab"), OAK_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_log_stairs"), SPRUCE_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_log_slab"), SPRUCE_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_log_stairs"), BIRCH_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_log_slab"), BIRCH_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_log_stairs"), JUNGLE_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_log_slab"), JUNGLE_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_log_stairs"), ACACIA_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_log_slab"), ACACIA_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_log_stairs"), DARK_OAK_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_log_slab"), DARK_OAK_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson_stem_stairs"), CRIMSON_STEM_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson_stem_slab"), CRIMSON_STEM_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_stem_stairs"), WARPED_STEM_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_stem_slab"), WARPED_STEM_SLAB);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_wood_stairs"), OAK_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_wood_slab"), OAK_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_wood_stairs"), SPRUCE_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_wood_slab"), SPRUCE_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_wood_stairs"), BIRCH_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_wood_slab"), BIRCH_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_wood_stairs"), JUNGLE_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_wood_slab"), JUNGLE_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_wood_stairs"), ACACIA_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_wood_slab"), ACACIA_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_wood_stairs"), DARK_OAK_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_wood_slab"), DARK_OAK_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson_hyphae_stairs"), CRIMSON_HYPHAE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson_hyphae_slab"), CRIMSON_HYPHAE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_hyphae_stairs"), WARPED_HYPHAE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_hyphae_slab"), WARPED_HYPHAE_SLAB);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_log_stairs"), STRIPPED_OAK_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_log_slab"), STRIPPED_OAK_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_log_stairs"), STRIPPED_SPRUCE_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_log_slab"), STRIPPED_SPRUCE_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_log_stairs"), STRIPPED_BIRCH_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_log_slab"), STRIPPED_BIRCH_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_log_stairs"), STRIPPED_JUNGLE_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_log_slab"), STRIPPED_JUNGLE_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_log_stairs"), STRIPPED_ACACIA_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_log_slab"), STRIPPED_ACACIA_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_log_stairs"), STRIPPED_DARK_OAK_LOG_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_log_slab"), STRIPPED_DARK_OAK_LOG_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_crimson_stem_stairs"), STRIPPED_CRIMSON_STEM_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_crimson_stem_slab"), STRIPPED_CRIMSON_STEM_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_warped_stem_stairs"), STRIPPED_WARPED_STEM_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_warped_stem_slab"), STRIPPED_WARPED_STEM_SLAB);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_wood_stairs"), STRIPPED_OAK_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_wood_slab"), STRIPPED_OAK_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_wood_stairs"), STRIPPED_SPRUCE_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_wood_slab"), STRIPPED_SPRUCE_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_wood_stairs"), STRIPPED_BIRCH_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_wood_slab"), STRIPPED_BIRCH_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_wood_stairs"), STRIPPED_JUNGLE_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_wood_slab"), STRIPPED_JUNGLE_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_wood_stairs"), STRIPPED_ACACIA_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_wood_slab"), STRIPPED_ACACIA_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_wood_stairs"), STRIPPED_DARK_OAK_WOOD_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_wood_slab"), STRIPPED_DARK_OAK_WOOD_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_crimson_hyphae_stairs"), STRIPPED_CRIMSON_HYPHAE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_crimson_hyphae_slab"), STRIPPED_CRIMSON_HYPHAE_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_warped_hyphae_stairs"), STRIPPED_WARPED_HYPHAE_STAIRS);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_warped_hyphae_slab"), STRIPPED_WARPED_HYPHAE_SLAB);
    }
}
