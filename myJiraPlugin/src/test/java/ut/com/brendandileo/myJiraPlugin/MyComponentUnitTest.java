package ut.com.brendandileo.myJiraPlugin;

import org.junit.Test;
import com.brendandileo.myJiraPlugin.api.MyPluginComponent;
import com.brendandileo.myJiraPlugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {
    @Test
    public void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent", component.getName());
    }
}