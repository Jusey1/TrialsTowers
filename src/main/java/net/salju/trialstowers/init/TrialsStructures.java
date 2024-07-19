package net.salju.trialstowers.init;

import net.salju.trialstowers.worldgen.*;
import net.salju.trialstowers.TrialsMod;

import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.core.registries.Registries;


public class TrialsStructures {
	public static final DeferredRegister<StructureType<?>> REGISTRY = DeferredRegister.create(Registries.STRUCTURE_TYPE, TrialsMod.MODID);
	public static final RegistryObject<StructureType<TrialsChambers>> TRIALS = REGISTRY.register("trialschambers", () -> stuff(TrialsChambers.CODEC));

	private static <T extends Structure> StructureType<T> stuff(Codec<T> codec) {
		return () -> codec;
	}
}