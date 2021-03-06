package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiplyNumberStepDef 
{	
	int multiply;
	@When("^User enter the first number$")
	public void user_enter_the_first_number() throws Throwable 
	{
		System.out.println("Enter first number :"+14);
	}

	@When("^User enter the second number$")
	public void user_enter_the_second_number() throws Throwable 
	{
		System.out.println("Enter second number :"+24);
	}
	
	@When("^User enter the third number$")
	public void user_enter_the_third_number() throws Throwable 
	{
		System.out.println("Enter third number :"+34);
//		throw new PendingException(); // will consider it as pending step
	}
	
	@Then("^User multiply this two number$")
	public void user_multiply_this_two_number() throws Throwable 
	{
		multiply = 13*22;
	}
		
	@Then("^User multiply this three number$")
	public void user_multiply_this_three_number() throws Throwable 
	{
		multiply =11*22*32;
	}
	@Then("^Print the multiplication$")
	public void print_the_mulitply() throws Throwable 
	{
		System.err.println("Multiplication is  :"+multiply);
	}

}
