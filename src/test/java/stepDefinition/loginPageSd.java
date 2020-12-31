package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginPageSd {

    @Given("^I am at messanger login page$")
    public void iAmOnAdminLoginPage(){

    }
    @When("^I enter karsimail1@gmail.com into the username on the messanger page$")
    public void enterDataUserAndPassFailed(String antText, String textField){

        switch(textField){
            case "username":
                //
                break;
            case "password":
                //
                break;
        }

    }

}
