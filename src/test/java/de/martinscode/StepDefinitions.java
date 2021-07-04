
package de.martinscode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    @Given("I have {int} somethings")
    public void i_have_n_somethings(int number) {
        System.out.format("Somethings: %n\n", number);
    }

    @Given("true is true")
    public void true_is_true() {
        assert(true);
    }

    int result = 0;

    @When("I add {int} and {int}")
    public void i_add_x_and_y(int x, int y) {
        result = x + y;
    }

    @Then("I expect {int} as result")
    public void i_expect_z_as_result(int z) {
        assertEquals(result, z);
    }
}
