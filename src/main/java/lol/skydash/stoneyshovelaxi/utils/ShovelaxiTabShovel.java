package lol.skydash.stoneyshovelaxi.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ShovelaxiTabShovel extends CreativeTabs {

    public ShovelaxiTabShovel(String label) {
        super(label);
    }

    @Override
    public String getTranslatedTabLabel() {
        return "Stoney Shovelaxi";
    }

    @Override
    public Item getTabIconItem() {
        return Items.stone_shovel;
    }
}
