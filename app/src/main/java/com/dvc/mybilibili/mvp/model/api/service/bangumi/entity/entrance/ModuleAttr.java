package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

//

@Keep
////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/ModuleAttr;", "", "random", "", "header", "follow", "(ZZZ)V", "getFollow", "()Z", "setFollow", "(Z)V", "getHeader", "setHeader", "getRandom", "setRandom", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class ModuleAttr {
    private boolean follow;
    private boolean header;
    private boolean random;

    public ModuleAttr() {
        this(false, false, false, 7);
    }

    @NotNull
    public static /* synthetic */ ModuleAttr copy$default(ModuleAttr moduleAttr, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = moduleAttr.random;
        }
        if ((i & 2) != 0) {
            z2 = moduleAttr.header;
        }
        if ((i & 4) != 0) {
            z3 = moduleAttr.follow;
        }
        return moduleAttr.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.random;
    }

    public final boolean component2() {
        return this.header;
    }

    public final boolean component3() {
        return this.follow;
    }

    @NotNull
    public final ModuleAttr copy(boolean z, boolean z2, boolean z3) {
        return new ModuleAttr(z, z2, z3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ModuleAttr) {
            ModuleAttr moduleAttr = (ModuleAttr) obj;
            if ((this.random == moduleAttr.random ? 1 : null) != null) {
                if ((this.header == moduleAttr.header ? 1 : null) != null) {
                    if ((this.follow == moduleAttr.follow ? 1 : null) != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.random?1:0;
        int i2 = 1;
        i *= 31;
        int i3 = this.header?1:0;
        i = (i + i3) * 31;
        boolean z = this.follow;
        if (!z) {
            i2 = z?1:0;
        }
        return i + i2;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ModuleAttr(random=");
        stringBuilder.append(this.random);
        stringBuilder.append(", header=");
        stringBuilder.append(this.header);
        stringBuilder.append(", follow=");
        stringBuilder.append(this.follow);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ModuleAttr(boolean z, boolean z2, boolean z3) {
        this.random = z;
        this.header = z2;
        this.follow = z3;
    }

    public final boolean getRandom() {
        return this.random;
    }

    public final void setRandom(boolean z) {
        this.random = z;
    }

    public final boolean getHeader() {
        return this.header;
    }

    public final void setHeader(boolean z) {
        this.header = z;
    }

    public /* synthetic */ ModuleAttr(boolean z, boolean z2, boolean z3, int i) {
        this(z, z2, z3);
    }

    public final boolean getFollow() {
        return this.follow;
    }

    public final void setFollow(boolean z) {
        this.follow = z;
    }
}
