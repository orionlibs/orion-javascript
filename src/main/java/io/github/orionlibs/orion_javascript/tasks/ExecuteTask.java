package io.github.orionlibs.orion_javascript.tasks;

import io.github.orionlibs.orion_assert.Assert;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExecuteTask
{
    public static Object run(String JavaScriptCodeToExecute) throws ScriptException
    {
        Assert.notEmpty(JavaScriptCodeToExecute, "JavaScriptCodeToExecute cannot be null/empty.");
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("javascript");
        return engine.eval(JavaScriptCodeToExecute);
    }
}