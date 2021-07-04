
package de.martinscode;

import org.junit.runner.RunWith;
import org.junit.Test;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        // glue = {"stepdefs"},
        tags = ""
)
public class CucumberTest {
}


/* public class AppTest 
{
    /**
     * Rigorous Test :-)
     */ /*
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}  */
