package lol.skydash.stoneyshovelaxi.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import lol.skydash.stoneyshovelaxi.StoneyShovelaxi;
import lol.skydash.stoneyshovelaxi.tools.StoneyShovelaxiShovel;
import lol.skydash.stoneyshovelaxi.utils.Reference;

import java.util.Collections;

public class RegisterItems {

    // items
    public static Item stoneyShovelaxi;

    public static Item.ToolMaterial STONEY_TOOLS_MATERIAL = EnumHelper
        .addToolMaterial("STONEY_TOOLS_MATERIAL", 2, 660, 4.0F, 3.0F, 30);

    public static void init() {
        // Kit tools
        stoneyShovelaxi = new StoneyShovelaxiShovel(RegisterItems.STONEY_TOOLS_MATERIAL)
            .setUnlocalizedName("Stoney Shovelaxi")
            .setCreativeTab(StoneyShovelaxi.StoneyShovelaxiTab)
            .setTextureName(Reference.MOD_ID + ":stoneyshovelaxi");

    }

    // register items/blocks + make recipes
    public static void register() {
        // register names
        GameRegistry.registerItem(stoneyShovelaxi, "stoneyshovelaxi");

        GameRegistry.addRecipe(
            new ItemStack(stoneyShovelaxi, 1),
            " MB",
            "CSM",
            "SC ",
            'S',
            Items.stick,
            'C',
            Blocks.cobblestone,
            'M',
            Blocks.stone,
            'B',
            Items.flint);
    }
}
