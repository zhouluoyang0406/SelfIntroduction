package interpreter;

import java.util.HashMap;

public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
