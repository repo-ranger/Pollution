package keqing.pollution.common;

import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.items.MetaItems;
import gregtech.common.metatileentities.MetaTileEntities;
import keqing.pollution.common.metatileentity.PollutionMetaTileEntities;

import static gregtech.api.unification.material.Materials.*;
import static gregtech.loaders.recipe.CraftingComponent.*;
import static gregtech.loaders.recipe.MetaTileEntityLoader.registerMachineRecipe;

public class recipes {
    public static void init() {
        Muffler();
    }

    private static void Muffler() {
        ModHandler.addShapedRecipe(true, "flux_clear1", PollutionMetaTileEntities.FLUX_CLEARS[1].getStackForm(),
                "CBC", "FMF", "CBC", 'M', MetaTileEntities.HULL[GTValues.EV].getStackForm(),
                'B', new UnificationEntry(OrePrefix.rotor, Titanium),
                'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.EV),
                'F', MetaItems.ELECTRIC_PUMP_EV);

        ModHandler.addShapedRecipe(true, "flux_clear2", PollutionMetaTileEntities.FLUX_CLEARS[2].getStackForm(),
                "CBC", "FMF", "CBC", 'M', MetaTileEntities.HULL[GTValues.IV].getStackForm(),
                'B', new UnificationEntry(OrePrefix.rotor, TungstenSteel),
                'C', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.IV),
                'F', MetaItems.ELECTRIC_PUMP_IV);


        ModHandler.removeRecipeByName("gregtech:gregtech.machine.muffler_hatch.lv");
        ModHandler.removeRecipeByName("gregtech:gregtech.machine.muffler_hatch.mv");
        ModHandler.removeRecipeByName("gregtech:gregtech.machine.muffler_hatch.hv");
        ModHandler.removeRecipeByName("gregtech:gregtech.machine.muffler_hatch.ev");
        ModHandler.removeRecipeByName("gregtech:gregtech.machine.muffler_hatch.iv");
        ModHandler.removeRecipeByName("gregtech:gregtech.machine.muffler_hatch.luv");
        ModHandler.removeRecipeByName("gregtech:gregtech.machine.muffler_hatch.zpm");
        ModHandler.removeRecipeByName("gregtech:gregtech.machine.muffler_hatch.uv");

        registerMachineRecipe(PollutionMetaTileEntities.FLUX_MUFFLERS, "HM", "PR",
                'H', HULL,
                'M', MOTOR,
                'P', PIPE_NORMAL,
                'R', ROTOR);

        registerMachineRecipe(PollutionMetaTileEntities.AURA_GENERATORS,
                "ABA", "CHC", "ABA",
                'H', HULL,
                'A', MOTOR,
                'B', PISTON,
                'C', ROTOR);

        registerMachineRecipe(PollutionMetaTileEntities.VIS_PROVIDERS,
                "ABA", "CHC", "ABA",
                'H', HULL,
                'A', MOTOR,
                'B', EMITTER,
                'C', ROTOR);

        registerMachineRecipe(PollutionMetaTileEntities.VIS_CLEAR,
                "ABA", "CHC", "ABA",
                'H', HULL,
                'A', MOTOR,
                'B', SENSOR,
                'C', ROTOR);

    }
}
