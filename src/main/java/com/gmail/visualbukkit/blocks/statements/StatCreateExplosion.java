package com.gmail.visualbukkit.blocks.statements;

import com.gmail.visualbukkit.blocks.StatementBlock;
import com.gmail.visualbukkit.blocks.annotations.Category;
import com.gmail.visualbukkit.blocks.annotations.Description;
import org.bukkit.Location;

@Category(Category.WORLD)
@Description("Creates an explosion at a location")
public class StatCreateExplosion extends StatementBlock {

    public StatCreateExplosion() {
        init("create explosion");
        initLine("location:     ", Location.class);
        initLine("power:        ", float.class);
        initLine("make fire:    ", boolean.class);
        initLine("break blocks: ", boolean.class);
    }

    @Override
    public String toJava() {
        return arg(0) + ".getWorld().createExplosion(" + arg(0) + "," + arg(1) + "," + arg(2) + "," + arg(3) + ");";
    }
}
