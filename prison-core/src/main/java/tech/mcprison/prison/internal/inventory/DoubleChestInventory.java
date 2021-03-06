/*
 *  Prison is a Minecraft plugin for the prison game mode.
 *  Copyright (C) 2017 The Prison Team
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package tech.mcprison.prison.internal.inventory;

/**
 * Represents an inventory created by a {@link tech.mcprison.prison.internal.block.DoubleChest}
 *
 * @author Dylan M. Perks
 * @since API 0.1
 */
public interface DoubleChestInventory {

    /**
     * Gets the {@link Inventory} of the left Chest
     *
     * @return a container inventory for the left chest
     */
    Inventory getLeftSide();

    /**
     * Gets the {@link Inventory} of the right Chest
     *
     * @return a container inventory for the right chest
     */
    Inventory getRightSide();

}
