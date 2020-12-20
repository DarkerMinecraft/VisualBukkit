package com.gmail.visualbukkit.blocks.statements;

import com.gmail.visualbukkit.blocks.StatementBlock;
import com.gmail.visualbukkit.blocks.annotations.Description;

@Description("Saves the plugin config")
public class StatSavePluginConfig extends StatementBlock {

    public StatSavePluginConfig() {
        init("save plugin config");
    }

    @Override
    public String toJava() {
        return "PluginMain.getInstance().saveConfig();";
    }
}
