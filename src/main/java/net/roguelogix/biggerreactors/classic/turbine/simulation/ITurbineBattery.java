package net.roguelogix.biggerreactors.classic.turbine.simulation;

import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.INBTSerializable;

public interface ITurbineBattery extends INBTSerializable<CompoundNBT> {
    long extract(long toExtract);
    
    long stored();
    
    long capacity();
}