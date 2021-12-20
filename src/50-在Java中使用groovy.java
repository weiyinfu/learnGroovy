import groovy.lang.Binding;
import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import groovy.util.Eval;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

class Main {
    static class Rectangle {
        int x;
        int y;

        Rectangle() {
            x = 3;
            y = 4;
        }
    }

    static void groovyShell() {
        GroovyShell shell = new GroovyShell();
//可以绑定更多变量
        shell.setVariable("age", 22);
//直接求值
        shell.evaluate("if(age < 18){'未成年'}else{'成年'}");
//解析为脚本，延迟执行或者缓存起来
        Script script = shell.parse("if(age < 18){'未成年'}else{'成年'}");
        assertEquals(script.run(), "成年");
//可以从更多位置加载/执行脚本
//shell.evaluate(new File("script.groovy"));
//shell.evaluate(new URI("http://wwww.a.com/script.groovy"));
    }

    static void groovyClassLoader() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        GroovyClassLoader groovyClassLoader = new GroovyClassLoader();
        String scriptText = "class Hello { void hello() { println 'hello' } }";
        //将Groovy脚本解析为Class对象
        Class clazz = groovyClassLoader.parseClass(scriptText);
        //Class clazz = groovyClassLoader.parseClass(new File("script.groovy"));
        assertEquals(clazz.getName(), "Hello");
        clazz.getMethod("hello").invoke(clazz.newInstance());
    }

    static void scriptEngine() throws ScriptException, ResourceException, InterruptedException, IOException {
        GroovyScriptEngine scriptEngine = new GroovyScriptEngine("script/groovy");
        Binding binding = new Binding();
        binding.setVariable("name", "groovy");
        while (true) {
            scriptEngine.run("hello.groovy", binding);
            TimeUnit.SECONDS.sleep(1);
        }
    }

    static void groovyEval() {
        //执行Groovy代码
        Eval.me("println 'hello world'");
//绑定自定义参数
        Object result = Eval.me("age", 22, "if(age < 18){'未成年'}else{'成年'}");
        var area = Eval.me("rec", new Rectangle(), "rec.x*rec.y");
        System.out.println("面积为" + area);
        assertEquals(result, "成年");
//绑定一个名为 x 的参数的简单计算
        assertEquals(Eval.x(4, "2*x"), 8);
//带有两个名为 x 与 y 的绑定参数的简单计算
        assertEquals(Eval.xy(4, 5, "x*y"), 20);
//带有三个绑定参数（x、y 和 z）的简单计算
        assertEquals(Eval.xyz(4, 5, 6, "x*y+z"), 26);
    }

    public static void main(String[] args) {

    }

    private static void assertEquals(Object result, Object x) {
        assert result.equals(x);
    }
}