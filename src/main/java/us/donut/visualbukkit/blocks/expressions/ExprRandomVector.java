package us.donut.visualbukkit.blocks.expressions;

import org.bukkit.util.Vector;
import us.donut.visualbukkit.blocks.ExpressionBlock;
import us.donut.visualbukkit.blocks.annotations.Description;
import us.donut.visualbukkit.blocks.syntax.SyntaxNode;

@Description("A random vector with components between 0 and 1")
public class ExprRandomVector extends ExpressionBlock<Vector> {

    @Override
    protected SyntaxNode init() {
        return new SyntaxNode("random vector");
    }

    @Override
    public String toJava() {
        return "org.bukkit.util.Vector.getRandom()";
    }
}