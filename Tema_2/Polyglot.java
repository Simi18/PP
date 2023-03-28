//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

class Polyglot {
    Polyglot() {
    }

    private static String RToUpper(String var0) {
        Context var1 = Context.newBuilder(new String[0]).allowAllAccess(true).build();
        Value var2 = var1.eval("R", "toupper(\"" + var0 + "\");");
        String var3 = var2.asString();
        var1.close();
        return var3;
    }

    private static int SumCRC(String var0) {
        Context var1 = Context.newBuilder(new String[0]).allowAllAccess(true).build();
        Value var2 = var1.eval("python", "sum(ord(ch) for ch in '" + var0 + "')");
        int var3 = var2.asInt();
        var1.close();
        return var3;
    }

    public static void main(String[] var0) {
        Context var1 = Context.create(new String[0]);
        Value var2 = var1.eval("js", "[\"If\",\"we\",\"run\",\"the\",\"java\",\"command\",\"included\",\"in\",\"GraalVM\",\"we\",\"will\",\"be\",\"automatically\",\"using\",\"the\",\"Graal\",\"JIT\",\"compiler\",\"no\",\"extra\",\"configuration\",\"is\",\"needed\",\"I\",\"will\",\"use\",\"the\",\"time\",\"command\",\"to\",\"get\",\"the\",\"real\",\"wall\",\"clock\",\"elapsed\",\"time\",\"it\",\"takes\",\"to\",\"run\",\"the\",\"entire\",\"program\",\"from\",\"start\",\"to\",\"finish\",\"rather\",\"than\",\"setting\",\"up\",\"a\",\"complicated\",\"micro\",\"benchmark\",\"and\",\"I\",\"will\",\"use\",\"a\",\"large\",\"input\",\"so\",\"that\",\"we\",\"arent\",\"quibbling\",\"about\",\"a\",\"few\",\"seconds\",\"here\",\"or\",\"there\",\"The\",\"large.txt\",\"file\",\"is\",\"150\",\"MB\"];");

        for(int var3 = 0; (long)var3 < var2.getArraySize(); ++var3) {
            String var4 = var2.getArrayElement((long)var3).asString();
            String var5 = RToUpper(var4);
            int var6 = SumCRC(var5);
            System.out.println(var5 + " -> " + var6);
        }

        var1.close();
    }
}
