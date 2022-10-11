package stepdefinitions;

import org.testng.Assert;

import Utils.CodingEx3Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepExerciseThree {
	
	CodingEx3Utils ceu;
	Double dayOnePizzaPrice;
	Integer dayOneIceCreamPrice;
	Integer TotalChickenChips;
	Integer TotalIceCream;
	Integer TotalBiryani;
	
	@Given("user has purchase limit {int} euro per day")
	public void user_has_purchase_limit_euro_per_day(Integer int1) {
		ceu = new CodingEx3Utils();
	}

	@When("day one user purchase {int} pizza at {double} each")
	public void day_one_user_purchase_pizza_at_each(Integer int1, Double double1) {
		dayOnePizzaPrice =ceu.calTotalPrice(int1, double1);
		
	}

	@When("user purchase {int} cube of ice cream at {int} each")
	public void user_purchase_cube_of_ice_cream_at_each(Integer int1, Integer int2) {
		dayOneIceCreamPrice =ceu.calTotalPrice(int1, int2);
		
	}

	@Then("verify that total amount should not exceed {int} euro")
	public void verify_that_total_amount_should_not_exceed_euro(Integer int1) {
	    Double TotalAmount = dayOnePizzaPrice+dayOneIceCreamPrice;
	    boolean result;
	    if(TotalAmount<=50) {
	    	result =true;
	    }
	    else {
			result = false;
		}
	    
	    Assert.assertEquals(result, true);
	    
	}

	@When("day two user purchase {int} buckets of chicken at {int} each")
	public void day_two_user_purchase_buckets_of_chicken_at_each(Integer int1, Integer int2) {
	 TotalChickenChips = ceu.calTotalPrice(int1, int2);
		
	}


	@When("user also purchase {int} tubs of ice cream at {int} each")
	public void user_also_purchase_tubs_of_ice_cream_at_each(Integer int1, Integer int2) {
		TotalIceCream = ceu.calTotalPrice(int1, int2);
	}

	@When("day three user purchase {int} biryani at {int} each")
	public void day_three_user_purchase_biryani_at_each(Integer int1, Integer int2) {
	    TotalBiryani = ceu.calTotalPrice(int1, int2);
	}
	
}
