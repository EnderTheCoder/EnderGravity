package dev.ender.gravity;

import net.minecraft.util.math.vector.Vector3d;

public interface IGravity {
    public enum GravityState {
        NORMAL, UP, PX, MX, PZ, MZ
    }



    public void setState(GravityState gs);

    public GravityState getState();





    public Vector3d func_233626_a_(double p_233626_1_, boolean p_233626_3_, Vector3d p_233626_4_);
}
