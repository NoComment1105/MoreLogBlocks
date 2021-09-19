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

package io.github.nocomment1105.morelogblocks;

import io.github.nocomment1105.morelogblocks.registry.BlockRegistry;
import io.github.nocomment1105.morelogblocks.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;

public class MoreLogBlocks implements ModInitializer {

    public static final String MOD_ID = "morelogblocks";

    @Override
    public void onInitialize() {
        BlockRegistry.registerBlocks();
        ItemRegistry.registerItems();
    }
}
