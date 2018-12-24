package interpreter;

import java.util.HashMap;

public abstract class Expression {
  abstract int interpreter(HashMap<String,Integer> var);
}
