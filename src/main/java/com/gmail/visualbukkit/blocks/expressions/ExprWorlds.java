package com.gmail.visualbukkit.blocks.expressions;

import java.util.List;

import com.gmail.visualbukkit.blocks.ExpressionBlock;
import com.gmail.visualbukkit.blocks.annotations.Description;

@Description("All worlds on the server")
@SuppressWarnings("rawtypes")
public class ExprWorlds extends ExpressionBlock<List> {

    public ExprWorlds() {
        init("all worlds");
    }

    @Override
    public String toJava() {
        return "Bukkit.getWorlds()";
    }
}