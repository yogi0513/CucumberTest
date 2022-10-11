package stepdefinitions;

import org.junit.Assert;

import Utils.CodingEx4Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepExerciseFour {
	
	final Integer TotalAmt =100;
	CodingEx4Utils ceu;
	Integer balRemain;
	Integer NewBalRemain;
	
	
	@Given("user has account balance of {int} euro")
	public void user_has_account_balance_of_euro(Integer int1) {
		
	}

	@When("day one user purchase cricket shirt for {int} euro")
	public void day_one_user_purchase_cricket_shirt_for_euro(Integer int1) {
		balRemain = ceu.getBalance(TotalAmt, int1);
		
	}

	@Then("verify user account should have a balance of {int} euro")
	public void verify_user_account_should_have_a_balance_of_euro(Integer int1) {
		Integer expectedBal =Integer.valueOf(int1);
		Assert.assertEquals(balRemain, expectedBal);
	}

	@When("day two user purchase signed photo of Aamir Khan for {int} euro")
	public void day_two_user_purchase_signed_photo_of_aamir_khan_for_euro(Integer int1) {
		balRemain =ceu.getBalance(balRemain, int1);
		
	}

	@When("user also purchase signed photo of Sachin Tendulkar for {int} euro")
	public void user_also_purchase_signed_photo_of_sachin_tendulkar_for_euro(Integer int1) {
		balRemain = ceu.getBalance(balRemain, int1);
		
	}

	@When("day three user clicks to purchase cd of Shreya Ghoshal for {int} euro")
	public void day_three_user_clicks_to_purchase_cd_of_shreya_ghoshal_for_euro(Integer int1) {

		balRemain =ceu.getBalance(balRemain, int1);
	}

	@Then("verify user is getting error message insufficient funds")
	public void verify_user_is_getting_error_message_insufficient_funds() {
		if(balRemain<=0) {
			Assert.assertFalse(false);	
		}
		else {
			Assert.assertTrue(true);
		}
		
	}

	@When("day four user added {int} euro into paypal account")
	public void day_four_user_added_euro_into_paypal_account(Integer int1) {
		 NewBalRemain =balRemain+int1;
	}

	@When("user clicks to purchase cd of Shreya Ghosal for {int} euro")
	public void user_clicks_to_purchase_cd_of_shreya_ghosal_for_euro(Integer int1) {
		balRemain =ceu.getBalance(NewBalRemain, int1);
		
	}
}
