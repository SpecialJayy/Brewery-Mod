package com.specialjayy.brewery.item;

import com.specialjayy.brewery.Brewery;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //pierszy item
    public static final Item BEER = registerItem("beer", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Brewery.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Brewery.LOGGER.info("Registering mod items for: " + Brewery.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(BEER);
        });
    }
}
