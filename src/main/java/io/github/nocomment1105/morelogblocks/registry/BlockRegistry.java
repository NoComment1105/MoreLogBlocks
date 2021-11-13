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

import io.github.nocomment1105.morelogblocks.block.MoreLogStairBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static io.github.nocomment1105.morelogblocks.MoreLogBlocks.MOD_ID;
import static net.minecraft.block.Blocks.*;

/**
 * Contains all the Blocks of MoreLogBlocks
 */
public class BlockRegistry {
    /*
    Follows Stair Slab Stair Slab format
     */
    public static final Block OAK_LOG_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
            Material.WOOD, MapColor.OAK_TAN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block SPRUCE_LOG_STAIRS = new MoreLogStairBlock(
            SPRUCE_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.SPRUCE_BROWN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
            Material.WOOD, MapColor.SPRUCE_BROWN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BIRCH_LOG_STAIRS = new MoreLogStairBlock(
            BIRCH_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.PALE_YELLOW)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
            Material.WOOD, MapColor.PALE_YELLOW).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block JUNGLE_LOG_STAIRS = new MoreLogStairBlock(
            JUNGLE_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.DIRT_BROWN).
            requiresTool().strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
            Material.WOOD, MapColor.DIRT_BROWN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block ACACIA_LOG_STAIRS = new MoreLogStairBlock(
            ACACIA_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.ORANGE)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
            Material.WOOD, MapColor.ORANGE).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block DARK_OAK_LOG_STAIRS = new MoreLogStairBlock(
            DARK_OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.BROWN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block DARK_OAK_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
            Material.WOOD, MapColor.BROWN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block CRIMSON_STEM_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD, MapColor.DULL_PINK)
            .strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block CRIMSON_STEM_SLAB = new SlabBlock(FabricBlockSettings.of(
            Material.NETHER_WOOD, MapColor.DULL_PINK).strength(2.0f)
            .sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block WARPED_STEM_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD, MapColor.DARK_AQUA)
            .strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block WARPED_STEM_SLAB = new SlabBlock(FabricBlockSettings.of(
            Material.NETHER_WOOD, MapColor.DARK_AQUA).strength(2.0f)
            .sounds(BlockSoundGroup.NETHER_STEM));

    // Stripped Logs

    public static final Block STRIPPED_OAK_LOG_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_OAK_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.OAK_TAN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_SPRUCE_LOG_STAIRS = new MoreLogStairBlock(
            SPRUCE_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.SPRUCE_BROWN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_SPRUCE_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.SPRUCE_BROWN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_BIRCH_LOG_STAIRS = new MoreLogStairBlock(
            BIRCH_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.PALE_YELLOW)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_BIRCH_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.PALE_YELLOW).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_JUNGLE_LOG_STAIRS = new MoreLogStairBlock(
            JUNGLE_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.DIRT_BROWN).
            requiresTool().strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_JUNGLE_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.DIRT_BROWN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_ACACIA_LOG_STAIRS = new MoreLogStairBlock(
            ACACIA_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.ORANGE)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_ACACIA_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.ORANGE).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_DARK_OAK_LOG_STAIRS = new MoreLogStairBlock(
            DARK_OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.BROWN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_DARK_OAK_LOG_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.BROWN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_CRIMSON_STEM_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD, MapColor.DULL_PINK)
            .strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block STRIPPED_CRIMSON_STEM_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.NETHER_WOOD, MapColor.DULL_PINK).strength(2.0f)
            .sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block STRIPPED_WARPED_STEM_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD, MapColor.DARK_AQUA)
            .strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block STRIPPED_WARPED_STEM_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.NETHER_WOOD, MapColor.DARK_AQUA).strength(2.0f)
            .sounds(BlockSoundGroup.NETHER_STEM));

    // Wood

    public static final Block OAK_WOOD_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block OAK_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.OAK_TAN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block SPRUCE_WOOD_STAIRS = new MoreLogStairBlock(
            SPRUCE_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.SPRUCE_BROWN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block SPRUCE_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.SPRUCE_BROWN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block BIRCH_WOOD_STAIRS = new MoreLogStairBlock(
            BIRCH_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.PALE_YELLOW)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block BIRCH_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.PALE_YELLOW).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block JUNGLE_WOOD_STAIRS = new MoreLogStairBlock(
            JUNGLE_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.DIRT_BROWN).
            requiresTool().strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block JUNGLE_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.DIRT_BROWN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block ACACIA_WOOD_STAIRS = new MoreLogStairBlock(
            ACACIA_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.GRAY)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block ACACIA_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.GRAY).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block DARK_OAK_WOOD_STAIRS = new MoreLogStairBlock(
            DARK_OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block DARK_OAK_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.OAK_TAN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block CRIMSON_HYPHAE_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD, MapColor.DARK_CRIMSON)
            .strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block CRIMSON_HYPHAE_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.NETHER_WOOD, MapColor.DARK_CRIMSON).strength(2.0f)
            .sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block WARPED_HYPHAE_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD, MapColor.DARK_DULL_PINK)
            .strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block WARPED_HYPHAE_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.NETHER_WOOD, MapColor.DARK_DULL_PINK).strength(2.0f)
            .sounds(BlockSoundGroup.NETHER_STEM));

    // Stripped Wood

    public static final Block STRIPPED_OAK_WOOD_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_OAK_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.OAK_TAN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_SPRUCE_WOOD_STAIRS = new MoreLogStairBlock(
            SPRUCE_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.SPRUCE_BROWN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_SPRUCE_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.SPRUCE_BROWN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_BIRCH_WOOD_STAIRS = new MoreLogStairBlock(
            BIRCH_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.PALE_YELLOW)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_BIRCH_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.PALE_YELLOW).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_JUNGLE_WOOD_STAIRS = new MoreLogStairBlock(
            JUNGLE_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.DIRT_BROWN).
            requiresTool().strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_JUNGLE_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.DIRT_BROWN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_ACACIA_WOOD_STAIRS = new MoreLogStairBlock(
            ACACIA_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.GRAY)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_ACACIA_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.GRAY).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_DARK_OAK_WOOD_STAIRS = new MoreLogStairBlock(
            DARK_OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN)
            .strength(2.0f).sounds(BlockSoundGroup.WOOD));
    public static final Block STRIPPED_DARK_OAK_WOOD_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.WOOD, MapColor.OAK_TAN).strength(2.0f)
            .sounds(BlockSoundGroup.WOOD));

    public static final Block STRIPPED_CRIMSON_HYPHAE_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD, MapColor.DARK_CRIMSON)
            .strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block STRIPPED_CRIMSON_HYPHAE_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.NETHER_WOOD, MapColor.DARK_CRIMSON).strength(2.0f)
            .sounds(BlockSoundGroup.NETHER_STEM));

    public static final Block STRIPPED_WARPED_HYPHAE_STAIRS = new MoreLogStairBlock(
            OAK_STAIRS.getDefaultState(), FabricBlockSettings.of(Material.NETHER_WOOD, MapColor.DARK_DULL_PINK)
            .strength(2.0f).sounds(BlockSoundGroup.NETHER_STEM));
    public static final Block STRIPPED_WARPED_HYPHAE_SLAB = new SlabBlock(FabricBlockSettings.of(
                    Material.NETHER_WOOD, MapColor.DARK_DULL_PINK).strength(2.0f)
            .sounds(BlockSoundGroup.NETHER_STEM));


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oak_log_stairs"), OAK_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oak_log_slab"), OAK_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spruce_log_stairs"), SPRUCE_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spruce_log_slab"), SPRUCE_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birch_log_stairs"), BIRCH_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birch_log_slab"), BIRCH_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_log_stairs"), JUNGLE_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_log_slab"), JUNGLE_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "acacia_log_stairs"), ACACIA_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "acacia_log_slab"), ACACIA_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_oak_log_stairs"), DARK_OAK_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_oak_log_slab"), DARK_OAK_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "crimson_stem_stairs"), CRIMSON_STEM_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "crimson_stem_slab"), CRIMSON_STEM_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "warped_stem_stairs"), WARPED_STEM_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "warped_stem_slab"), WARPED_STEM_SLAB);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oak_wood_stairs"), OAK_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "oak_wood_slab"), OAK_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spruce_wood_stairs"), SPRUCE_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "spruce_wood_slab"), SPRUCE_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birch_wood_stairs"), BIRCH_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "birch_wood_slab"), BIRCH_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_wood_stairs"), JUNGLE_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "jungle_wood_slab"), JUNGLE_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "acacia_wood_stairs"), ACACIA_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "acacia_wood_slab"), ACACIA_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_oak_wood_stairs"), DARK_OAK_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_oak_wood_slab"), DARK_OAK_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "crimson_hyphae_stairs"), CRIMSON_HYPHAE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "crimson_hyphae_slab"), CRIMSON_HYPHAE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "warped_hyphae_stairs"), WARPED_HYPHAE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "warped_hyphae_slab"), WARPED_HYPHAE_SLAB);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_oak_log_stairs"), STRIPPED_OAK_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_oak_log_slab"), STRIPPED_OAK_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_spruce_log_stairs"), STRIPPED_SPRUCE_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_spruce_log_slab"), STRIPPED_SPRUCE_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_birch_log_stairs"), STRIPPED_BIRCH_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_birch_log_slab"), STRIPPED_BIRCH_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_jungle_log_stairs"), STRIPPED_JUNGLE_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_jungle_log_slab"), STRIPPED_JUNGLE_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_acacia_log_stairs"), STRIPPED_ACACIA_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_acacia_log_slab"), STRIPPED_ACACIA_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_dark_oak_log_stairs"), STRIPPED_DARK_OAK_LOG_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_dark_oak_log_slab"), STRIPPED_DARK_OAK_LOG_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_crimson_stem_stairs"), STRIPPED_CRIMSON_STEM_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_crimson_stem_slab"), STRIPPED_CRIMSON_STEM_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_warped_stem_stairs"), STRIPPED_WARPED_STEM_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_warped_stem_slab"), STRIPPED_WARPED_STEM_SLAB);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_oak_wood_stairs"), STRIPPED_OAK_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_oak_wood_slab"), STRIPPED_OAK_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_spruce_wood_stairs"), STRIPPED_SPRUCE_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_spruce_wood_slab"), STRIPPED_SPRUCE_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_birch_wood_stairs"), STRIPPED_BIRCH_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_birch_wood_slab"), STRIPPED_BIRCH_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_jungle_wood_stairs"), STRIPPED_JUNGLE_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_jungle_wood_slab"), STRIPPED_JUNGLE_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_acacia_wood_stairs"), STRIPPED_ACACIA_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_acacia_wood_slab"), STRIPPED_ACACIA_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_dark_oak_wood_stairs"), STRIPPED_DARK_OAK_WOOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_dark_oak_wood_slab"), STRIPPED_DARK_OAK_WOOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_crimson_hyphae_stairs"), STRIPPED_CRIMSON_HYPHAE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_crimson_hyphae_slab"), STRIPPED_CRIMSON_HYPHAE_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_warped_hyphae_stairs"), STRIPPED_WARPED_HYPHAE_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "stripped_warped_hyphae_slab"), STRIPPED_WARPED_HYPHAE_SLAB);
    }
}
