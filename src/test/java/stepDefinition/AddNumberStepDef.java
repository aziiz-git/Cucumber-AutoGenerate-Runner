package stepDefinition;

import cucumber.api.java.en.Then;

public class AddNumberStepDef 
{	
	int sum;
	
	@Then("^User add this two number$")
	public void user_add_this_two_number() throws Throwable 
	{
		sum = 100+300;
	}
	
	@Then("^User add this three number$")
	public void user_add_this_three_number() throws Throwable 
	{
		sum = 123+400+900;
	}
	
	@Then("^Print the sum$")
	public void print_the_sum() throws Throwable 
	{
		System.err.println("Sum is  :"+sum);
	}

}

//Test
